package UI.Tests.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.Keys;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$x;
import static org.junit.Assert.assertNotNull;

@Getter
public class ElementsPage {
    public void openMainPage(String url) {
        Selenide.open(url);
    }
    private final SelenideElement buttonElements = $x("//h5[text()='Elements']"); // Открываем Elements
    private final SelenideElement buttonTextBox = $x("//span[text()='Text Box']"); // Находим раздел "TextBox"
    private final SelenideElement fullName = $x("//input[@class=' mr-sm-2 form-control']"); // Находим поле "Имя"
    private final SelenideElement email = $x("//input[@class='mr-sm-2 form-control']"); // Находим поле "email"
    private final SelenideElement currentAddress = $x("//textarea[@placeholder='Current Address']"); // Находим поле "курадрес"
    private final SelenideElement permanentAddress = $x("//*[@id='permanentAddress']"); // Находим поле "перадрес"
    private final SelenideElement buttonSubmit = $x("//button[@id='submit']"); // Кнопка "Submit"
    private final SelenideElement buttonCheckBox = $x("//span[text()='Check Box']"); // Находим раздел "CheckBox"
    private final SelenideElement buttonHome = $x("//*[@id='tree-node']/ol/li/span/button"); // Раскрываем/скрываем  папку "Home"
    private final SelenideElement buttonDesktop = $x("//*[@id='tree-node']/ol/li/ol/li[1]/span/button"); // Раскрываем/скрываем  папку "Desktop"
    private final SelenideElement buttonDocuments = $x("//*[@id='tree-node']/ol/li/ol/li[2]/span/button"); // Раскрываем/скрываем  папку "Documents"
    private final SelenideElement buttonDownloads= $x("//*[@id='tree-node']/ol/li/ol/li[3]/span/button"); // Раскрываем/скрываем  папку "Downloads"
    private final SelenideElement checkBoxDesktop= $x("//*[@id='tree-node']/ol/li/ol/li[1]/span/label/span[1]"); // Нажимаем на чек-бокс у  "Desktop"
    private final SelenideElement checkBoxDocuments= $x("//*[@id='tree-node']/ol/li/ol/li[2]/span/label/span[1]"); // Нажимаем на чек-бокс у  "Documents"
    private final SelenideElement checkBoxDownloads= $x("//*[@id='tree-node']/ol/li/ol/li[3]/span/label/span[1]"); // Нажимаем на чек-бокс у  "Downloads"
    private final SelenideElement checkBoxHome= $x("//*[@id='tree-node']/ol/li/span/label/span[1]"); // Нажимаем на чек-бокс у  "Downloads"
    private final SelenideElement buttonRadioButton = $x("//span[text()='Radio Button']"); // Находим раздел "RadioButton"
    private final SelenideElement buttonYes = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/label"); // Кликаем в  "Yes"
    private final SelenideElement buttonImpressive = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/label"); // Кликаем в  "Impressive"
    private final SelenideElement buttonNo = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[4]/label"); // Кликаем в  "No"
    private final SelenideElement afterClickRadio = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/p/span"); // После клика по радиобаттанам
    private final SelenideElement buttonWebTables = $x("//span[text()='Web Tables']"); // Находим раздел "WebTables"
    private final SelenideElement buttonSearchWebTables = $x("//*[@id='searchBox']"); // Находим поиск "WebTables"
    private final SelenideElement editWebTables = $x("//*[@id='edit-record-1']"); // Находим кнопку редактирования в "WebTables"
    private final SelenideElement newWebTables = $x("//*[@id='addNewRecordButton']"); // Находим кнопку Add в "WebTables"
    private final SelenideElement deleteWebTables = $x("//*[@id='delete-record-1']"); // Находим кнопку удалить в "WebTables"
    private final SelenideElement firstNameWebTables = $x("//*[@id='firstName']"); // Находим поле  FirstName в "WebTables"
    private final SelenideElement lastNameWebTables = $x("//*[@id='lastName']"); // Находим поле  LastName в "WebTables"
    private final SelenideElement emailWebTables = $x("//*[@id='userEmail']"); // Находим поле  Email в "WebTables"
    private final SelenideElement ageWebTables = $x("//*[@id='age']"); // Находим поле  Age в "WebTables"
    private final SelenideElement salaryWebTables = $x("//*[@id='salary']"); // Находим поле  Salary в "WebTables"
    private final SelenideElement departmentWebTables = $x("//*[@id='department']"); // Находим поле  Department в "WebTables"
    private final SelenideElement tablesWebTables = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]"); // Находим поле  tables в "WebTables"
    private final SelenideElement buttonButtons = $x("//span[text()='Buttons']"); // Находим раздел "Buttons"
    private final SelenideElement buttonDoubleClick = $x("//button[text()='Double Click Me']"); // Находим кнопку  "Double Click Me"
    private final SelenideElement buttonRightClick = $x("//button[text()='Right Click Me']"); // Находим кнопку  "Right Click Me"
    private final SelenideElement buttonClickClick = $x("//*[text()=\"Click Me\"]"); // Находим кнопку  "Click Me"
    private final SelenideElement buttonLinks = $x("//span[text()='Links']"); // Находим раздел "Links"
    private final SelenideElement openNewTabsLinks = $x("//*[@id='linkWrapper']/h5[1]/strong"); // Находим раздел с сылками на новое окно
    private final SelenideElement sendAnApiCall = $x("//*[@id='linkWrapper']/h5[2]/strong"); // Находим раздел с сылками на апи
    private final SelenideElement newWindowHome = $x("//*[@id='simpleLink']"); // Находим линк Home
    private final SelenideElement buttonUploadAndDownload = $x("//span[text()='Upload and Download']"); // Находим раздел "Upload And Download"
    private final SelenideElement buttonDownload = $x("//a[@href='images/sticker.png']"); // Находим кнопку "Download"
    private final SelenideElement buttonUpload = $x("//*[@id='uploadFile']"); // Находим кнопку "Upload"
    public String [] getTables () {
        return tablesWebTables.getText().split(" ");
    }
    protected void clearAndType (SelenideElement element, String value ) {
        while (!Objects.equals(element.getAttribute("value"), "")) element.sendKeys(Keys.BACK_SPACE);
        element.sendKeys(value);
    } // очищаем поле перед вводом
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
    public String afterClick () {
        return afterClickRadio.getText();
    }
    public void searchWebTables (String search) {
        buttonSearchWebTables.click();
        buttonSearchWebTables.sendKeys(search);
    }
    public String clickDownload () throws FileNotFoundException {
        File download = buttonDownload.download();
        assertNotNull(download);
        return download.getName();
    }
    public void clickUpload () {
        buttonUpload.uploadFile(new File("src/test/resources/1.png"));
    }
}
