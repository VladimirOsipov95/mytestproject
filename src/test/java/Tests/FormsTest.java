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


@Epic("Проверки на вкладке Forms")
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
    @Order(2)
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
    @Owner("osipov_vr")
    @Order(3)
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
        formsPage.getFieldDateOfBrith().click();
        Allure.step("Устанаволиваем значение = текущая дата - 20 лет");
        String dateFormat = "dd MMM yyyy";
        String expectedDate =LocalDateTime.now().minusYears(20).format(DateTimeFormatter.ofPattern(dateFormat).localizedBy(Locale.US));
        formsPage.getFieldDateOfBrith().sendKeys(Keys.chord(Keys.CONTROL, "a"));
        formsPage.getFieldDateOfBrith().sendKeys(expectedDate);
        formsPage.getFieldDateOfBrith().sendKeys(Keys.ENTER);
        Allure.step("Проверярем отображения значения");
        Assertions.assertEquals(expectedDate, formsPage.getFieldDateOfBrith().getValue());
    }
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("Проверяем работы селектов")
    @DisplayName("4.Проверяем работу селектов")
    public void workSelected () {
        Allure.step("Открываем главную страницу");
        formsPage formsPage = new formsPage(homeURL);
        Allure.step("Переходим на вкладку Forms");
        formsPage.openForms();
        Allure.step("Открываем раздел Practice Form");
        formsPage.openPracticeForm();
        Allure.step("Проверяем что поле Select City недоступно для выбора");
        formsPage.getSelectCity().shouldBe(Condition.editable);
        Allure.step("Устанаволиваем значение в Select State");
        formsPage.getSelectState().click();
        selectState.click();
        Allure.step("Проверярем что поле Select City доступно для редактирования");
        formsPage.getSelectCity().click();
        Allure.step("Устанавливаем значение Select City");
        selectCity.click();
        formsPage.getFieldMobile().click();
        Allure.step("Проверяем что в селектах установленные нами значения");
        Assertions.assertEquals("NCR", formsPage.getSelectState().getText());
        Assertions.assertEquals("Delhi", formsPage.getSelectCity().getText());
    }
}
