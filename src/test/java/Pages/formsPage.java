package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class formsPage {
    private final SelenideElement buttonForms = $x("//h5[text()='Forms']"); // ��������� Forms
    private final SelenideElement buttonPracticeForm = $x("//span[text()='Practice Form']"); // ��������� Practice Forms
    private final SelenideElement labelPracticeForm = $x("//div[text()='Practice Form']");// �������� �������
    private final SelenideElement fieldFirstName = $x("//*[@id='firstName']");// ����  First Name
    private final SelenideElement fieldLastName = $x("//*[@id='lastName']");// ����  Last Name
    private final SelenideElement fieldEmail = $x("//*[@id='userEmail']");// ����  email
    private final SelenideElement radioButtonGender = $x("//*[@id='genterWrapper']");// �����-������ Gender
    private final SelenideElement fieldMobile = $x("//*[@id='userNumber']");// ���� Mobile
    private final SelenideElement fieldDateOfBrith = $x("//*[@id='dateOfBirthInput']"); // ���� Date of Birth
    private final SelenideElement fieldSubjects = $x("//*[@id='subjectsContainer']"); // ���� Subjects
    private final SelenideElement checkBoxHobbies = $x("//*[@id='hobbiesWrapper']"); // ���-���� Hobbies
    private final SelenideElement buttonSelectPicture = $x("//*[@id='uploadPicture']"); // ������ Select Picture
    private final SelenideElement fieldCurrentAddress = $x("//*[@id='currentAddress']"); // ����  current Address
    private final SelenideElement selectState = $x("//*[@id='state']"); // ������ state
    private final SelenideElement selectCity = $x("//*[@id='city']"); // ������ city

    public  formsPage (String url) {
        Selenide.open(url);
    }
    public void openForms () {
        buttonForms.click();
    }
    public void openPracticeForm () {
        buttonPracticeForm.click();
    }
    public SelenideElement getLabelPracticeForm() {
        return labelPracticeForm;
    }
    public SelenideElement getFieldFirstName () {
        return fieldFirstName;
    }
    public SelenideElement getFieldLastName() {
        return fieldLastName;
    }
    public SelenideElement getFieldEmail() {
        return fieldEmail;
    }
    public SelenideElement getRadioButtonGender() {
        return radioButtonGender;
    }
    public SelenideElement getFieldMobile() {
        return fieldMobile;
    }

    public void checkFieldMobile(String number) {
        fieldMobile.click();
        fieldMobile.sendKeys(number);
    }
    public SelenideElement getFieldDateOfBrith() {
        return fieldDateOfBrith;
    }
    public SelenideElement getFieldSubjects() {
        return fieldSubjects;
    }
    public SelenideElement getCheckBoxHobbies() {
        return checkBoxHobbies;
    }
    public SelenideElement getButtonSelectPicture() {
        return buttonSelectPicture;
    }
    public SelenideElement getFieldCurrentAddress() {
        return fieldCurrentAddress;
    }
    public SelenideElement getSelectCity() {
        return selectCity;
    }
    public SelenideElement getSelectState() {
        return selectState;
    }

}
