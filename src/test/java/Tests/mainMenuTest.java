package Tests;

import Pages.mainPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$x;
/**
 * Проверка открытия  вкладок в главном меню
 */
@Epic("Проверки перехода по разделам из главного меню")
public class mainMenuTest <should> extends BaseTest {
    private final static String homeURL = "http://85.192.34.140:8081/";
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Elements")
    @DisplayName("1.Открываем вкладку Elements")
    public void openElements() throws InterruptedException {
        Allure.step("Открываем главную страницу");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех пунктов меню на главной странице");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe (Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("Кликаем на поле Elements");
        mainPage.clickButtonElments();
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех разделов в Elements");
        $x("//span[text()='Text Box']").shouldBe(Condition.visible);
        $x("//span[text()='Check Box']").shouldBe(Condition.visible);
        $x("//span[text()='Radio Button']").shouldBe(Condition.visible);
        $x("//span[text()='Web Tables']").shouldBe(Condition.visible);
        $x("//span[text()='Buttons']").shouldBe(Condition.visible);
        $x("//span[text()='Links']").shouldBe(Condition.visible);
        $x("//span[text()='Broken Links - Images']").shouldBe(Condition.visible);
        $x("//span[text()='Upload and Download']").shouldBe(Condition.visible);
        $x("//span[text()='Dynamic Properties']").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Forms")
    @DisplayName("2.Открываем вкладку Forms")
    public void openForms() throws InterruptedException {
        Allure.step("Открываем главную страницу");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех пунктов меню на главной странице");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe (Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("Кликаем на поле Forms");
        mainPage.clickButtonFroms();
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех разделов в Froms");
        $x("//span[text()='Practice Form']").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Alerts, Frame & Windows")
    @DisplayName("3.Открываем вкладку Alerts, Frame & Windows")
    public void openAFM () throws InterruptedException {
        Allure.step("Открываем главную страницу");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех пунктов меню на главной странице");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe(Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("Кликаем на поле Alerts, Frame & Windows");
        mainPage.clickButtonAFW();
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех разделов в Alerts, Frame & Windows");
        $x("//span[text()='Browser Windows']").shouldBe(Condition.visible);
        $x("//span[text()='Alerts']").shouldBe(Condition.visible);
        $x("//span[text()='Frames']").shouldBe(Condition.visible);
        $x("//span[text()='Nested Frames']").shouldBe(Condition.visible);
        $x("//span[text()='Modal Dialogs']").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Widgets")
    @DisplayName("4.Открываем вкладку Widgets")
    public void openWidgets () throws InterruptedException {
        Allure.step("Открываем главную страницу");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех пунктов меню на главной странице");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe(Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("Кликаем на поле Widgets");
        mainPage.clickButtonWidgets();
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех разделов в Widgets");
        $x("//span[text()='Accordian']").shouldBe(Condition.visible);
        $x("//span[text()='Auto Complete']").shouldBe(Condition.visible);
        $x("//span[text()='Date Picker']").shouldBe(Condition.visible);
        $x("//span[text()='Slider']").shouldBe(Condition.visible);
        $x("//span[text()='Progress Bar']").shouldBe(Condition.visible);
        $x("//span[text()='Tabs']").shouldBe(Condition.visible);
        $x("//span[text()='Tool Tips']").shouldBe(Condition.visible);
        $x("//span[text()='Menu']").shouldBe(Condition.visible);
        $x("//span[text()='Select Menu']").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Interactions")
    @DisplayName("5.Открываем вкладку Interactions")
    public void openInteractions () throws InterruptedException {
        Allure.step("Открываем главную страницу");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех пунктов меню на главной странице");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe(Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("Кликаем на поле Interactions");
        mainPage.clickButtonInteractions();
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех разделов в Interactions");
        $x("//span[text()='Sortable']").shouldBe(Condition.visible);
        $x("//span[text()='Selectable']").shouldBe(Condition.visible);
        $x("//span[text()='Resizable']").shouldBe(Condition.visible);
        $x("//span[text()='Droppable']").shouldBe(Condition.visible);
        $x("//span[text()='Dragabble']").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем вкладку Game Store Application")
    @DisplayName("6.Открываем вкладку Game Store Application")
    public void openGSA () throws InterruptedException {
        Allure.step("Открываем главную страницу");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("Проверяем наличие всех пунктов меню на главной странице");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe(Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("Кликаем на поле Game Store Application");
        mainPage.clickButtonGSA();
        Allure.step("Проверяем наличие всех разделов в Game Store Application");
        $x("//span[text()='Link Page']").shouldBe(Condition.visible);
    }
}
