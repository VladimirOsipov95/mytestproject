import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$x;
public class elementsPage {
    private final SelenideElement buttonElements = $x("//h5[text()='Elements']"); // ��������� Elements
    private final SelenideElement buttonTextBox = $x("//span[text()='Text Box']"); // ������� ������ "TextBox"
    private final SelenideElement fullName = $x("//input[@class=' mr-sm-2 form-control']"); // ������� ���� "���"
    private final SelenideElement email = $x("//input[@class='mr-sm-2 form-control']"); // ������� ���� "email"
    private final SelenideElement currentAddress = $x("//textarea[@placeholder='Current Address']"); // ������� ���� "��������"
    private final SelenideElement permanentAddress = $x("//*[@id='permanentAddress']"); // ������� ���� "��������"
    private final SelenideElement buttonSubmit = $x("//button[@id='submit']"); // ������ "Submit"
    private final SelenideElement buttonCheckBox = $x("//span[text()='Check Box']"); // ������� ������ "CheckBox"
    private final SelenideElement buttonHome = $x("//*[@id='tree-node']/ol/li/span/button"); // ����������/��������  ����� "Home"
    private final SelenideElement buttonDesktop = $x("//*[@id='tree-node']/ol/li/ol/li[1]/span/button"); // ����������/��������  ����� "Desktop"
    private final SelenideElement buttonDocuments = $x("//*[@id='tree-node']/ol/li/ol/li[2]/span/button"); // ����������/��������  ����� "Documents"
    private final SelenideElement buttonDownloads= $x("//*[@id='tree-node']/ol/li/ol/li[3]/span/button"); // ����������/��������  ����� "Downloads"
    private final SelenideElement checkBoxDesktop= $x("//*[@id='tree-node']/ol/li/ol/li[1]/span/label/span[1]"); // �������� �� ���-���� �  "Desktop"
    private final SelenideElement checkBoxDocuments= $x("//*[@id='tree-node']/ol/li/ol/li[2]/span/label/span[1]"); // �������� �� ���-���� �  "Documents"
    private final SelenideElement checkBoxDownloads= $x("//*[@id='tree-node']/ol/li/ol/li[3]/span/label/span[1]"); // �������� �� ���-���� �  "Downloads"
    private final SelenideElement checkBoxHome= $x("//*[@id='tree-node']/ol/li/span/label/span[1]"); // �������� �� ���-���� �  "Downloads"
    private final SelenideElement buttonRadioButton = $x("//span[text()='Radio Button']"); // ������� ������ "RadioButton"
    private final SelenideElement buttonYes = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/label"); // ������� �  "Yes"
    private final SelenideElement buttonImpressive = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/label"); // ������� �  "Impressive"
    private final SelenideElement buttonNo = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[4]/label"); // ������� �  "No"
    private final SelenideElement afterClickRadio = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/p/span"); // ����� ����� �� �������������
    private final SelenideElement buttonWebTables = $x("//span[text()='Web Tables']"); // ������� ������ "WebTables"
    private final SelenideElement buttonSearchWebTables = $x("//*[@id='searchBox']"); // ������� ����� "WebTables"
    private final SelenideElement editWebTables = $x("//*[@id='edit-record-1']"); // ������� ������ �������������� � "WebTables"
    private final SelenideElement newWebTables = $x("//*[@id='addNewRecordButton']"); // ������� ������ Add � "WebTables"
    private final SelenideElement deleteWebTables = $x("//*[@id='delete-record-1']"); // ������� ������ ������� � "WebTables"
    private final SelenideElement firstNameWebTables = $x("//*[@id='firstName']"); // ������� ����  FirstName � "WebTables"
    private final SelenideElement lastNameWebTables = $x("//*[@id='lastName']"); // ������� ����  LastName � "WebTables"
    private final SelenideElement emailWebTables = $x("//*[@id='userEmail']"); // ������� ����  Email � "WebTables"
    private final SelenideElement ageWebTables = $x("//*[@id='age']"); // ������� ����  Age � "WebTables"
    private final SelenideElement salaryWebTables = $x("//*[@id='salary']"); // ������� ����  Salary � "WebTables"
    private final SelenideElement departmentWebTables = $x("//*[@id='department']"); // ������� ����  Department � "WebTables"
    private final SelenideElement tablesWebTables = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]"); // ������� ����  tables � "WebTables"
    private final SelenideElement buttonButtons = $x("//span[text()='Buttons']"); // ������� ������ "Buttons"
    private final SelenideElement buttonDoubleClick = $x("//*[@id='doubleClickBtn']"); // ������� ������  "Double Click Me"
    private final SelenideElement buttonRightClick = $x("//*[@id='rightClickBtn']"); // ������� ������  "Right Click Me"
    private final SelenideElement buttonClickClick = $x("//*[@id='TYjkE']"); // ������� ������  "Click Me"
    private final SelenideElement buttonLinks = $x("//span[text()='Links']"); // ������� ������ "Links"
    private final SelenideElement openNewTabsLinks = $x("//*[@id='linkWrapper']/h5[1]/strong"); // ������� ������ � ������� �� ����� ����
    private final SelenideElement sendAnApiCall = $x("//*[@id='linkWrapper']/h5[2]/strong"); // ������� ������ � ������� �� ���
    private final SelenideElement newWindowHome = $x("//*[@id='simpleLink']"); // ������� ���� Home
    private final SelenideElement buttonUploadAndDownload = $x("//span[text()='Upload and Download']"); // ������� ������ "Upload And Download"
    private final SelenideElement buttonDownload = $x("//a[@href='images/sticker.png']"); // ������� ������ "Download"
    private final SelenideElement buttonUpload = $x("//*[@id='uploadFile']"); // ������� ������ "Upload"



    public  elementsPage (String url) {
        Selenide.open(url);
    }
    public String [] getTables () {
        return tablesWebTables.getText().split(" ");
    }
    protected void clearAndType (SelenideElement element, String value ) {
        while (!element.getAttribute("value").equals("")) element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys(value);
    } // ������� ���� ����� ������
    public void sendKeysWebTables (String name, String lastName, String email, int age, int salary, String department) {
        firstNameWebTables.click();
        clearAndType(firstNameWebTables, name);
        Selenide.sleep(300);
        lastNameWebTables.click();
        clearAndType(lastNameWebTables, lastName);
        Selenide.sleep(300);
        emailWebTables.click();
        clearAndType(emailWebTables, email);
        Selenide.sleep(300);
        ageWebTables.click();
        clearAndType(ageWebTables, String.valueOf(age));
        Selenide.sleep(300);
        salaryWebTables.click();
        clearAndType(salaryWebTables, String.valueOf(salary));
        Selenide.sleep(300);
        departmentWebTables.click();
        clearAndType(departmentWebTables, department);
    }

    public void clickElements () {
        buttonElements.click();
    }
    public void clickButtonTextBox () {
        buttonTextBox.click();
    }
    public void fullName (){
        fullName.click();
        fullName.sendKeys("Vladimir");
    }
    public void email () {
        email.click();
        email.sendKeys("vladimir10@yandex.ru");
    }
    public void currentAddress () {
        currentAddress.click();
        currentAddress.sendKeys("Michurinsk");
    }
    public void permanentAddress () {
        permanentAddress.click();
        permanentAddress.sendKeys("Moscow");
    }
    public void clickButtonSubmit () {
        buttonSubmit.click();
    }
    public void clickButtonCheckBox () {
        buttonCheckBox.click();
    }
    public void clickHome () {
        buttonHome.click();
    }
    public void clickDesktop () {
        buttonDesktop.click();
    }
    public void clickDocuments () {
        buttonDocuments.click();
    }
    public void clickDownloads () {
        buttonDownloads.click();
    }
    public void clickCheckBoxDesktop () {
        checkBoxDesktop.click();
    }
    public void clickCheckBoxDocuments () {
        checkBoxDocuments.click();
    }
    public void clickCheckBoxDownloads () {
        checkBoxDownloads.click();
    }
    public void clickCheckBoxHome () {
        checkBoxHome.click();
    }
    public void clickRadioButton () {
        buttonRadioButton.click();
    }
    public void clickYes () {
        buttonYes.click();
    }
    public String afterClick () {
        return afterClickRadio.getText();
    }
    public void clickImpressive () {
        buttonImpressive.click();
    }
    public void clickNo () {
        buttonNo.click();
    }
    public void clickWebTables () {
        buttonWebTables.click();
    }
    public void searchWebTables (String search) {
        buttonSearchWebTables.click();
        buttonSearchWebTables.sendKeys(search);
    }
    public void editWebTables () {
        editWebTables.click();
    }
    public void newWebTables () {
        newWebTables.click();
    }
    public void deleteWebTables () {
        deleteWebTables.click();
    }
    public void clickButtons () {
        buttonButtons.click();
    }

    public void checkButtons () {
        buttonDoubleClick.isDisplayed();
        buttonRightClick.isDisplayed();
        buttonClickClick.isDisplayed();
    }
    public void checkDoubleClick () {
        buttonDoubleClick.doubleClick();
    }
    public void checkRightClick () {
        buttonRightClick.contextClick();
    }
    public void clickButtonLinks () {
        buttonLinks.click();
    }
    public void checkLinks () {
        openNewTabsLinks.isDisplayed();
        sendAnApiCall.isDisplayed();
    }
    public void clickNewWindowLinks () {
        newWindowHome.click();
    }
    public void openUploadAndDownload () {
        buttonUploadAndDownload.click();
    }
    public void checkUploadAndDownload () {
        buttonUpload.isDisplayed();
        buttonDownload.isDisplayed();
    }
    public void clickDownload () throws FileNotFoundException {
        buttonDownload.click();
    }
}
