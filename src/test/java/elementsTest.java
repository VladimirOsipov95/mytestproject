import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$x;
/**
 *  �������� ������� � ������� Elements
 */
@Epic("�������� �� ������� Elements")
public class elementsTest extends BaseTest {
    private final static String homeURL = "http://85.192.34.140:8081/";
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
    @Test // ���� ������� �������� �����������
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
        elementsPage.searchWebTables();
        Allure.step("��������� ������������ ��������");
    }
    @Test // ���� ������� ��������
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
        elementsPage.sendKeysWebTables("Vladimir", "Osipov", "volodka10@yandex.ru", 25 , 12000, "Moscow");
        Allure.step("������������ ���������");
        elementsPage.clickButtonSubmit();
        Allure.step("��������� �������� ������ ����� ��������������");
    }
    @Test // ���� ������� ��������
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
        Allure.step("�������  �� ������ Add");
        elementsPage.newWebTables();
        Allure.step("��������� ���� ������");
        elementsPage.sendKeysWebTables("Vladimir", "Osipov", "volodka10@yandex.ru", 25 , 12000, "Moscow");
        Allure.step("������������ ��������");
        elementsPage.clickButtonSubmit();
        Allure.step("��������� �������� ������ ����� ��������");
    }
    @Test // ���� �������
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
        Allure.step("�������  �� ������ ��������");
        elementsPage.deleteWebTables();
        Allure.step("��������� ��� ������ ���������");
    }
}
