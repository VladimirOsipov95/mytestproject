package UI.Tests.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;
@Getter
public class FormsPage {
    public  void openMainPage (String url) {
        Selenide.open(url);
    }
    private final SelenideElement buttonForms = $x("//h5[text()='Forms']"); // Открываем Forms
    private final SelenideElement buttonPracticeForm = $x("//span[text()='Practice Form']"); // Открываем Practice Forms
    private final SelenideElement labelPracticeForm = $x("//div[text()='Practice Form']");// Название странцы
    private final SelenideElement fieldFirstName = $x("//*[@id='firstName']");// Поле  First Name
    private final SelenideElement fieldLastName = $x("//*[@id='lastName']");// Поле  Last Name
    private final SelenideElement fieldEmail = $x("//*[@id='userEmail']");// Поле  email
    private final SelenideElement radioButtonGender = $x("//*[@id='genterWrapper']");// Радио-баттон Gender
    private final SelenideElement fieldMobile = $x("//*[@id='userNumber']");// Поле Mobile
    private final SelenideElement fieldDateOfBrith = $x("//*[@id='dateOfBirthInput']"); // Поле Date of Birth
    private final SelenideElement fieldSubjects = $x("//*[@id='subjectsContainer']"); // Поле Subjects
    private final SelenideElement checkBoxHobbies = $x("//*[@id='hobbiesWrapper']"); // Чек-бокс Hobbies
    private final SelenideElement buttonSelectPicture = $x("//*[@id='uploadPicture']"); // Кнопка Select Picture
    private final SelenideElement fieldCurrentAddress = $x("//*[@id='currentAddress']"); // Поле  current Address
    private final SelenideElement selectState = $x("//*[@id='state']"); // Селект state
    private final SelenideElement selectCity = $x("//*[@id='city']"); // Селект city
    private final SelenideElement buttonSubmit = $x("//*[@id=\"submit\"]"); //  Кнопка Submit
    private final SelenideElement buttonClose= $x("//*[@id=\"closeLargeModal\"]"); //  Кнопка Close
    private final SelenideElement genderMale = $x("//*[@id=\"genterWrapper\"]/div[2]/div[1]"); // Male
    private final SelenideElement genderFemale = $x("//*[@id=\"genterWrapper\"]/div[2]/div[2]"); // Female
    private final SelenideElement genderOther = $x("//*[@id=\"genterWrapper\"]/div[2]/div[3]"); // Other
    private final SelenideElement studentName = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[1]/td[2]");
    private final SelenideElement studentEmail = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[2]/td[2]");
    private final SelenideElement gender = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[3]/td[2]");
    private final SelenideElement mobile = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[4]/td[2]");
    private final SelenideElement dateOfBirth = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[5]/td[2]");
    private final SelenideElement subjects = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[6]/td[2]");
    private final SelenideElement hobbies = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[7]/td[2]");
    private final SelenideElement picture = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[8]/td[2]");
    private final SelenideElement address = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[9]/td[2]");
    private final SelenideElement stateAndCity = $x("/html/body/div[3]/div/div/div[2]/div/table/tbody/tr[10]/td[2]");
    public void checkFieldMobile(String number) {
        fieldMobile.click();
        fieldMobile.sendKeys(number);
    }
}
