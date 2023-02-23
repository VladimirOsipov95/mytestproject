package UI.Tests.Tests;

import UI.Tests.Pages.AFWPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
/**
 * Проверка работы разделов на вкладке Alerts, Frame & Windows
 */
@Epic("Проверки на вкладке Alerts, Frame & Windows")
public class AWFTest extends BaseTest {
    AFWPage page  = new AFWPage();
    @BeforeEach
    public void startPage () {
        Allure.step("Открываем главную страницу",
                ()-> page.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Alerts, Frame & Windows",
                ()->page
                        .getButtonAFW()
                        .click());
    }
    private final static String homeURL = "http://85.192.34.140:8081/";
    private final static String message = "Name";
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Открываем  вкладку Alerts, Frame & Windows")
    @DisplayName("1.Открываем  вкладку Alerts, Frame & Windows")
    public void openWidgets () {
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
                                $x("//*[@id=\"sampleHeading\"]")
                                        .shouldBe(Condition.visible);
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
                                $x("//*[@id=\"sampleHeading\"]")
                                        .shouldBe(Condition.visible);
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
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("Открываем  раздел Alerts")
    @DisplayName("4.Открываем  раздел Alerts")
    public void openAlerts() {
        Allure.step("Переходим в раздел раздел Alerts",
                ()-> page
                        .getButtonAlerts()
                        .click());
        Allure.step("Проверяем содержание раздела Alerts",
                ()->  {
                    page
                            .getAlertButton()
                            .shouldBe(Condition.visible);
                    page
                            .getTimerAlertButton()
                            .shouldBe(Condition.visible);
                    page
                            .getConfirmButton()
                            .shouldBe(Condition.visible);
                    page
                            .getPromptButton()
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(5)
    @Description("Проверяем работу Alerts")
    @DisplayName("5.Проверяем работу Alerts")
    public void workAlerts() {
        Allure.step("Переходим в раздел раздел Alerts",
                ()-> page
                        .getButtonAlerts()
                        .click());
        Allure.step("Проверяем работу Alerts",
                ()->  {
                    Allure.step("Нажимаем на  кнопку Click Button to see alert",
                            ()-> {
                                page
                                        .getAlertButton()
                                        .click();
                                Allure.step("Проверяем что Alert открылся и закрываем его",
                                        () -> Selenide.switchTo().alert().accept());
                            });
                    Allure.step("Нажимаем на  кнопку On button click, alert will appear after 5 seconds",
                            ()-> {
                                page
                                        .getTimerAlertButton()
                                        .click();
                                Allure.step("Проверяем что Alert открылся и закрываем его",
                                        () -> Selenide.switchTo().alert(Duration.ofSeconds(5)).accept());
                            });
                    Allure.step("Нажимаем на  кнопку On button click, confirm box will appear",
                            ()-> {
                                page
                                        .getConfirmButton()
                                        .click();
                                Allure.step("Проверяем что Alert открылся и закрываем его",
                                        () -> {
                                    Selenide.switchTo().alert().dismiss();
                                            Allure.step("Проверяем что на форме появлися соотвестующий текст",
                                                    () -> $x("//*[@id=\"confirmResult\"]")
                                                            .shouldHave(Condition.text("You selected Cancel")));

                                        });
                            });
                    Allure.step("Нажимаем на  кнопку On button click, prompt box will appear",
                            ()-> {
                                page
                                        .getPromptButton()
                                        .click();
                                Allure.step("Проверяем что Alert открылся и закрываем его",
                                        () -> {
                                    Selenide.switchTo().alert().sendKeys(message);
                                    Selenide.switchTo().alert().accept();
                                            Allure.step("Проверяем что на форме появлися соотвестующий текст",
                                                    () -> $x("//*[@id=\"promptResult\"]")
                                                            .shouldHave(Condition.text("You entered "+message)));
                                        });
                            });
        });
    }
}
