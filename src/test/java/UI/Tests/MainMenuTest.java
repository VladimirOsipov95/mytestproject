package UI.Tests;

import UI.Pages.MainPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$x;
/**
 * Проверка открытия  вкладок в главном меню
 */
@Epic("Проверки перехода по разделам из главного меню")
public class MainMenuTest extends BaseTest {
    MainPage page = new MainPage();
    @BeforeEach
    public void startPage () {
        Allure.step("Открываем главную страницу",
                ()->page.openMainPage(homeURL));
        Allure.step("Проверяем наличие всех пунктов меню на главной странице",
                ()-> {
                    page
                            .getButtonElements()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonForms()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonAFW()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonWidgets()
                            .shouldBe (Condition.visible);
                    page
                            .getButtonInteractions()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonGSA()
                            .shouldBe(Condition.visible);
                });
    }
    private final static String homeURL = "http://85.192.34.140:8081/";
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Elements")
    @DisplayName("1.Открываем вкладку Elements")
    public void openElements()  {
        Allure.step("Кликаем на поле Elements",
                ()-> page
                        .getButtonElements()
                        .click());
        Allure.step("Проверяем наличие всех разделов в Elements",
                ()-> {
                    $x("//span[text()='Text Box']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Check Box']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Radio Button']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Web Tables']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Buttons']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Links']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Broken Links - Images']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Upload and Download']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Dynamic Properties']")
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Forms")
    @DisplayName("2.Открываем вкладку Forms")
    public void openForms()  {
        Allure.step("Кликаем на поле Forms",
                ()->page
                        .getButtonForms()
                        .click());
        Allure.step("Проверяем наличие всех разделов в Forms",
                ()->$x("//span[text()='Practice Form']")
                        .shouldBe(Condition.visible));
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Alerts, Frame & Windows")
    @DisplayName("3.Открываем вкладку Alerts, Frame & Windows")
    public void openAFM ()  {
        Allure.step("Кликаем на поле Alerts, Frame & Windows",
                ()->page
                        .getButtonAFW()
                        .click());
        Allure.step("Проверяем наличие всех разделов в Alerts, Frame & Windows",
                ()-> {
                    $x("//span[text()='Browser Windows']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Alerts']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Frames']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Nested Frames']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Modal Dialogs']")
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Widgets")
    @DisplayName("4.Открываем вкладку Widgets")
    public void openWidgets () {
        Allure.step("Кликаем на поле Widgets",
                ()-> page
                        .getButtonWidgets()
                        .click());
        Allure.step("Проверяем наличие всех разделов в Widgets",
                ()-> {
                    $x("//span[text()='Accordian']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Auto Complete']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Date Picker']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Slider']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Progress Bar']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Tabs']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Tool Tips']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Menu']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Select Menu']")
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Interactions")
    @DisplayName("5.Открываем вкладку Interactions")
    public void openInteractions ()  {
        Allure.step("Кликаем на поле Interactions",
                ()-> page
                        .getButtonInteractions()
                        .click());
        Allure.step("Проверяем наличие всех разделов в Interactions",
                ()->{
                    $x("//span[text()='Sortable']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Selectable']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Resizable']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Droppable']")
                            .shouldBe(Condition.visible);
                    $x("//span[text()='Dragabble']")
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Game Store Application")
    @DisplayName("6.Открываем вкладку Game Store Application")
    public void openGSA () {
        Allure.step("Кликаем на поле Game Store Application",
                ()->page
                        .getButtonGSA()
                        .click());
        Allure.step("Проверяем наличие всех разделов в Game Store Application",
                ()->$x("//span[text()='Link Page']")
                        .shouldBe(Condition.visible));
    }
}
