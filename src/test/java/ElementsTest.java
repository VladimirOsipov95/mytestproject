import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;

/**
 *  Проверки вкладок в разделе Elements
 */
@Epic("Проверки на вкладке Elements")
public class ElementsTest extends BaseTest {
    private final static String homeURL = "http://85.192.34.140:8081/";
    private final static String search = "Alden";
    private final static String NAME = "Vladimir";
    private final static String LAST_NAME = "Osipov";
    private final static int AGE = 25;
    private final static String EMAIL = "volodka10@yandex.ru";
    private final static int SALARY = 12000;
    private final static String DEPARTMENT = "Legal";

    @Test
    @Owner("osipov_vr")
    @Description("Открываем  раздел Text Box")
    @DisplayName("1.Открываем  раздел Text Box")
    public void openTextBox () {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Text Box");
        elementsPage.clickButtonTextBox();
        Allure.step("Проверяем содержимое раздела Text Box");
        elementsPage.getFullName().shouldBe(Condition.visible);
        elementsPage.getEmail().shouldBe(Condition.visible);
        elementsPage.getCurrentAddress().shouldBe(Condition.visible);
        elementsPage.getPermanentAddress().shouldBe (Condition.visible);
        elementsPage.getButtonSubmit().shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Проверяем работу раздела Text Box")
    @DisplayName("2.Проверяем работу раздела Text Box")
    public void workTextBox () {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Text Box");
        elementsPage.clickButtonTextBox();
        Allure.step("Заполняем поле Full Name");
        elementsPage.fullName();
        Allure.step("Заполняем поле Email");
        elementsPage.email();
        Allure.step("Заполняем поле Current  Address");
        elementsPage.currentAddress();
        Allure.step("Заполняем поле Permanent Address");
        elementsPage.permanentAddress();
        Allure.step("Нажимаем кнопку  Submit");
        elementsPage.clickButtonSubmit();
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем  раздел Check Box")
    @DisplayName("3.Открываем  раздел Check Box")
    public void openCheckBox () {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Check Box");
        elementsPage.clickButtonCheckBox();
        Allure.step("Проверяем содержимое раздела Check Box");
        elementsPage.getHome().shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Проверка работы раздела Check Box")
    @DisplayName("4.Проверка работы раздела Check Box")
    public void workCheckBox () throws InterruptedException {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Check Box");
        elementsPage.clickButtonCheckBox();
        Allure.step("Раскрываем папку Home");
        elementsPage.clickHome();
        Thread.sleep(30);
        Allure.step("Раскрываем папку Desktop");
        elementsPage.clickDesktop();
        Thread.sleep(30);
        Allure.step("Раскрываем папку Documents");
        elementsPage.clickDocuments();
        Thread.sleep(30);
        Allure.step("Раскрываем папку Downloads");
        elementsPage.clickDownloads();
        Thread.sleep(30);
        Allure.step("Активируем чек-бокс у папки Desktop");
        elementsPage.clickCheckBoxDesktop();
        Thread.sleep(30);
        Allure.step("Дизейблим чек-бокс у папки Desktop");
        elementsPage.clickCheckBoxDesktop();
        Thread.sleep(30);
        Allure.step("Активируем чек-бокс у папки Documents");
        elementsPage.clickCheckBoxDocuments();
        Thread.sleep(30);
        Allure.step("Дизейблим чек-бокс у папки Documents");
        elementsPage.clickCheckBoxDocuments();
        Thread.sleep(30);
        Allure.step("Активируем чек-бокс у папки Downloads");
        elementsPage.clickCheckBoxDownloads();
        Thread.sleep(30);
        Allure.step("Дизейблим чек-бокс у папки Downloads");
        elementsPage.clickCheckBoxDownloads();
        Thread.sleep(30);
        Allure.step("Активируем чек-бокс у папки Home");
        elementsPage.clickCheckBoxHome();
        Thread.sleep(30);
        Allure.step("Дизейблим чек-бокс у папки Home");
        elementsPage.clickCheckBoxHome();
        Thread.sleep(30);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем  раздел Radio Button")
    @DisplayName("5.Открываем  раздел Radio Button")
    public void openRadioButton () {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Radio Button ");
        elementsPage.clickRadioButton();
        Allure.step("Проверяем содержимое раздела Radio Button");
        elementsPage.getButtonYes().shouldBe(Condition.visible);
        elementsPage.getButtonImpressive().shouldBe(Condition.visible);
        elementsPage.getButtonNo().shouldBe(Condition.visible);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Проверка работы раздела Radio Button")
    @DisplayName("6.Проверка работы раздела Radio Button")
    public void workRadioButton () throws InterruptedException {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Radio Button");
        elementsPage.clickRadioButton();
        Allure.step("Кликаем в Yes");
        elementsPage.clickYes();
        String Yes = elementsPage.afterClick();
        String Yes1 = elementsPage.getAfterClickRadio().getText();
        Assertions.assertTrue(Yes.contains(Yes1));
        Thread.sleep(150);
        Allure.step("Кликаем в Impressive");
        elementsPage.clickImpressive();
        String Impressive = elementsPage.afterClick();
        String Impressive1 = elementsPage.getAfterClickRadio().getText();
        Assertions.assertTrue(Impressive.contains(Impressive1));
        Thread.sleep(150);
        Allure.step("Кликаем в No");
        elementsPage.clickNo();
        String No = elementsPage.afterClick();
        String No1 = elementsPage.getAfterClickRadio().getText();
        Assertions.assertTrue(No.contains(No1));
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем  раздел Web Tables")
    @DisplayName("7.Открываем  раздел Web Tables")
    public void openWebTables() {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Web Tables ");
        elementsPage.clickWebTables();
        Allure.step("Проверяем содержимое раздела Web Tables");
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
    @Test
    @Owner("osipov_vr")
    @Description("Поиск записей в разделе Web Tables")
    @DisplayName("8.Поиск записей в разделе Web Tables")
    public void searchWebTables() {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Web Tables ");
        elementsPage.clickWebTables();
        Allure.step("Вводим значение в поиске");
        elementsPage.searchWebTables(search);
        Allure.step("Проверяем отображаемые значения");
        $$x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]").shouldHave(texts(search));
    }
    @Test
    @Owner("osipov_vr")
    @Description("Редактирование записей в разделе Web Tables")
    @DisplayName("8.Редактирование записей в разделе Web Tables")
    public void editWebTables()  {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Web Tables ");
        elementsPage.clickWebTables();
        Allure.step("Кликаем  на кнопку редактирования");
        elementsPage.editWebTables();
        Allure.step("Изменяем значения  строки");
        elementsPage.sendKeysWebTables(NAME, LAST_NAME, EMAIL, AGE , SALARY, DEPARTMENT);
        Allure.step("Подтверждаем изменения");
        elementsPage.clickButtonSubmit();
        Allure.step("Проверяем значения строки после редактирования");
        String ACTUAL_FIRST_NAME = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[1]").getText();
        String ACTUAL_LAST_NAME = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[2]").getText();
        int ACTUAL_AGE = Integer.parseInt($x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[3]").getText());
        String ACTUAL_EMAIL = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[4]").getText();
        int ACTUAL_SALARY = Integer.parseInt($x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[5]").getText());
        String ACTUAL_DEPARTMENT = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[6]").getText();
        Assertions.assertEquals(NAME, ACTUAL_FIRST_NAME);
        Assertions.assertEquals(LAST_NAME, ACTUAL_LAST_NAME);
        Assertions.assertEquals(AGE, ACTUAL_AGE);
        Assertions.assertEquals(EMAIL, ACTUAL_EMAIL);
        Assertions.assertEquals(SALARY, ACTUAL_SALARY);
        Assertions.assertEquals(DEPARTMENT, ACTUAL_DEPARTMENT);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Добавление записей в разделе Web Tables")
    @DisplayName("9.Добавление записей в разделе Web Tables")
    public void newWebTables() {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Web Tables ");
        elementsPage.clickWebTables();
        String [] actualTables = elementsPage.getTables();
        Allure.step("Кликаем  на кнопку Add");
        elementsPage.newWebTables();
        Allure.step("Заполняем поля данным");
        elementsPage.sendKeysWebTables(NAME, LAST_NAME, EMAIL, AGE , SALARY, DEPARTMENT);
        Allure.step("Подтверждаем создание");
        elementsPage.clickButtonSubmit();
        Allure.step("Проверяем значения строки после создания");
        String [] expectedTables = elementsPage.getTables();
        Assertions.assertNotEquals(actualTables, expectedTables);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Удаление записей в разделе Web Tables")
    @DisplayName("10.Удаление записей в разделе Web Tables")
    public void deleteWebTables() {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Web Tables ");
        elementsPage.clickWebTables();
        String [] actualTables = elementsPage.getTables();
        Allure.step("Кликаем  на кнопку удаление");
        elementsPage.deleteWebTables();
        Allure.step("Проверяем что строка удалилась");
        String [] expectedTables = elementsPage.getTables();
        Assertions.assertNotEquals(actualTables,expectedTables);
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем  раздел Buttons")
    @DisplayName("11.Открываем  раздел Buttons")
    public void openButtons() {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Buttons");
        elementsPage.clickButtons();
        Allure.step("Проверяем содержимое раздела Buttons");
        elementsPage.checkButtons();
    }
    @Test
    @Owner("osipov_vr")
    @Description("Проверка двойного клика")
    @DisplayName("12.Проверка двойного клика")
    public void checkDoubleClick() {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Buttons");
        elementsPage.clickButtons();
        Allure.step("Деляем двойник клик на соответсвующую кнопку");
        elementsPage.checkDoubleClick();
        String message = $x("//*[@id='doubleClickMessage']").getOwnText();
        Assertions.assertEquals(message, "You have done a double click");
    }
    @Test
    @Owner("osipov_vr")
    @Description("Проверка правого клика")
    @DisplayName("13.Проверка правого клика")
    public void checkRightClick() {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Buttons");
        elementsPage.clickButtons();
        Allure.step("Деляем правый клик на соответсвующую кнопку");
        elementsPage.checkRightClick();
        String message = $x("//*[@id='rightClickMessage']").getOwnText();
        Assertions.assertEquals(message, "You have done a right click");
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем  раздел Links")
    @DisplayName("14.Открываем  раздел Links")
    public void openLinks() {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Links");
        elementsPage.clickButtonLinks();
        Allure.step("Проверяем содержимое раздела Links");
        elementsPage.checkLinks();
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем  новую вкладку")
    @DisplayName("14.Открываем  новую вкладку")
    public void openNewWindows() {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Links");
        elementsPage.clickButtonLinks();
        Allure.step("Кликаем на линку Home");
        elementsPage.clickNewWindowLinks();
        Allure.step("Проверяем что открылось новое окно");
        switchTo().window(1);
        $x("//h5[text()='Elements']").shouldBe(Condition.visible);
        $x("//h5[text()='Forms']").shouldBe(Condition.visible);
        $x("//h5[text()='Alerts, Frame & Windows']").shouldBe(Condition.visible);
        $x("//h5[text()='Widgets']").shouldBe(Condition.visible);
        $x("//h5[text()='Interactions']").shouldBe(Condition.visible);
        $x("//h5[text()='Game Store Application']").shouldBe(Condition.visible);
        closeWindow();
    }
    @Test
    @Owner("osipov_vr")
    @Description("Открываем  раздел Upload and Download")
    @DisplayName("15.Открываем  раздел Upload and Download")
    public void openUploadAndDownload() {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Upload and Download");
        elementsPage.openUploadAndDownload();
        Allure.step("Проверяем содержимое раздела Upload and Download");
        elementsPage.checkUploadAndDownload();
    }
    @Test
    @Owner("osipov_vr")
    @Description("Скачиваем файл")
    @DisplayName("16.Скачиваем файл")
    public void Download() throws FileNotFoundException {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Upload and Download");
        elementsPage.openUploadAndDownload();
        Allure.step("Нажимаем на кнопку Download");
        String result = elementsPage.clickDownload();
        Allure.step("Проверяем что файл скачался");
        Assertions.assertEquals(result,"sticker.png");
    }
    @Test
    @Owner("osipov_vr")
    @Description("Загружаем файл")
    @DisplayName("17.Загружаем файл")
    public void Upload()  {
        Allure.step("Открываем главную страницу");
        elementsPage elementsPage = new elementsPage(homeURL);
        Allure.step("Переходим на вкладку Elements");
        elementsPage.clickElements();
        Allure.step("Открываем раздел Upload and Download");
        elementsPage.openUploadAndDownload();
        Allure.step("Нажимаем на кнопку Upload");
        elementsPage.clickUpload();
        Allure.step("Проверяем что файл загрузился");
        $x("//*[@id='uploadedFilePath']").shouldBe(Condition.visible);
    }
}
