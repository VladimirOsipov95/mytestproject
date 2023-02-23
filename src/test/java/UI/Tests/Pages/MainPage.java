package UI.Tests.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта проекта
 */
@Getter
public class MainPage {
    public void openMainPage(String url) {
        Selenide.open(url);
    }
    private final SelenideElement buttonElements = $x("//h5[text()='Elements']"); // Открываем Elements
    private final SelenideElement buttonForms = $x("//h5[text()='Forms']"); // Открываем Forms
    private final SelenideElement buttonAFW = $x("//h5[text()='Alerts, Frame & Windows']"); // Открываем Alerts, Frame & Windows
    private final SelenideElement buttonWidgets = $x("//h5[text()='Widgets']"); // Открываем Widgets
    private final SelenideElement buttonInteractions = $x("//h5[text()='Interactions']"); // Открываем Interactions
    private final SelenideElement buttonGSA = $x("//h5[text()='Game Store Application']"); // Открываем Game Store Application
}
