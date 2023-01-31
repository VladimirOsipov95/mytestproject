import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$x;
/**
 *  Проверки вкладок в разделе Elements
 */
@Epic("Проверки на вкладке Elements")
public class elementsTest extends BaseTest {
    private final static String homeURL = "http://85.192.34.140:8081/";
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
        $x("//*[@id='userName']").shouldBe(Condition.visible);
        $x("//*[@id='userEmail']").shouldBe(Condition.visible);
        $x("//*[@id='currentAddress']").shouldBe(Condition.visible);
        $x("//*[@id='permanentAddress']").shouldBe (Condition.visible);
        $x("//button[@id='submit']").shouldBe(Condition.visible);
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
        Allure.step("Нажимаем кнопку  Sumbit");
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
        $x("//span[text()='Home']").shouldBe(Condition.visible);
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
        $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/label").shouldBe(Condition.visible);
        $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/label").shouldBe(Condition.visible);
        $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[4]/label").shouldBe(Condition.visible);
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
        String Yes1 = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/p/span").getText();
        Assertions.assertTrue(Yes.contains(Yes1));
        Thread.sleep(150);
        Allure.step("Кликаем в Impressive");
        elementsPage.clickImpressive();
        String Impressive = elementsPage.afterClick();
        String Impressive1 = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/p/span").getText();
        Assertions.assertTrue(Impressive.contains(Impressive1));
        Thread.sleep(150);
        Allure.step("Кликаем в No");
        elementsPage.clickNo();
        String No = elementsPage.afterClick();
        String No1 = $x("//*[@id='app']/div/div/div[2]/div[2]/div[1]/p/span").getText();
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
    @Test // надо сделать проверку отображения
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
        elementsPage.searchWebTables();
        Allure.step("Проверяем отображаемые значения");
    }
    @Test // надо сделать проверку
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
        elementsPage.sendKeysWebTables("Vladimir", "Osipov", "volodka10@yandex.ru", 25 , 12000, "Moscow");
        Allure.step("Подтверждаем изменения");
        elementsPage.clickButtonSubmit();
        Allure.step("Проверяем значения строки после редактирования");
    }
    @Test // надо сделать проверку
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
        Allure.step("Кликаем  на кнопку Add");
        elementsPage.newWebTables();
        Allure.step("Заполняем поля данным");
        elementsPage.sendKeysWebTables("Vladimir", "Osipov", "volodka10@yandex.ru", 25 , 12000, "Moscow");
        Allure.step("Подтверждаем создание");
        elementsPage.clickButtonSubmit();
        Allure.step("Проверяем значения строки после создания");
    }
    @Test // надо сделать
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
        Allure.step("Кликаем  на кнопку удаление");
        elementsPage.deleteWebTables();
        Allure.step("Проверяем что строка удалилась");
    }
}
