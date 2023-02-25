package UI.Tests;

import UI.Pages.ElementsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;
/**
 *  Проверки вкладок в разделе Elements
 */

@DisplayName("Проверки на вкладке Elements")
@Feature("Elements")
@Epic("UI")
public class ElementsTest extends BaseTest {

    ElementsPage page = new ElementsPage();
    @BeforeEach
    public void startPage () {
        Allure.step("Открываем главную страницу",
                ()-> page.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Elements",
                ()-> page
                        .getButtonElements()
                        .click());
    }


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
    @Order(1)
    @Description("Открываем  раздел Text Box")
    @DisplayName("1.Открываем  раздел Text Box")
    public void openTextBox () {
        Allure.step("Открываем раздел Text Box",
                ()-> page
                        .getButtonTextBox()
                        .click());
        Allure.step("Проверяем содержимое раздела Text Box",
                ()-> {
                    page
                            .getFullName()
                            .shouldBe(Condition.visible);
                    page
                            .getEmail()
                            .shouldBe(Condition.visible);
                    page
                            .getCurrentAddress()
                            .shouldBe(Condition.visible);
                    page
                            .getPermanentAddress()
                            .shouldBe (Condition.visible);
                    page
                            .getButtonSubmit()
                            .shouldBe(Condition.visible);
                });

    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("Проверяем работу раздела Text Box")
    @DisplayName("2.Проверяем работу раздела Text Box")
    public void workTextBox () {
        Allure.step("Открываем раздел Text Box",
                ()-> page
                        .getButtonTextBox()
                        .click());
        Allure.step("Заполняем поле Full Name",
                page::fullName);
        Allure.step("Заполняем поле Email",
                page::email);
        Allure.step("Заполняем поле Current  Address",
                page::currentAddress);
        Allure.step("Заполняем поле Permanent Address",
                page::permanentAddress);
        Allure.step("Нажимаем кнопку  Submit",
                ()-> page
                        .getButtonSubmit()
                        .click());
    }
    @Test
    @Owner("osipov_vr")
    @Order(3)
    @Description("Открываем  раздел Check Box")
    @DisplayName("3.Открываем  раздел Check Box")
    public void openCheckBox () {
        Allure.step("Открываем раздел Check Box",
                ()->page
                        .getButtonCheckBox()
                        .click());
        Allure.step("Проверяем содержимое раздела Check Box",
                ()->page
                        .getCheckBoxHome()
                        .shouldBe(Condition.visible));
    }
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("Проверка работы раздела Check Box")
    @DisplayName("4.Проверка работы раздела Check Box")
    public void workCheckBox ()  {
        Allure.step("Открываем раздел Check Box",
                ()->page
                        .getButtonCheckBox()
                        .click());
        Allure.step("Раскрываем папку Home",
                ()->{
                    page
                            .getButtonHome()
                            .click();
                    Thread.sleep(30);
                });
        Allure.step("Раскрываем папку Desktop",
                ()-> {
                    page
                            .getButtonDesktop()
                            .click();
                    Thread.sleep(30);
                });
        Allure.step("Раскрываем папку Documents",
                ()->{
                    page
                            .getButtonDocuments()
                            .click();
                    Thread.sleep(30);
                });
        Allure.step("Раскрываем папку Downloads",
                ()->{
                    page
                            .getButtonDownloads()
                            .click();
                    Thread.sleep(30);
                });
        Allure.step("Активируем чек-бокс у папки Desktop",
                ()->{
                    page
                            .getCheckBoxDesktop()
                            .click();
                    Thread.sleep(30);
                });
        Allure.step("Дизейблим чек-бокс у папки Desktop",
                ()-> {
                    page
                            .getCheckBoxDesktop()
                            .click();
                    Thread.sleep(30);
                });

        Allure.step("Активируем чек-бокс у папки Documents",
                ()->{
                    page
                            .getCheckBoxDocuments()
                            .click();
                    Thread.sleep(30);
                });

        Allure.step("Дизейблим чек-бокс у папки Documents",
                ()->{
                    page
                            .getCheckBoxDocuments()
                            .click();
                    Thread.sleep(30);
                });
        Allure.step("Активируем чек-бокс у папки Downloads",
                ()->{
                    page
                            .getCheckBoxDownloads()
                            .click();
                    Thread.sleep(30);
                });

        Allure.step("Дизейблим чек-бокс у папки Downloads",
                ()->{
                    page
                            .getCheckBoxDownloads()
                            .click();
                    Thread.sleep(30);
                });
        Allure.step("Активируем чек-бокс у папки Home",
                ()->{
                    page
                            .getCheckBoxHome()
                            .click();
                    Thread.sleep(30);
                });
        Allure.step("Дизейблим чек-бокс у папки Home",
                ()-> page
                        .getCheckBoxDownloads()
                        .click());
    }
    @Test
    @Owner("osipov_vr")
    @Order(5)
    @Description("Открываем  раздел Radio Button")
    @DisplayName("5.Открываем  раздел Radio Button")
    public void openRadioButton () {
        Allure.step("Открываем раздел Radio Button",
                ()-> page
                        .getButtonRadioButton()
                        .click());
        Allure.step("Проверяем содержимое раздела Radio Button",
                ()->{
                    page
                            .getButtonYes()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonImpressive()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonNo()
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(6)
    @Description("Проверка работы раздела Radio Button")
    @DisplayName("6.Проверка работы раздела Radio Button")
    public void workRadioButton ()  {
        Allure.step("Открываем раздел Radio Button",
                ()-> page
                        .getButtonRadioButton()
                        .click());
        Allure.step("Кликаем в Yes",
                ()-> {
                    page.getButtonYes().click();
                    String Yes = page.afterClick();
                    String Yes1 = page.getAfterClickRadio().getText();
                    Assertions.assertTrue(Yes.contains(Yes1));
                    Thread.sleep(150);
                });
        Allure.step("Кликаем в Impressive",
                ()->{
                    page.getButtonImpressive().click();
                    String Impressive = page.afterClick();
                    String Impressive1 = page.getAfterClickRadio().getText();
                    Assertions.assertTrue(Impressive.contains(Impressive1));
                    Thread.sleep(150);
                });
        Allure.step("Кликаем в No",
                ()-> {
                    page.getButtonNo().click();
                    String No = page.afterClick();
                    String No1 = page.getAfterClickRadio().getText();
                    Assertions.assertTrue(No.contains(No1));
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(7)
    @Description("Открываем  раздел Web Tables")
    @DisplayName("7.Открываем  раздел Web Tables")
    public void openWebTables() {
        Allure.step("Открываем раздел Web Tables",
                ()->page
                        .getButtonWebTables()
                        .click());
        Allure.step("Проверяем содержимое раздела Web Tables",
                ()->{
                    $x("//*[@id='addNewRecordButton']")
                            .shouldBe(Condition.visible);
                    $x("//*[@id='searchBox']")
                            .shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[2]/span[1]/div/input")
                            .shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[2]/span[2]/select")
                            .shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[1]/div[1]")
                            .shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[2]/div[1]")
                            .shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[3]")
                            .shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[4]/div[1]")
                            .shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[5]/div[1]")
                            .shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[6]/div[1]")
                            .shouldBe(Condition.visible);
                    $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/div[7]/div[1]")
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(8)
    @Description("Поиск записей в разделе Web Tables")
    @DisplayName("8.Поиск записей в разделе Web Tables")
    public void searchWebTables() {
        Allure.step("Открываем раздел Web Tables ",
                ()->page
                        .getButtonWebTables()
                        .click());
        Allure.step("Вводим значение в поиске",
                ()->page.searchWebTables(search));
        Allure.step("Проверяем отображаемые значения",
                ()->$$x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]")
                        .shouldHave(texts(search)));
    }
    @Test
    @Owner("osipov_vr")
    @Order(9)
    @Description("Редактирование записей в разделе Web Tables")
    @DisplayName("9.Редактирование записей в разделе Web Tables")
    public void editWebTables()  {
        Allure.step("Открываем раздел Web Tables ",
                ()->page
                        .getButtonWebTables()
                        .click());
        Allure.step("Кликаем  на кнопку редактирования",
                ()-> page
                        .getEditWebTables()
                        .click());
        Allure.step("Изменяем значения  строки",
                ()->page.sendKeysWebTables(NAME, LAST_NAME, EMAIL, AGE , SALARY, DEPARTMENT));
        Allure.step("Подтверждаем изменения",
                ()-> page
                        .getButtonSubmit()
                        .click());
        Allure.step("Проверяем значения строки после редактирования",
                ()->{
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
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(10)
    @Description("Добавление записей в разделе Web Tables")
    @DisplayName("10.Добавление записей в разделе Web Tables")
    public void newWebTables() {
        Allure.step("Открываем раздел Web Tables ",
                ()->page
                        .getButtonWebTables()
                        .click());
        String [] actualTables = page.getTables();
        Allure.step("Кликаем  на кнопку Add",
                ()->page
                        .getNewWebTables()
                        .click());
        Allure.step("Заполняем поля данным",
                ()->page.sendKeysWebTables(NAME, LAST_NAME, EMAIL, AGE , SALARY, DEPARTMENT));
        Allure.step("Подтверждаем создание",
                ()-> page
                        .getButtonSubmit()
                        .click());
        Allure.step("Проверяем значения строки после создания",
                ()-> {
                    String [] expectedTables = page.getTables();
                    Assertions.assertNotEquals(actualTables, expectedTables);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(11)
    @Description("Удаление записей в разделе Web Tables")
    @DisplayName("11.Удаление записей в разделе Web Tables")
    public void deleteWebTables() {
        Allure.step("Открываем раздел Web Tables ",
                ()->page
                        .getButtonWebTables()
                        .click());
        String [] actualTables = page.getTables();
        Allure.step("Кликаем  на кнопку удаление",
                ()->page
                        .getDeleteWebTables()
                        .click());
        Allure.step("Проверяем что строка удалилась",
                ()-> {
                    String [] expectedTables = page.getTables();
                    Assertions.assertNotEquals(actualTables,expectedTables);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(12)
    @Description("Открываем  раздел Buttons")
    @DisplayName("12.Открываем  раздел Buttons")
    public void openButtons() {
        Allure.step("Открываем раздел Buttons",
                ()-> {
                    page
                            .getButtonButtons()
                            .click();
                    Selenide.sleep(2000);
                });
        Allure.step("Проверяем содержимое раздела Buttons",
                ()-> {
            page
                    .getButtonClickClick()
                    .shouldBe(Condition.visible);
            page
                    .getButtonDoubleClick()
                    .shouldBe(Condition.visible);
            page
                    .getButtonRightClick()
                    .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(13)
    @Description("Проверка двойного клика")
    @DisplayName("13.Проверка двойного клика")
    public void checkDoubleClick()  {
        Allure.step("Открываем раздел Buttons",
                ()->{
                    page
                            .getButtonButtons()
                            .click();
                    Selenide.sleep(2000);
                });

        Allure.step("Деляем двойник клик на соответсвующую кнопку",
                ()->{
                    page
                            .getButtonDoubleClick()
                            .doubleClick();
                    String message = $x("//*[@id='doubleClickMessage']").getOwnText();
                    Assertions.assertEquals(message, "You have done a double click");
                });

    }
    @Test
    @Owner("osipov_vr")
    @Order(14)
    @Description("Проверка правого клика")
    @DisplayName("14.Проверка правого клика")
    public void checkRightClick()  {
        Allure.step("Открываем раздел Buttons",
                ()->{
                    page
                            .getButtonButtons()
                            .click();
                    Selenide.sleep(2000);
                });
        Allure.step("Деляем правый клик на соответсвующую кнопку",
                ()->{
                    page
                            .getButtonRightClick()
                            .contextClick();
                    String message = $x("//*[@id='rightClickMessage']").getOwnText();
                    Assertions.assertEquals(message, "You have done a right click");
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(15)
    @Description("Открываем  раздел Links")
    @DisplayName("15.Открываем  раздел Links")
    public void openLinks() {
        Allure.step("Открываем раздел Links",
                ()->page
                        .getButtonLinks()
                        .click());
        Allure.step("Проверяем содержимое раздела Links",
                ()-> {
            page
                    .getOpenNewTabsLinks()
                    .shouldBe(Condition.visible);
            page
                    .getSendAnApiCall()
                    .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(16)
    @Description("Открываем  новую вкладку")
    @DisplayName("16.Открываем  новую вкладку")
    public void openNewWindows() {
        Allure.step("Открываем раздел Links",
                ()->page
                        .getButtonLinks()
                        .click());
        Allure.step("Кликаем на линку Home",
                ()-> page
                        .getNewWindowHome()
                        .click());
        Allure.step("Проверяем что открылось новое окно",
                ()->{
                    switchTo().window(1);
                    $x("//h5[text()='Elements']")
                            .shouldBe(Condition.visible);
                    $x("//h5[text()='Forms']")
                            .shouldBe(Condition.visible);
                    $x("//h5[text()='Alerts, Frame & Windows']")
                            .shouldBe(Condition.visible);
                    $x("//h5[text()='Widgets']")
                            .shouldBe(Condition.visible);
                    $x("//h5[text()='Interactions']")
                            .shouldBe(Condition.visible);
                    $x("//h5[text()='Game Store Application']")
                            .shouldBe(Condition.visible);
                    closeWindow();
                });

    }
    @Test
    @Owner("osipov_vr")
    @Order(17)
    @Description("Открываем  раздел Upload and Download")
    @DisplayName("17.Открываем  раздел Upload and Download")
    public void openUploadAndDownload() {
        Allure.step("Открываем раздел Upload and Download",
                ()-> page
                        .getButtonUploadAndDownload()
                        .click());
        Allure.step("Проверяем содержимое раздела Upload and Download",
                ()-> {
            page
                    .getButtonUpload()
                    .shouldBe(Condition.visible);
            page
                    .getButtonDownload()
                    .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(18)
    @Description("Скачиваем файл")
    @DisplayName("18.Скачиваем файл")
    public void Download() {
        Allure.step("Открываем раздел Upload and Download",
                ()-> page
                        .getButtonUploadAndDownload()
                        .click());
        Allure.step("Нажимаем на кнопку Download и проверяем что файл скачался",
                ()->{
                    String result = page.clickDownload();
                    Assertions.assertEquals(result,"sticker.png");
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(19)
    @Description("Загружаем файл")
    @DisplayName("19.Загружаем файл")
    public void Upload()  {
        Allure.step("Открываем раздел Upload and Download",
                ()-> page
                        .getButtonUploadAndDownload()
                        .click());
        Allure.step("Нажимаем на кнопку Upload",
                page::clickUpload);
        Allure.step("Проверяем что файл загрузился",
                ()->$x("//*[@id='uploadedFilePath']")
                        .shouldBe(Condition.visible));
    }
}
