package UI.Tests.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта проекта
 */
public class MainPage {
    private final SelenideElement buttonElements = $x("//h5[text()='Elements']"); // Открываем Elements
    private final SelenideElement buttonForms = $x("//h5[text()='Forms']"); // Открываем Forms
    private final SelenideElement buttonAFW = $x("//h5[text()='Alerts, Frame & Windows']"); // Открываем Alerts, Frame & Windows
    private final SelenideElement buttonWidgets = $x("//h5[text()='Widgets']"); // Открываем Widgets
    private final SelenideElement buttonInteractions = $x("//h5[text()='Interactions']"); // Открываем Interactions
    private final SelenideElement buttonGSA = $x("//h5[text()='Game Store Application']"); // Открываем Game Store Application


    public void openMainPage(String url) {
        Selenide.open(url);
    }
    public void clickButtonElments () {
        buttonElements.click();
    }
    public void clickButtonFroms () {
        buttonForms.click();
    }
    public void clickButtonAFW () {
        buttonAFW.click();
    }
    public void clickButtonWidgets () {
        buttonWidgets.click();
    }
    public void clickButtonInteractions () {
        buttonInteractions.click();
    }
    public void clickButtonGSA () {
        buttonGSA.click();
    }
}
