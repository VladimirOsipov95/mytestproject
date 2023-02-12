package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


abstract class BaseTest {
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser= "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
    @BeforeAll
    public static void start() {
        setUp();
    }
    @AfterAll
    public static void end() {
        SelenideLogger.removeListener("AllureSelenide");
        Selenide.closeWebDriver();
    }
}
