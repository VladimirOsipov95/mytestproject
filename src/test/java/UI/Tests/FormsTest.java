package UI.Tests;

import UI.Pages.FormsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Проверка работы разделов на вкладке Forms
 */
@Epic("Проверки на вкладке Forms")
public class FormsTest extends BaseTest  {
    FormsPage page = new FormsPage();
    @BeforeEach
    public void startPage () {
        Allure.step("Открываем главную страницу",
                ()-> page.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Forms",
                ()->page
                        .getButtonForms()
                        .click());
        Allure.step("Открываем раздел Practice Form",
                ()->page
                        .getButtonPracticeForm()
                        .click());
    }
    private final static String homeURL = "http://85.192.34.140:8081/";
    private final SelenideElement selectState = $x("//div[contains(text(),'NCR')]");
    private final SelenideElement selectCity = $x("//div[contains(text(),'Delhi')]");
    private final ElementsCollection selectRadio= $$x("//input[@type='radio']");
    private final ElementsCollection selectBox = $$x("//*[@id=\"hobbiesWrapper\"]/div[2]/div | //input[contains(@id,'hobbies-checkbox')]");
    public String dateFormat = "dd MMM yyyy";
    public String expectedDate =LocalDateTime.now().minusYears(20).format(DateTimeFormatter.ofPattern(dateFormat).localizedBy(Locale.US));
    private final String firstName = "Vladimir";
    private final String lastName = "Osipov";
    private final String email = "volodka10@yandex.ru";
    private final String currentAddress = "Moscow";
    private static long generateRandomNumber() {
        Random Random = new Random(1000000000);
        return Random.nextLong();
    }
    public static String randomNumber = String.valueOf(generateRandomNumber());
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Открываем  раздел Practice Form")
    @DisplayName("1.Открываем  раздел Practice Form")
    public void openPracticeForms () {
        Allure.step("Проверяем содержимое раздела Practice Form",
                ()-> {
                    page
                            .getLabelPracticeForm()
                            .shouldBe(Condition.visible);
                    page
                            .getFieldFirstName()
                            .shouldBe(Condition.visible);
                    page
                            .getFieldLastName()
                            .shouldBe(Condition.visible);
                    page
                            .getFieldEmail()
                            .shouldBe(Condition.visible);
                    page
                            .getRadioButtonGender()
                            .shouldBe(Condition.visible);
                    page
                            .getFieldMobile()
                            .shouldBe(Condition.visible);
                    page
                            .getFieldDateOfBrith()
                            .shouldBe(Condition.visible);
                    page
                            .getFieldSubjects()
                            .shouldBe(Condition.visible);
                    page
                            .getCheckBoxHobbies()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonSelectPicture()
                            .shouldBe(Condition.visible);
                    page
                            .getFieldCurrentAddress()
                            .shouldBe(Condition.visible);
                    page
                            .getSelectState()
                            .shouldBe(Condition.visible);
                    page
                            .getSelectCity()
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("Проверяем что в поле Mobile вводиться не больше 10 символов")
    @DisplayName("2.Проверяем что в поле Mobile вводиться не больше 10 символов")
    public void checkFieldMobile () {
        Allure.step("Вводим в поле Mobile больше 10 цифр",
                ()-> page.checkFieldMobile(randomNumber));
        Allure.step("Провряем что в поле только 10 цифр",
                ()-> {
                    String results = page.getFieldMobile().getAttribute("value");
                    Assertions.assertNotEquals(randomNumber,results);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(3)
    @Description("Проверяем работы датапикера")
    @DisplayName("3.Проверяем работу датапикера")
    public void workDataPicker () {
        Allure.step("Открываем дата-пикер",
                ()->page
                        .getFieldDateOfBrith()
                        .click());
        Allure.step("Устанаволиваем значение = текущая дата - 20 лет",
                ()-> {
                    page
                            .getFieldDateOfBrith()
                            .sendKeys(Keys.chord(Keys.CONTROL, "a"));
                    page
                            .getFieldDateOfBrith()
                            .sendKeys(expectedDate);
                    page
                            .getFieldDateOfBrith()
                            .sendKeys(Keys.ENTER);
                });
        Allure.step("Проверярем отображения значения",
                ()->Assertions.assertEquals(expectedDate, page.getFieldDateOfBrith().getValue()));
    }
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("Проверяем работы селектов")
    @DisplayName("4.Проверяем работу селектов")
    public void workSelected () {
        Allure.step("Проверяем что поле Select City недоступно для выбора",
                ()->page
                        .getSelectCity()
                        .shouldBe(Condition.editable));
        Allure.step("Устанаволиваем значение в Select State",
                ()-> {
                page
                        .getSelectState()
                        .click();
                selectState.click();
                });
        Allure.step("Проверярем что поле Select City доступно для редактирования",
                ()->page
                        .getSelectCity()
                        .click());
        Allure.step("Устанавливаем значение Select City",
                ()->{
                selectCity.click();
                page
                        .getFieldMobile()
                        .click();
                });
        Allure.step("Проверяем что в селектах установленные нами значения",
                ()-> {
                Assertions.assertEquals("NCR", page.getSelectState().getText());
                Assertions.assertEquals("Delhi", page.getSelectCity().getText());
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(5)
    @Description("Проверяем работу радио-баттонов Gender")
    @DisplayName("5.Проверяем работу радио-баттонов Gender")
    public void workGender () {
        Allure.step("Устанавливаем значение Male",
                ()-> {
                page
                        .getGenderMale()
                        .click();
                selectRadio
                        .first()
                        .shouldBe(Condition.selected);
                });
        Allure.step("Устанавливаем значение Female",
                ()->page.getGenderFemale().click());
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
                ()->page
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
        Allure.step("Загружаем файл",
                () -> page
                        .getButtonSelectPicture()
                        .uploadFile(new File("src/test/resources/1.png")));
        Allure.step("Проверяем что файл загрузился",
                () -> page
                        .getButtonSelectPicture()
                        .shouldBe(Condition.value("1.png")));
    }
    @Test
    @Owner("osipov_vr")
    @Order(8)
    @Description("Заполнение всех текстовых полей")
    @DisplayName("8.Заполненение всех текстовых полей")
    public void workField()  {
        Allure.step("Заполняем поле First Name",
                () -> page
                        .getFieldFirstName()
                        .setValue(firstName));
        Allure.step("Заполняем поле Last Name",
                () -> page
                        .getFieldLastName()
                        .setValue(lastName));
        Allure.step("Заполняем поле email",
                () -> page
                        .getFieldEmail()
                        .setValue(email));
        Allure.step("Заполняем поле Current Address",
                () -> page
                        .getFieldCurrentAddress()
                        .setValue(currentAddress));
        Allure.step("Проверяем, что в  полях присутвтуеют веденные нами значения",
                () -> {
                Assertions.assertEquals(firstName, page.getFieldFirstName().getValue());
                Assertions.assertEquals(lastName, page.getFieldLastName().getValue());
                Assertions.assertEquals(email, page.getFieldEmail().getValue());
                Assertions.assertEquals(currentAddress, page.getFieldCurrentAddress().getValue());
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(9)
    @Description("Проверка работы формы с валидными данными")
    @DisplayName("9.Проверка работы формы с валидными данными")
    public void workWithValidData()  {
        Allure.step("Заполняем все текстовых поля",
                ()->{
                    Allure.step("Заполняем поле First Name",
                            () -> page
                                    .getFieldFirstName()
                                    .setValue(firstName));
                    Allure.step("Заполняем поле Last Name",
                            () -> page
                                    .getFieldLastName()
                                    .setValue(lastName));
                    Allure.step("Заполняем поле email",
                            () -> page
                                    .getFieldEmail()
                                    .setValue(email));
                    Allure.step("Заполняем поле Current Address",
                            () -> page
                                    .getFieldCurrentAddress()
                                    .setValue(currentAddress));
                });
        Allure.step("Заполняем номер телефона",
                ()-> page.checkFieldMobile(randomNumber));
        Allure.step("Устанваливаем гендер",
                ()-> page
                        .getGenderMale()
                        .click());
        Allure.step("Заполняем дату",
                ()->{
                    Allure.step("Открываем дата-пикер",
                            ()->page
                                    .getFieldDateOfBrith()
                                    .click());
                    Allure.step("Устанаволиваем значение = текущая дата - 20 лет",
                            ()-> {
                                page
                                        .getFieldDateOfBrith()
                                        .sendKeys(Keys.chord(Keys.CONTROL, "a"));
                                page
                                        .getFieldDateOfBrith()
                                        .sendKeys(expectedDate);
                                page
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
                () -> page
                        .getButtonSelectPicture()
                        .uploadFile(new File("src/test/resources/1.png")));
        Allure.step("Устанвливаем значения в  State and City",
                () -> {
                    Allure.step("Устанаволиваем значение в Select State",
                            ()-> {
                                page
                                        .getSelectState()
                                        .click();
                                selectState.click();
                            });
                    Allure.step("Проверярем что поле Select City доступно для редактирования",
                            ()->page
                                    .getSelectCity()
                                    .click());
                    Allure.step("Устанавливаем значение Select City",
                            ()-> selectCity.click());
                });
        Allure.step("Нажимаем на кнопку Submit",
                ()->page.getButtonSubmit().click());
         Allure.step("Проверяем данные в открывшемся окне",
                ()->{
                    Allure.step("Проверяем поле Student Name",
                            ()-> Assertions.assertEquals(firstName+" "+lastName, page.getStudentName().getText()));
                    Allure.step("Проверяем поле Student Email",
                            ()-> Assertions.assertEquals(email, page.getStudentEmail().getText()));
                    Allure.step("Проверяем поле Gender",
                            ()-> Assertions.assertEquals("Male", page.getGender().getText()));
                    Allure.step("Проверяем поле Subjects",
                            ()-> Assertions.assertEquals("", page.getSubjects().getText()));
                    Allure.step("Проверяем поле Hobbies",
                            ()-> Assertions.assertEquals("Sports, Reading", page.getHobbies().getText()));
                    Allure.step("Проверяем поле Date of Birth",
                            ()-> {
                            String [] arrayDateOfBirth = page.getDateOfBirth().getText().split("\\s|,");
                            String day = arrayDateOfBirth [0];
                            String month = arrayDateOfBirth[1].substring(0,3);
                            String year = arrayDateOfBirth [2];
                            Assertions.assertEquals(expectedDate, (day+" "+month+" "+year));
                            });
                    Allure.step("Проверяем поле Mobile",
                            ()-> Assertions.assertEquals(randomNumber.substring(0,10), page.getMobile().getText()));
                    Allure.step("Проверяем поле Picture",
                            ()-> Assertions.assertEquals("1.png", page.getPicture().getText()));
                    Allure.step("Проверяем поле Address",
                            ()-> Assertions.assertEquals(currentAddress, page.getAddress().getText()));
                    Allure.step("Проверяем поле State and City",
                            ()-> Assertions.assertEquals("NCR Delhi", page.getStateAndCity().getText()));
                });
        Allure.step("Нажимаем на кнопку Close",
                ()->page.getButtonClose().click());
    }
    @Test
    @Owner("osipov_vr")
    @Order(10)
    @Description("Проверка работы формы с некорректными данными")
    @DisplayName("10.Проверка работы формы с некорректными данными")
    public void workWithIncorrectData() {
        Allure.step("Нажимаем на кнопку Submit",
                ()->page.getButtonSubmit().click());
        Allure.step("Проверяем что подсветились обязательные  поля",
                () -> {
                    Allure.step("Проверям поле First Name",
                            () -> page
                                    .getFieldFirstName()
                                    .shouldHave(cssValue("border-color", "rgb(220, 53, 69)")));
                    Allure.step("Проверяем поле Last Name",
                            () -> page
                                    .getFieldLastName()
                                    .shouldHave(cssValue("border-color", "rgb(220, 53, 69)")));
                    Allure.step("Проверяем Mobile ",
                            () -> page
                                    .getFieldMobile()
                                    .shouldHave(cssValue("border-color", "rgb(220, 53, 69)")));
                    Allure.step("Проверяем Gender ",
                            () -> {
                                Allure.step("Проверяем Male",
                                        ()-> page
                                                .getGenderMale()
                                                .shouldHave(cssValue("color", "rgba(255, 255, 255, 1)")));
                                Allure.step("Проверяем Female",
                                        ()-> page
                                                .getGenderFemale()
                                                .shouldHave(cssValue("color", "rgba(255, 255, 255, 1)")));
                                Allure.step("Проверяем Other",
                                        ()-> page
                                                .getGenderOther()
                                                .shouldHave(cssValue("color", "rgba(255, 255, 255, 1)")));
                            });
                });
    }
}
