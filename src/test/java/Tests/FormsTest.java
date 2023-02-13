package Tests;

import Pages.FormsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;


import static com.codeborne.selenide.Selenide.*;

@Epic("Проверки на вкладке Forms")
public class FormsTest extends BaseTest  {
    private final static String homeURL = "http://85.192.34.140:8081/";
    private final SelenideElement selectState = $x("//div[contains(text(),'NCR')]");
    private final SelenideElement selectCity = $x("//div[contains(text(),'Delhi')]");
    private final ElementsCollection selectRadio= $$x("//input[@type='radio']");
    private final ElementsCollection selectBox = $$x("//*[@id=\"hobbiesWrapper\"]/div[2]/div | //input[contains(@id,'hobbies-checkbox')]");
    private final SelenideElement studentName = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[1/td[2]");
    private final SelenideElement studentEmail = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[2/td[2]");
    public String dateFormat = "dd MMM yyyy";
    public String expectedDate =LocalDateTime.now().minusYears(20).format(DateTimeFormatter.ofPattern(dateFormat).localizedBy(Locale.US));
    public String randomNumber = String.valueOf(generateRandomNumber());
    private final String firstName = "Vladimir";
    private final String lastName = "Osipov";
    private final String email = "volodka10@yandex.ru";
    private final String currentAddress = "Moscow";
    private long generateRandomNumber () {
        Random Random = new Random(1000000000);
        return Random.nextLong();
    }
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Открываем  раздел Practice Form")
    @DisplayName("1.Открываем  раздел Practice Form")
    public void openPracticeForms () {
        FormsPage formsPage = new FormsPage();
        Allure.step("Открываем главную страницу",
                ()-> formsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Forms",
                formsPage::openForms);
        Allure.step("Открываем раздел Practice Form",
                formsPage::openPracticeForm);
        Allure.step("Проверяем содержимое раздела Practice Form",
                ()-> {
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
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("Проверяем что в поле Mobile вводиться не больше 10 символов")
    @DisplayName("2.Проверяем что в поле Mobile вводиться не больше 10 символов")
    public void checkFieldMobile () {
        FormsPage formsPage = new FormsPage();
        Allure.step("Открываем главную страницу",
                ()-> formsPage.openMainPage(homeURL));
        Allure.step("Переходим на кладку Forms",
                formsPage::openForms);
        Allure.step("Открываем раздел Practice Form",
                formsPage::openPracticeForm);
        Allure.step("Вводим в поле Mobile больше 10 цифр",
                ()-> formsPage.checkFieldMobile(randomNumber));
        Allure.step("Провряем что в поле только 10 цифр",
                ()-> {
                    String results = formsPage.getFieldMobile().getAttribute("value");
                    Assertions.assertNotEquals(randomNumber,results);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(3)
    @Description("Проверяем работы датапикера")
    @DisplayName("3.Проверяем работу датапикера")
    public void workDataPicker () {
        FormsPage formsPage = new FormsPage();
        Allure.step("Открываем главную страницу",
                ()-> formsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Forms",
                formsPage::openForms);
        Allure.step("Открываем раздел Practice Form",
                formsPage::openPracticeForm);
        Allure.step("Открываем дата-пикер",
                ()->formsPage
                        .getFieldDateOfBrith()
                        .click());
        Allure.step("Устанаволиваем значение = текущая дата - 20 лет",
                ()-> {
                    formsPage
                            .getFieldDateOfBrith()
                            .sendKeys(Keys.chord(Keys.CONTROL, "a"));
                    formsPage
                            .getFieldDateOfBrith()
                            .sendKeys(expectedDate);
                    formsPage
                            .getFieldDateOfBrith()
                            .sendKeys(Keys.ENTER);
                });
        Allure.step("Проверярем отображения значения",
                ()->Assertions.assertEquals(expectedDate, formsPage.getFieldDateOfBrith().getValue()));
    }
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("Проверяем работы селектов")
    @DisplayName("4.Проверяем работу селектов")
    public void workSelected () {
        FormsPage formsPage = new FormsPage();
        Allure.step("Открываем главную страницу",
                ()-> formsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Forms",
                formsPage::openForms);
        Allure.step("Открываем раздел Practice Form",
                formsPage::openPracticeForm);
        Allure.step("Проверяем что поле Select City недоступно для выбора",
                ()->formsPage
                        .getSelectCity()
                        .shouldBe(Condition.editable));
        Allure.step("Устанаволиваем значение в Select State",
                ()-> {
                formsPage
                        .getSelectState()
                        .click();
                selectState.click();
                });
        Allure.step("Проверярем что поле Select City доступно для редактирования",
                ()->formsPage
                        .getSelectCity()
                        .click());
        Allure.step("Устанавливаем значение Select City",
                ()->{
                selectCity.click();
                formsPage
                        .getFieldMobile()
                        .click();
                });
        Allure.step("Проверяем что в селектах установленные нами значения",
                ()-> {
                Assertions.assertEquals("NCR", formsPage.getSelectState().getText());
                Assertions.assertEquals("Delhi", formsPage.getSelectCity().getText());
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(5)
    @Description("Проверяем работу радио-баттонов Gender")
    @DisplayName("5.Проверяем работу радио-баттонов Gender")
    public void workGender () {
        FormsPage formsPage = new FormsPage();
        Allure.step("Открываем главную страницу",
                ()-> formsPage.openMainPage(homeURL));
        Selenide.sleep(1000);
        Allure.step("Переходим на вкладку Forms",
                formsPage::openForms);
        Allure.step("Открываем раздел Practice Form",
                formsPage::openPracticeForm);
        Allure.step("Устанавливаем значение Male",
                ()-> {
                formsPage
                        .getGenderMale()
                        .click();
                selectRadio
                        .first()
                        .shouldBe(Condition.selected);
                });
        Allure.step("Устанавливаем значение Female",
                ()->formsPage.getGenderFemale().click());
        Allure.step("Проверяем что активно только выбранное значение",
                ()-> {
                selectRadio
                        .get(1)
                        .shouldBe(Condition.selected);
                selectRadio
                        .first()
                        .shouldNotBe(Condition.selected);
                });
        Allure.step("Устанавливаем значение Other",
                ()->formsPage
                        .getGenderOther()
                        .click());
        Allure.step("Проверяем что активно только выбранное значение",
                ()->{
                selectRadio
                        .get(2)
                        .shouldBe(Condition.selected);
                selectRadio
                        .get(1)
                        .shouldNotBe(Condition.selected);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(6)
    @Description("Проверяем работу чек-боксов  Hobbies")
    @DisplayName("6.Проверяем работу чек-боксов  Hobbies")
    public void workHobbies () {
        FormsPage formsPage = new FormsPage();
        Allure.step("Открываем главную страницу",
                ()-> formsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Forms",
                formsPage::openForms);
        Allure.step("Открываем раздел Practice Form",
                formsPage::openPracticeForm);
        Allure.step("Устанавливаем чек у  Sports",
                ()->selectBox
                        .get(0)
                        .click());
        Allure.step("Проверяем активность чеков",
                ()->{
                Assertions.assertTrue(selectBox.get(1).isSelected());
                Assertions.assertFalse(selectBox.get(3).isSelected());
                Assertions.assertFalse(selectBox.get(5).isSelected());
                });
        Allure.step("Устанавливаем чек у  Reading",
                ()->selectBox
                        .get(2)
                        .click());
        Allure.step("Проверяем активность чеков",
                ()-> {
                Assertions.assertTrue(selectBox.get(1).isSelected());
                Assertions.assertTrue(selectBox.get(3).isSelected());
                Assertions.assertFalse(selectBox.get(5).isSelected());
                });
        Allure.step("Устанавливаем чек у  Music",
                ()->selectBox
                        .get(4)
                        .click());
        Allure.step("Проверяем активность чеков",
                ()-> {
                Assertions.assertTrue(selectBox.get(1).isSelected());
                Assertions.assertTrue(selectBox.get(3).isSelected());
                Assertions.assertTrue(selectBox.get(5).isSelected());
                });
        Allure.step("Снимаем чек у Reading",
                () ->selectBox
                        .get(2)
                        .click());
        Allure.step("Проверяем активность чеков",
                ()-> {
                Assertions.assertTrue(selectBox.get(1).isSelected());
                Assertions.assertFalse(selectBox.get(3).isSelected());
                Assertions.assertTrue(selectBox.get(5).isSelected());
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(7)
    @Description("Загружаем файл")
    @DisplayName("7.Загружаем файл")
    public void Upload()  {
        FormsPage formsPage = new FormsPage();
        Allure.step("Открываем главную страницу",
                ()-> formsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Forms",
                formsPage::openForms);
        Allure.step("Открываем раздел Practice Form",
                formsPage::openPracticeForm);
        Allure.step("Загружаем файл",
                () -> formsPage
                        .getButtonSelectPicture()
                        .uploadFile(new File("src/test/resources/1.png")));
        Allure.step("Проверяем что файл загрузился",
                () -> formsPage
                        .getButtonSelectPicture()
                        .shouldBe(Condition.value("1.png")));
    }
    @Test
    @Owner("osipov_vr")
    @Order(8)
    @Description("Заполнение всех текстовых полей")
    @DisplayName("8.Заполненение всех текстовых полей")
    public void workField()  {
        FormsPage formsPage = new FormsPage();
        Allure.step("Открываем главную страницу",
                ()-> formsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Forms",
                formsPage::openForms);
        Allure.step("Открываем раздел Practice Form",
                formsPage::openPracticeForm);
        Allure.step("Заполняем поле First Name",
                () -> formsPage
                        .getFieldFirstName()
                        .setValue(firstName));
        Allure.step("Заполняем поле Last Name",
                () -> formsPage
                        .getFieldLastName()
                        .setValue(lastName));
        Allure.step("Заполняем поле email",
                () -> formsPage
                        .getFieldEmail()
                        .setValue(email));
        Allure.step("Заполняем поле Current Address",
                () -> formsPage
                        .getFieldCurrentAddress()
                        .setValue(currentAddress));
        Allure.step("Проверяем, что в  полях присутвтуеют веденные нами значения",
                () -> {
                Assertions.assertEquals(firstName, formsPage.getFieldFirstName().getValue());
                Assertions.assertEquals(lastName, formsPage.getFieldLastName().getValue());
                Assertions.assertEquals(email, formsPage.getFieldEmail().getValue());
                Assertions.assertEquals(currentAddress, formsPage.getFieldCurrentAddress().getValue());
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(9)
    @Description("Проверка работы формы с валидными данными")
    @DisplayName("9.Проверка работы формы с валидными данными")
    public void workWithValidData()  {
        FormsPage formsPage = new FormsPage();
        Allure.step("Открываем главную страницу",
                ()-> formsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Forms",
                formsPage::openForms);
        Allure.step("Открываем раздел Practice Form",
                formsPage::openPracticeForm);
        Allure.step("Заполняем все текстовых поля",
                ()->{
                    Allure.step("Заполняем поле First Name",
                            () -> formsPage
                                    .getFieldFirstName()
                                    .setValue(firstName));
                    Allure.step("Заполняем поле Last Name",
                            () -> formsPage
                                    .getFieldLastName()
                                    .setValue(lastName));
                    Allure.step("Заполняем поле email",
                            () -> formsPage
                                    .getFieldEmail()
                                    .setValue(email));
                    Allure.step("Заполняем поле Current Address",
                            () -> formsPage
                                    .getFieldCurrentAddress()
                                    .setValue(currentAddress));
                });
        Allure.step("Заполняем номер телефона",
                ()-> formsPage.checkFieldMobile(randomNumber));
        Allure.step("Устанваливаем гендер",
                ()-> formsPage
                        .getGenderMale()
                        .click());
        Allure.step("Заполняем дату",
                ()->{
                    Allure.step("Открываем дата-пикер",
                            ()->formsPage
                                    .getFieldDateOfBrith()
                                    .click());
                    Allure.step("Устанаволиваем значение = текущая дата - 20 лет",
                            ()-> {
                                formsPage
                                        .getFieldDateOfBrith()
                                        .sendKeys(Keys.chord(Keys.CONTROL, "a"));
                                formsPage
                                        .getFieldDateOfBrith()
                                        .sendKeys(expectedDate);
                                formsPage
                                        .getFieldDateOfBrith()
                                        .sendKeys(Keys.ENTER);
                            });
                });
        Allure.step("Устанваливаем хобби",
                ()-> {
                    Allure.step("Устанавливаем чек у  Sports",
                            ()->selectBox
                                    .get(0)
                                    .click());
                    Allure.step("Устанавливаем чек у  Reading",
                            ()->selectBox
                                    .get(2)
                                    .click());
                });
        Allure.step("Загружаем файл",
                () -> formsPage
                        .getButtonSelectPicture()
                        .uploadFile(new File("src/test/resources/1.png")));
        Allure.step("Устанвливаем значения в  State and City",
                () -> {
                    Allure.step("Устанаволиваем значение в Select State",
                            ()-> {
                                formsPage
                                        .getSelectState()
                                        .click();
                                selectState.click();
                            });
                    Allure.step("Проверярем что поле Select City доступно для редактирования",
                            ()->formsPage
                                    .getSelectCity()
                                    .click());
                    Allure.step("Устанавливаем значение Select City",
                            ()->{
                                selectCity.click();
                            });
                });
        Allure.step("Нажимаем на кнопку Submit",
                ()->formsPage.getButtonSubmit().click());
        /*
         Allure.step("Проверяем данные в открывшемся окне",
                ()->{
                    Selenide.switchTo().window(0);
                    Allure.step("Проверяем поле Student Name",
                            ()-> Assertions.assertEquals(firstName+" "+lastName, studentName.getValue()));
                    Allure.step("Проверяем поле Student Email",
                            ()-> Assertions.assertEquals(email, studentEmail.getValue()));
                });
         */
    }
}
