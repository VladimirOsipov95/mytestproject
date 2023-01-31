import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;


abstract class BaseTest {
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser= "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
    @Before
    public void start () {
        setUp();
    }
    @After
    public  void  end () {
        Selenide.closeWebDriver();
    }
}
