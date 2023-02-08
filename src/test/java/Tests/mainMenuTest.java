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
 * �������� ��������  ������� � ������� ����
 */
@Epic("�������� �������� �� �������� �� �������� ����")
public class mainMenuTest <should> extends BaseTest {
    private final static String homeURL = "http://85.192.34.140:8081/";
    @Test
    @Owner("osipov_vr")
    @Description("��������� ������� Elements")
    @DisplayName("1.��������� ������� Elements")
    public void openElements() throws InterruptedException {
        Allure.step("��������� ������� ��������");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("��������� ������� ���� ������� ���� �� ������� ��������");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe (Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("������� �� ���� Elements");
        mainPage.clickButtonElments();
        Thread.sleep(150);
        Allure.step("��������� ������� ���� �������� � Elements");
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
    @Description("��������� ������� Forms")
    @DisplayName("2.��������� ������� Forms")
    public void openForms() throws InterruptedException {
        Allure.step("��������� ������� ��������");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("��������� ������� ���� ������� ���� �� ������� ��������");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe (Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("������� �� ���� Forms");
        mainPage.clickButtonFroms();
        Thread.sleep(150);
        Allure.step("��������� ������� ���� �������� � Froms");
        $x("//span[text()='Practice Form']").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("��������� ������� Alerts, Frame & Windows")
    @DisplayName("3.��������� ������� Alerts, Frame & Windows")
    public void openAFM () throws InterruptedException {
        Allure.step("��������� ������� ��������");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("��������� ������� ���� ������� ���� �� ������� ��������");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe(Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("������� �� ���� Alerts, Frame & Windows");
        mainPage.clickButtonAFW();
        Thread.sleep(150);
        Allure.step("��������� ������� ���� �������� � Alerts, Frame & Windows");
        $x("//span[text()='Browser Windows']").shouldBe(Condition.visible);
        $x("//span[text()='Alerts']").shouldBe(Condition.visible);
        $x("//span[text()='Frames']").shouldBe(Condition.visible);
        $x("//span[text()='Nested Frames']").shouldBe(Condition.visible);
        $x("//span[text()='Modal Dialogs']").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("��������� ������� Widgets")
    @DisplayName("4.��������� ������� Widgets")
    public void openWidgets () throws InterruptedException {
        Allure.step("��������� ������� ��������");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("��������� ������� ���� ������� ���� �� ������� ��������");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe(Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("������� �� ���� Widgets");
        mainPage.clickButtonWidgets();
        Thread.sleep(150);
        Allure.step("��������� ������� ���� �������� � Widgets");
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
    @Description("��������� ������� Interactions")
    @DisplayName("5.��������� ������� Interactions")
    public void openInteractions () throws InterruptedException {
        Allure.step("��������� ������� ��������");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("��������� ������� ���� ������� ���� �� ������� ��������");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe(Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("������� �� ���� Interactions");
        mainPage.clickButtonInteractions();
        Thread.sleep(150);
        Allure.step("��������� ������� ���� �������� � Interactions");
        $x("//span[text()='Sortable']").shouldBe(Condition.visible);
        $x("//span[text()='Selectable']").shouldBe(Condition.visible);
        $x("//span[text()='Resizable']").shouldBe(Condition.visible);
        $x("//span[text()='Droppable']").shouldBe(Condition.visible);
        $x("//span[text()='Dragabble']").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("��������� ������� Game Store Application")
    @DisplayName("6.��������� ������� Game Store Application")
    public void openGSA () throws InterruptedException {
        Allure.step("��������� ������� ��������");
        mainPage mainPage = new mainPage(homeURL);
        Thread.sleep(150);
        Allure.step("��������� ������� ���� ������� ���� �� ������� ��������");
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe(Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        Allure.step("������� �� ���� Game Store Application");
        mainPage.clickButtonGSA();
        Allure.step("��������� ������� ���� �������� � Game Store Application");
        $x("//span[text()='Link Page']").shouldBe(Condition.visible);
    }
}
