package UI.Tests.Tests;

import UI.Tests.Pages.AFWPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

@Epic("Проверки на вкладке Alerts, Frame & Windows")
public class AWFTest extends BaseTest {
    private final static String homeURL = "http://85.192.34.140:8081/";
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Открываем  вкладку Alerts, Frame & Windows")
    @DisplayName("1.Открываем  вкладку Alerts, Frame & Windows")
    public void openWidgets () {
        AFWPage page  = new AFWPage();
        Allure.step("Открываем главную страницу",
                ()-> page.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Alerts, Frame & Windows",
                ()->page
                        .getButtonAFW()
                        .click());
        Allure.step("Проверяем содержимое раздела Alerts, Frame & Windows",
                ()-> {
                    page
                            .getButtonBrowserWindows()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonAlerts()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonFrames()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonNestedFrames()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonModalDialogs()
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("Открываем  раздел Browser Windows")
    @DisplayName("2.Открываем  раздел Browser Windows")
    public void openBrowserWindows() {
        AFWPage page  = new AFWPage();
        Allure.step("Открываем главную страницу",
                ()-> page.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Alerts, Frame & Windows",
                ()-> page
                        .getButtonAFW()
                        .click());
        Allure.step("Переходим в раздел раздел Browser Windows",
                ()-> page
                            .getButtonBrowserWindows()
                            .click());
        Allure.step("Проверяем содержание раздела Browser Windows",
                ()->  {
                    page
                            .getButtonNewTab()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonNewWindow()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonNewWindowMessage()
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(3)
    @Description("Проверяем работу кнопок в  Browser Windows")
    @DisplayName("3.Проверяем работу кнопок в  Browser Windows")
    public void workBrowserWindows() {
        AFWPage page  = new AFWPage();
        Allure.step("Открываем главную страницу",
                ()-> page.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Alerts, Frame & Windows",
                ()-> page
                        .getButtonAFW()
                        .click());
        Allure.step("Переходим в раздел раздел Browser Windows",
                ()-> page
                        .getButtonBrowserWindows()
                        .click());
        Allure.step("Нажимаем на  кнопку New Tab",
                ()->  {
                    page
                            .getButtonNewTab()
                            .click();
                    Allure.step("Проверяем что открылась новая влкдака в браузере",
                            ()-> {
                                switchTo().window(1);
                                $x("//*[@id=\"sampleHeading\"]").shouldBe(Condition.visible);
                                closeWindow();
                                switchTo().window(0);
                    });
                });
        Allure.step("Нажимаем на  кнопку New Window",
                ()->  {
                    page
                            .getButtonNewWindow()
                            .click();
                    Allure.step("Проверяем что открылось новое окно",
                            ()-> {
                                switchTo().window(1);
                                $x("//*[@id=\"sampleHeading\"]").shouldBe(Condition.visible);
                                closeWindow();
                                switchTo().window(0);
                            });
                });
        Allure.step("Нажимаем на  кнопку New Window Message",
                ()->  {
                    page
                            .getButtonNewWindowMessage()
                            .click();
                    Allure.step("Проверяем что открылось сообщение",
                            ()-> {
                                switchTo().window(1);
                                closeWindow();
                                switchTo().window(0);
                            });
                });
    }
}
