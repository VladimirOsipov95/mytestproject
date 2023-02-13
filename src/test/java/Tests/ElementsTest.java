package Tests;

import Pages.ElementsPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;

/**
 *  �������� ������� � ������� Elements
 */
@Epic("�������� �� ������� Elements")
public class ElementsTest extends BaseTest {
    private final static String homeURL = "http://85.192.34.140:8081/";
    private final static String search = "Alden";
    private final static String NAME = "Vladimir";
    private final static String LAST_NAME = "Osipov";
    private final static int AGE = 25;
    private final static String EMAIL = "volodka10@yandex.ru";
    private final static int SALARY = 12000;
    private final static String DEPARTMENT = "Legal";

    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("���������  ������ Text Box")
    @DisplayName("1.���������  ������ Text Box")
    public void openTextBox () {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Text Box",
                elementsPage::clickButtonTextBox);
        Allure.step("��������� ���������� ������� Text Box",
                ()-> {
                    elementsPage.getFullName().shouldBe(Condition.visible);
                    elementsPage.getEmail().shouldBe(Condition.visible);
                    elementsPage.getCurrentAddress().shouldBe(Condition.visible);
                    elementsPage.getPermanentAddress().shouldBe (Condition.visible);
                    elementsPage.getButtonSubmit().shouldBe(Condition.visible);
                });

    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("��������� ������ ������� Text Box")
    @DisplayName("2.��������� ������ ������� Text Box")
    public void workTextBox () {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Text Box",
                elementsPage::clickButtonTextBox);
        Allure.step("��������� ���� Full Name",
                elementsPage::fullName);
        Allure.step("��������� ���� Email",
                elementsPage::email);
        Allure.step("��������� ���� Current  Address",
                elementsPage::currentAddress);
        Allure.step("��������� ���� Permanent Address",
                elementsPage::permanentAddress);
        Allure.step("�������� ������  Submit",
                elementsPage::clickButtonSubmit);
    }
    @Test
    @Owner("osipov_vr")
    @Order(3)
    @Description("���������  ������ Check Box")
    @DisplayName("3.���������  ������ Check Box")
    public void openCheckBox () {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Check Box",
                elementsPage::clickButtonCheckBox);
        Allure.step("��������� ���������� ������� Check Box",
                ()->elementsPage.getHome().shouldBe(Condition.visible));
    }
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("�������� ������ ������� Check Box")
    @DisplayName("4.�������� ������ ������� Check Box")
    public void workCheckBox () throws InterruptedException {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Check Box",
                elementsPage::clickButtonCheckBox);
        Allure.step("���������� ����� Home",
                ()->{
                    elementsPage.clickHome();
                    Thread.sleep(30);
                });
        Allure.step("���������� ����� Desktop",
                ()-> {
                    elementsPage.clickDesktop();
                    Thread.sleep(30);
                });
        Allure.step("���������� ����� Documents",
                ()->{
                    elementsPage.clickDocuments();
                    Thread.sleep(30);
                });
        Allure.step("���������� ����� Downloads",
                ()->{
                    elementsPage.clickDownloads();
                    Thread.sleep(30);
                });
        Allure.step("���������� ���-���� � ����� Desktop",
                ()->{
                    elementsPage.clickCheckBoxDesktop();
                    Thread.sleep(30);
                });
        Allure.step("��������� ���-���� � ����� Desktop",
                ()-> {
                    elementsPage.clickCheckBoxDesktop();
                    Thread.sleep(30);
                });

        Allure.step("���������� ���-���� � ����� Documents",
                ()->{
                    elementsPage.clickCheckBoxDocuments();
                    Thread.sleep(30);
                });

        Allure.step("��������� ���-���� � ����� Documents",
                ()->{
                    elementsPage.clickCheckBoxDocuments();
                    Thread.sleep(30);
                });
        Allure.step("���������� ���-���� � ����� Downloads",
                ()->{
                    elementsPage.clickCheckBoxDownloads();
                    Thread.sleep(30);
                });

        Allure.step("��������� ���-���� � ����� Downloads",
                ()->{
                    elementsPage.clickCheckBoxDownloads();
                    Thread.sleep(30);
                });
        Allure.step("���������� ���-���� � ����� Home",
                ()->{
                    elementsPage.clickCheckBoxHome();
                    Thread.sleep(30);
                });
        Allure.step("��������� ���-���� � ����� Home",
                elementsPage::clickCheckBoxHome);
    }
    @Test
    @Owner("osipov_vr")
    @Order(5)
    @Description("���������  ������ Radio Button")
    @DisplayName("5.���������  ������ Radio Button")
    public void openRadioButton () {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Radio Button",
                elementsPage::clickRadioButton);
        Allure.step("��������� ���������� ������� Radio Button",
                ()->{
                    elementsPage.getButtonYes().shouldBe(Condition.visible);
                    elementsPage.getButtonImpressive().shouldBe(Condition.visible);
                    elementsPage.getButtonNo().shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(6)
    @Description("�������� ������ ������� Radio Button")
    @DisplayName("6.�������� ������ ������� Radio Button")
    public void workRadioButton () throws InterruptedException {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Radio Button",
                elementsPage::clickRadioButton);
        Allure.step("������� � Yes",
                ()-> {
                    elementsPage.clickYes();
                    String Yes = elementsPage.afterClick();
                    String Yes1 = elementsPage.getAfterClickRadio().getText();
                    Assertions.assertTrue(Yes.contains(Yes1));
                    Thread.sleep(150);
                });
        Allure.step("������� � Impressive",
                ()->{
                    elementsPage.clickImpressive();
                    String Impressive = elementsPage.afterClick();
                    String Impressive1 = elementsPage.getAfterClickRadio().getText();
                    Assertions.assertTrue(Impressive.contains(Impressive1));
                    Thread.sleep(150);
                });
        Allure.step("������� � No",
                ()-> {
                    elementsPage.clickNo();
                    String No = elementsPage.afterClick();
                    String No1 = elementsPage.getAfterClickRadio().getText();
                    Assertions.assertTrue(No.contains(No1));
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(7)
    @Description("���������  ������ Web Tables")
    @DisplayName("7.���������  ������ Web Tables")
    public void openWebTables() {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Web Tables",
                elementsPage::clickWebTables);
        Allure.step("��������� ���������� ������� Web Tables",
                ()->{
                    $x("//*[@id='addNewRecordButton']").shouldBe(Condition.visible);
                    $x("//*[@id='searchBox']").shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[2]/span[1]/div/input").shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[2]/span[2]/select").shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[1]/div[1]").shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[1]").shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[3]").shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[4]/div[1]").shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[5]/div[1]").shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div[1]").shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[7]/div[1]").shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(8)
    @Description("����� ������� � ������� Web Tables")
    @DisplayName("8.����� ������� � ������� Web Tables")
    public void searchWebTables() {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Web Tables ",
                elementsPage::clickWebTables);
        Allure.step("������ �������� � ������",
                ()->elementsPage.searchWebTables(search));
        Allure.step("��������� ������������ ��������",
                ()->$$x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]").shouldHave(texts(search)));
    }
    @Test
    @Owner("osipov_vr")
    @Order(9)
    @Description("�������������� ������� � ������� Web Tables")
    @DisplayName("9.�������������� ������� � ������� Web Tables")
    public void editWebTables()  {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Web Tables ",
                elementsPage::clickWebTables);
        Allure.step("�������  �� ������ ��������������",
                elementsPage::editWebTables);
        Allure.step("�������� ��������  ������",
                ()->elementsPage.sendKeysWebTables(NAME, LAST_NAME, EMAIL, AGE , SALARY, DEPARTMENT));
        Allure.step("������������ ���������",
                elementsPage::clickButtonSubmit);
        Allure.step("��������� �������� ������ ����� ��������������",
                ()->{
                    String ACTUAL_FIRST_NAME = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[1]").getText();
                    String ACTUAL_LAST_NAME = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[2]").getText();
                    int ACTUAL_AGE = Integer.parseInt($x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[3]").getText());
                    String ACTUAL_EMAIL = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[4]").getText();
                    int ACTUAL_SALARY = Integer.parseInt($x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[5]").getText());
                    String ACTUAL_DEPARTMENT = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[6]").getText();
                    Assertions.assertEquals(NAME, ACTUAL_FIRST_NAME);
                    Assertions.assertEquals(LAST_NAME, ACTUAL_LAST_NAME);
                    Assertions.assertEquals(AGE, ACTUAL_AGE);
                    Assertions.assertEquals(EMAIL, ACTUAL_EMAIL);
                    Assertions.assertEquals(SALARY, ACTUAL_SALARY);
                    Assertions.assertEquals(DEPARTMENT, ACTUAL_DEPARTMENT);
                });
    }
    @Test
    @Owner("osipov_vr")// ��������, ��� ����� ���������� �� ������ �����
    @Order(10)
    @Description("���������� ������� � ������� Web Tables")
    @DisplayName("10.���������� ������� � ������� Web Tables")
    public void newWebTables() {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Web Tables ");
        elementsPage.clickWebTables();
        String [] actualTables = elementsPage.getTables();
        Allure.step("�������  �� ������ Add",
                elementsPage::newWebTables);
        Allure.step("��������� ���� ������",
                ()->elementsPage.sendKeysWebTables(NAME, LAST_NAME, EMAIL, AGE , SALARY, DEPARTMENT));
        Allure.step("������������ ��������",
                elementsPage::clickButtonSubmit);
        Allure.step("��������� �������� ������ ����� ��������");
        String [] expectedTables = elementsPage.getTables();
        Assertions.assertNotEquals(actualTables, expectedTables);
    }
    @Test
    @Owner("osipov_vr")
    @Order(11)
    @Description("�������� ������� � ������� Web Tables")
    @DisplayName("11.�������� ������� � ������� Web Tables")
    public void deleteWebTables() {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Web Tables ");
        elementsPage.clickWebTables();
        String [] actualTables = elementsPage.getTables();
        Allure.step("�������  �� ������ ��������",
                elementsPage::deleteWebTables);
        Allure.step("��������� ��� ������ ���������");
        String [] expectedTables = elementsPage.getTables();
        Assertions.assertNotEquals(actualTables,expectedTables);
    }
    @Test
    @Owner("osipov_vr")
    @Order(12)
    @Description("���������  ������ Buttons")
    @DisplayName("12.���������  ������ Buttons")
    public void openButtons() {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Buttons",
                elementsPage::clickButtons);
        Allure.step("��������� ���������� ������� Buttons",
                elementsPage::checkButtons);
    }
    @Test
    @Owner("osipov_vr")
    @Order(13)
    @Description("�������� �������� �����")
    @DisplayName("13.�������� �������� �����")
    public void checkDoubleClick() throws InterruptedException {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Buttons",
                ()->{
                    elementsPage.clickButtons();
                    Thread.sleep(3000);
                });

        Allure.step("������ ������� ���� �� �������������� ������",
                ()->{
                    elementsPage.checkDoubleClick();
                    String message = $x("//*[@id='doubleClickMessage']").getOwnText();
                    Assertions.assertEquals(message, "You have done a double click");
                });

    }
    @Test
    @Owner("osipov_vr")
    @Order(14)
    @Description("�������� ������� �����")
    @DisplayName("14.�������� ������� �����")
    public void checkRightClick() throws InterruptedException {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Buttons",
                ()->{
                    elementsPage.clickButtons();
                    Thread.sleep(3000);
                });
        Allure.step("������ ������ ���� �� �������������� ������",
                ()->{
                    elementsPage.checkRightClick();
                    String message = $x("//*[@id='rightClickMessage']").getOwnText();
                    Assertions.assertEquals(message, "You have done a right click");
                });

    }
    @Test
    @Owner("osipov_vr")
    @Order(15)
    @Description("���������  ������ Links")
    @DisplayName("15.���������  ������ Links")
    public void openLinks() {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Links",
                elementsPage::clickButtonLinks);
        Allure.step("��������� ���������� ������� Links",
                elementsPage::checkLinks);
    }
    @Test
    @Owner("osipov_vr")
    @Order(16)
    @Description("���������  ����� �������")
    @DisplayName("16.���������  ����� �������")
    public void openNewWindows() {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Links",
                elementsPage::clickButtonLinks);
        Allure.step("������� �� ����� Home",
                elementsPage::clickNewWindowLinks);
        Allure.step("��������� ��� ��������� ����� ����",
                ()->{
                    switchTo().window(1);
                    $x("//h5[text()='Elements']").shouldBe(Condition.visible);
                    $x("//h5[text()='Forms']").shouldBe(Condition.visible);
                    $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
                    $x("//h5[text()='Widgets']").shouldBe(Condition.visible);
                    $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
                    $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
                    closeWindow();
                });

    }
    @Test
    @Owner("osipov_vr")
    @Order(17)
    @Description("���������  ������ Upload and Download")
    @DisplayName("17.���������  ������ Upload and Download")
    public void openUploadAndDownload() {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Upload and Download",
                elementsPage::openUploadAndDownload);
        Allure.step("��������� ���������� ������� Upload and Download",
                elementsPage::checkUploadAndDownload);
    }
    @Test
    @Owner("osipov_vr")
    @Order(18)
    @Description("��������� ����")
    @DisplayName("18.��������� ����")
    public void Download() {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Upload and Download",
                elementsPage::openUploadAndDownload);
        Allure.step("�������� �� ������ Download � ��������� ��� ���� ��������",
                ()->{
                    String result = elementsPage.clickDownload();
                    Assertions.assertEquals(result,"sticker.png");
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(19)
    @Description("��������� ����")
    @DisplayName("19.��������� ����")
    public void Upload()  {
        ElementsPage elementsPage = new ElementsPage();
        Allure.step("��������� ������� ��������",
                ()-> elementsPage.openMainPage(homeURL));
        Allure.step("��������� �� ������� Elements",
                elementsPage::clickElements);
        Allure.step("��������� ������ Upload and Download",
                elementsPage::openUploadAndDownload);
        Allure.step("�������� �� ������ Upload",
                elementsPage::clickUpload);
        Allure.step("��������� ��� ���� ����������",
                ()->$x("//*[@id='uploadedFilePath']").shouldBe(Condition.visible));
    }
}
