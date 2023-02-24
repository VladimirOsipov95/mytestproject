package UI.Tests;

import UI.Pages.GameStoreApplicationPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;

@Epic("Проверки на вкладке Game Store Application")
public class GameStoreApplicationTest extends BaseTest {
    GameStoreApplicationPage page = new GameStoreApplicationPage();
    @BeforeEach
    public void startPage (){
        Allure.step("Открываем главную страницу",
                () -> page.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Game Store Application",
                ()->page
                        .getButtonGSA()
                        .click());
    }
    private final static String homeURL = "http://85.192.34.140:8081/";
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Открываем  вкладку Game Store Application")
    @DisplayName("1.Открываем  вкладку Game Store Application")
    public void openGSA () {
        Allure.step("Проверяем содержимое раздела Widgets",
                ()-> page
                            .getButtonLinkPage()
                            .shouldBe(Condition.visible));
    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("Открываем  раздел Link Page")
    @DisplayName("2.Открываем  раздел Link Page")
    public void openLinkPage () {

        Allure.step("Переходим в раздел  Link Page",
                () -> page
                        .getButtonLinkPage()
                        .click());
        Allure.step("Проверяем содреждание раздела Link Page",
                () -> {
                    page
                            .getTextLinkPage()
                            .shouldBe(Condition.visible)
                            .shouldBe(Condition.text("Follow the link to visit Game Store Application"));
                    page
                            .getLinkLinkPage()
                            .shouldBe(Condition.visible)
                            .shouldBe(Condition.enabled);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(3)
    @Description("Проверяем  раздел Link Page")
    @DisplayName("3.Проверяем  раздел Link Page")
    public void workLinkPage () {
        Allure.step("Переходим в раздел  Link Page",
                () -> page
                        .getButtonLinkPage()
                        .click());
        Allure.step("Кликаем на Link",
                () -> {
                    String link = page.getLinkLinkPage().getAttribute("href");
                    assert link != null;
                    Selenide.open(link);
                    Allure.step("Проверяем что выполнен переход по Link",
                            () -> {
                                String actualURL = WebDriverRunner.url();
                                Assertions.assertEquals(link, actualURL );
                            });
                });
    }
}
