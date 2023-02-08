package Tests;

import Pages.formsPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

@Epic("Проверки на вкладке Forms")
public class FormsTest extends BaseTest {
    private final static String homeURL = "http://85.192.34.140:8081/";
    private long generateRandomNumber () {
        Random Random = new Random();
        return Random.nextLong();
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем  раздел Practice Form")
    @DisplayName("1.Открываем  раздел Practice Form")
    public void openTextBox () {
        Allure.step("Открываем главную страницу");
        formsPage formsPage = new formsPage(homeURL);
        Allure.step("Переходим на вкладку Forms");
        formsPage.openForms();
        Allure.step("Открываем раздел Practice Form");
        formsPage.openPracticeForm();
        Allure.step("Проверяем содержимое раздела Practice Form");
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
    @Description("Проверяем что в поле Mobile вводиться не больше 10 символов")
    @DisplayName("2.Проверяем что в поле Mobile вводиться не больше 10 символов")
    public void checkFieldMobile () {
        Allure.step("Открываем главную страницу");
        formsPage formsPage = new formsPage(homeURL);
        Allure.step("Переходим на вкладку Forms");
        formsPage.openForms();
        Allure.step("Открываем раздел Practice Form");
        formsPage.openPracticeForm();
        Allure.step("Вводим в поле Mobile больше 10 цифр");
        String randomNumber = String.valueOf(generateRandomNumber());
        formsPage.checkFieldMobile(randomNumber);
        Allure.step("Провряем что в поле только 10 цифр");
        String results = formsPage.getFieldMobile().getAttribute("value");
        Assertions.assertNotEquals(randomNumber,results);
    }
    @Test
    @Owner("osipov_vr") // надо сделать
    @Description("Проверяем работы датапикера")
    @DisplayName("3.Проверяем работу датапикера")
    public void workDataPicker () {
        Allure.step("Открываем главную страницу");
        formsPage formsPage = new formsPage(homeURL);
        Allure.step("Переходим на вкладку Forms");
        formsPage.openForms();
        Allure.step("Открываем раздел Practice Form");
        formsPage.openPracticeForm();
        Allure.step("Открываем дата-пикер");
        Allure.step("Устанаволиваем значение = текущая дата - 1 год");
        Allure.step("Проверярем отображения значения");
    }
}
