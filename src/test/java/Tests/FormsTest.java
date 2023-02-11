package Tests;

import Pages.formsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$x;


@Epic("�������� �� ������� Forms")
public class FormsTest extends BaseTest {
    private final static String homeURL = "http://85.192.34.140:8081/";
    private final SelenideElement selectState = $x("//div[contains(text(),'NCR')]");
    private final SelenideElement selectCity = $x("//div[contains(text(),'Delhi')]");

    private long generateRandomNumber () {
        Random Random = new Random();
        return Random.nextLong();
    }
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("���������  ������ Practice Form")
    @DisplayName("1.���������  ������ Practice Form")
    public void openTextBox () {
        Allure.step("��������� ������� ��������");
        formsPage formsPage = new formsPage(homeURL);
        Allure.step("��������� �� ������� Forms");
        formsPage.openForms();
        Allure.step("��������� ������ Practice Form");
        formsPage.openPracticeForm();
        Allure.step("��������� ���������� ������� Practice Form");
        formsPage.getLabelPracticeForm().shouldBe(Condition.visible);
        formsPage.getFieldFirstName().shouldBe(Condition.visible);
        formsPage.getFieldLastName().shouldBe(Condition.visible);
        formsPage.getFieldEmail().shouldBe(Condition.visible);
        formsPage.getRadioButtonGender().shouldBe(Condition.visible);
        formsPage.getFieldMobile().shouldBe(Condition.visible);
        formsPage.getFieldDateOfBrith().shouldBe(Condition.visible);
        formsPage.getFieldSubjects().shouldBe(Condition.visible);
        formsPage.getCheckBoxHobbies().shouldBe(Condition.visible);
        formsPage.getButtonSelectPicture().shouldBe(Condition.visible);
        formsPage.getFieldCurrentAddress().shouldBe(Condition.visible);
        formsPage.getSelectState().shouldBe(Condition.visible);
        formsPage.getSelectCity().shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("��������� ��� � ���� Mobile ��������� �� ������ 10 ��������")
    @DisplayName("2.��������� ��� � ���� Mobile ��������� �� ������ 10 ��������")
    public void checkFieldMobile () {
        Allure.step("��������� ������� ��������");
        formsPage formsPage = new formsPage(homeURL);
        Allure.step("��������� �� ������� Forms");
        formsPage.openForms();
        Allure.step("��������� ������ Practice Form");
        formsPage.openPracticeForm();
        Allure.step("������ � ���� Mobile ������ 10 ����");
        String randomNumber = String.valueOf(generateRandomNumber());
        formsPage.checkFieldMobile(randomNumber);
        Allure.step("�������� ��� � ���� ������ 10 ����");
        String results = formsPage.getFieldMobile().getAttribute("value");
        Assertions.assertNotEquals(randomNumber,results);
    }
    @Test
    @Owner("osipov_vr")
    @Order(3)
    @Description("��������� ������ ����������")
    @DisplayName("3.��������� ������ ����������")
    public void workDataPicker () {
        Allure.step("��������� ������� ��������");
        formsPage formsPage = new formsPage(homeURL);
        Allure.step("��������� �� ������� Forms");
        formsPage.openForms();
        Allure.step("��������� ������ Practice Form");
        formsPage.openPracticeForm();
        Allure.step("��������� ����-�����");
        formsPage.getFieldDateOfBrith().click();
        Allure.step("�������������� �������� = ������� ���� - 20 ���");
        String dateFormat = "dd MMM yyyy";
        String expectedDate =LocalDateTime.now().minusYears(20).format(DateTimeFormatter.ofPattern(dateFormat).localizedBy(Locale.US));
        formsPage.getFieldDateOfBrith().sendKeys(Keys.chord(Keys.CONTROL, "a"));
        formsPage.getFieldDateOfBrith().sendKeys(expectedDate);
        formsPage.getFieldDateOfBrith().sendKeys(Keys.ENTER);
        Allure.step("���������� ����������� ��������");
        Assertions.assertEquals(expectedDate, formsPage.getFieldDateOfBrith().getValue());
    }
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("��������� ������ ��������")
    @DisplayName("4.��������� ������ ��������")
    public void workSelected () {
        Allure.step("��������� ������� ��������");
        formsPage formsPage = new formsPage(homeURL);
        Allure.step("��������� �� ������� Forms");
        formsPage.openForms();
        Allure.step("��������� ������ Practice Form");
        formsPage.openPracticeForm();
        Allure.step("��������� ��� ���� Select City ���������� ��� ������");
        formsPage.getSelectCity().shouldBe(Condition.editable);
        Allure.step("�������������� �������� � Select State");
        formsPage.getSelectState().click();
        selectState.click();
        Allure.step("���������� ��� ���� Select City �������� ��� ��������������");
        formsPage.getSelectCity().click();
        Allure.step("������������� �������� Select City");
        selectCity.click();
        formsPage.getFieldMobile().click();
        Allure.step("��������� ��� � �������� ������������� ���� ��������");
        Assertions.assertEquals("NCR", formsPage.getSelectState().getText());
        Assertions.assertEquals("Delhi", formsPage.getSelectCity().getText());
    }
}
