import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;

/**
 *  �������� ������� � ������� Elements
 */
@Epic("�������� �� ������� Elements")
public class elementsTest extends BaseTest {
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
    @Description("���������  ������ Text Box")
    @DisplayName("1.���������  ������ Text Box")
    public void openTextBox () {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Text Box");
        elementsPage.clickButtonTextBox();
        Allure.step("��������� ���������� ������� Text Box");
        $x("//*[@id='userName']").shouldBe(Condition.visible);
        $x("//*[@id='userEmail']").shouldBe(Condition.visible);
        $x("//*[@id='currentAddress']").shouldBe(Condition.visible);
        $x("//*[@id='permanentAddress']").shouldBe (Condition.visible);
        $x("//button[@id='submit']").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("��������� ������ ������� Text Box")
    @DisplayName("2.��������� ������ ������� Text Box")
    public void workTextBox () {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Text Box");
        elementsPage.clickButtonTextBox();
        Allure.step("��������� ���� Full Name");
        elementsPage.fullName();
        Allure.step("��������� ���� Email");
        elementsPage.email();
        Allure.step("��������� ���� Current  Address");
        elementsPage.currentAddress();
        Allure.step("��������� ���� Permanent Address");
        elementsPage.permanentAddress();
        Allure.step("�������� ������  Sumbit");
        elementsPage.clickButtonSubmit();
    }
    @Test
    @Owner("osipov_vr")
    @Description("���������  ������ Check Box")
    @DisplayName("3.���������  ������ Check Box")
    public void openCheckBox () {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Check Box");
        elementsPage.clickButtonCheckBox();
        Allure.step("��������� ���������� ������� Check Box");
        $x("//span[text()='Home']").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("�������� ������ ������� Check Box")
    @DisplayName("4.�������� ������ ������� Check Box")
    public void workCheckBox () throws InterruptedException {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Check Box");
        elementsPage.clickButtonCheckBox();
        Allure.step("���������� ����� Home");
        elementsPage.clickHome();
        Thread.sleep(30);
        Allure.step("���������� ����� Desktop");
        elementsPage.clickDesktop();
        Thread.sleep(30);
        Allure.step("���������� ����� Documents");
        elementsPage.clickDocuments();
        Thread.sleep(30);
        Allure.step("���������� ����� Downloads");
        elementsPage.clickDownloads();
        Thread.sleep(30);
        Allure.step("���������� ���-���� � ����� Desktop");
        elementsPage.clickCheckBoxDesktop();
        Thread.sleep(30);
        Allure.step("��������� ���-���� � ����� Desktop");
        elementsPage.clickCheckBoxDesktop();
        Thread.sleep(30);
        Allure.step("���������� ���-���� � ����� Documents");
        elementsPage.clickCheckBoxDocuments();
        Thread.sleep(30);
        Allure.step("��������� ���-���� � ����� Documents");
        elementsPage.clickCheckBoxDocuments();
        Thread.sleep(30);
        Allure.step("���������� ���-���� � ����� Downloads");
        elementsPage.clickCheckBoxDownloads();
        Thread.sleep(30);
        Allure.step("��������� ���-���� � ����� Downloads");
        elementsPage.clickCheckBoxDownloads();
        Thread.sleep(30);
        Allure.step("���������� ���-���� � ����� Home");
        elementsPage.clickCheckBoxHome();
        Thread.sleep(30);
        Allure.step("��������� ���-���� � ����� Home");
        elementsPage.clickCheckBoxHome();
        Thread.sleep(30);
    }
    @Test
    @Owner("osipov_vr")
    @Description("���������  ������ Radio Button")
    @DisplayName("5.���������  ������ Radio Button")
    public void openRadioButton () {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Radio Button ");
        elementsPage.clickRadioButton();
        Allure.step("��������� ���������� ������� Radio Button");
        $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/label").shouldBe(Condition.visible);
        $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/label").shouldBe(Condition.visible);
        $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[4]/label").shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("�������� ������ ������� Radio Button")
    @DisplayName("6.�������� ������ ������� Radio Button")
    public void workRadioButton () throws InterruptedException {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Radio Button");
        elementsPage.clickRadioButton();
        Allure.step("������� � Yes");
        elementsPage.clickYes();
        String Yes = elementsPage.afterClick();
        String Yes1 = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/p/span").getText();
        Assertions.assertTrue(Yes.contains(Yes1));
        Thread.sleep(150);
        Allure.step("������� � Impressive");
        elementsPage.clickImpressive();
        String Impressive = elementsPage.afterClick();
        String Impressive1 = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/p/span").getText();
        Assertions.assertTrue(Impressive.contains(Impressive1));
        Thread.sleep(150);
        Allure.step("������� � No");
        elementsPage.clickNo();
        String No = elementsPage.afterClick();
        String No1 = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/p/span").getText();
        Assertions.assertTrue(No.contains(No1));
    }
    @Test
    @Owner("osipov_vr")
    @Description("���������  ������ Web Tables")
    @DisplayName("7.���������  ������ Web Tables")
    public void openWebTables() {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Web Tables ");
        elementsPage.clickWebTables();
        Allure.step("��������� ���������� ������� Web Tables");
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
    }
    @Test
    @Owner("osipov_vr")
    @Description("����� ������� � ������� Web Tables")
    @DisplayName("8.����� ������� � ������� Web Tables")
    public void searchWebTables() {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Web Tables ");
        elementsPage.clickWebTables();
        Allure.step("������ �������� � ������");
        elementsPage.searchWebTables(search);
        Allure.step("��������� ������������ ��������");
        $$x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]").shouldHave(texts(search));
    }
    @Test
    @Owner("osipov_vr")
    @Description("�������������� ������� � ������� Web Tables")
    @DisplayName("8.�������������� ������� � ������� Web Tables")
    public void editWebTables()  {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Web Tables ");
        elementsPage.clickWebTables();
        Allure.step("�������  �� ������ ��������������");
        elementsPage.editWebTables();
        Allure.step("�������� ��������  ������");
        elementsPage.sendKeysWebTables(NAME, LAST_NAME, EMAIL, AGE , SALARY, DEPARTMENT);
        Allure.step("������������ ���������");
        elementsPage.clickButtonSubmit();
        Allure.step("��������� �������� ������ ����� ��������������");
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
    }
    @Test
    @Owner("osipov_vr")
    @Description("���������� ������� � ������� Web Tables")
    @DisplayName("9.���������� ������� � ������� Web Tables")
    public void newWebTables() {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Web Tables ");
        elementsPage.clickWebTables();
        String [] actualTables = elementsPage.getTables();
        Allure.step("�������  �� ������ Add");
        elementsPage.newWebTables();
        Allure.step("��������� ���� ������");
        elementsPage.sendKeysWebTables(NAME, LAST_NAME, EMAIL, AGE , SALARY, DEPARTMENT);
        Allure.step("������������ ��������");
        elementsPage.clickButtonSubmit();
        Allure.step("��������� �������� ������ ����� ��������");
        String [] expectedTables = elementsPage.getTables();
        Assertions.assertNotEquals(actualTables, expectedTables);
    }
    @Test
    @Owner("osipov_vr")
    @Description("�������� ������� � ������� Web Tables")
    @DisplayName("10.�������� ������� � ������� Web Tables")
    public void deleteWebTables() {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Web Tables ");
        elementsPage.clickWebTables();
        String [] actualTables = elementsPage.getTables();
        Allure.step("�������  �� ������ ��������");
        elementsPage.deleteWebTables();
        Allure.step("��������� ��� ������ ���������");
        String [] expectedTables = elementsPage.getTables();
        Assertions.assertNotEquals(actualTables,expectedTables);
    }
    @Test
    @Owner("osipov_vr")
    @Description("���������  ������ Buttons")
    @DisplayName("11.���������  ������ Buttons")
    public void openButtons() {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Buttons");
        elementsPage.clickButtons();
        Allure.step("��������� ���������� ������� Buttons");
        elementsPage.checkButtons();
    }
    @Test
    @Owner("osipov_vr")
    @Description("�������� �������� �����")
    @DisplayName("12.�������� �������� �����")
    public void checkDoubleClick() {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Buttons");
        elementsPage.clickButtons();
        Allure.step("������ ������� ���� �� �������������� ������");
        elementsPage.checkDoubleClick();
        String message = $x("//*[@id='doubleClickMessage']").getOwnText();
        Assertions.assertEquals(message, "You have done a double click");
    }
    @Test
    @Owner("osipov_vr")
    @Description("�������� ������� �����")
    @DisplayName("13.�������� ������� �����")
    public void checkRightClick() {
        Allure.step("��������� ������� ��������");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("��������� �� ������� Elements");
        elementsPage.clickElements();
        Allure.step("��������� ������ Buttons");
        elementsPage.clickButtons();
        Allure.step("������ ������ ���� �� �������������� ������");
        elementsPage.checkRightClick();
        String message = $x("//*[@id='rightClickMessage']").getOwnText();
        Assertions.assertEquals(message, "You have done a right click");
    }
}
