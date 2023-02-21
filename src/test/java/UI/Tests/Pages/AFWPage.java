package UI.Tests.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AFWPage {
    public  void openMainPage (String url) {
        Selenide.open(url);
    }
    private final SelenideElement buttonAFW = $x("//h5[text()='Alerts, Frame & Windows']"); // Открываем Alerts, Frame & Windows

    public SelenideElement getButtonAFW() {
        return buttonAFW;
    }
    private final SelenideElement buttonBrowserWindows = $x("//span[text()='Browser Windows']"); // Открываем Browser Windows
    private final SelenideElement buttonNewTab = $x("//*[@id=\"tabButton\"]");
    private final SelenideElement buttonNewWindow = $x("//*[@id=\"windowButton\"]");
    private final SelenideElement buttonNewWindowMessage = $x("//*[@id=\"messageWindowButton\"]");

    public SelenideElement getButtonNewTab() {
        return buttonNewTab;
    }

    public SelenideElement getButtonNewWindow() {
        return buttonNewWindow;
    }

    public SelenideElement getButtonNewWindowMessage() {
        return buttonNewWindowMessage;
    }

    private final SelenideElement buttonAlerts = $x("//span[text()='Alerts']");
    private final SelenideElement alertButton = $x("//*[@id=\"alertButton\"]");
    private final SelenideElement timerAlertButton = $x("//*[@id=\"timerAlertButton\"]");
    private final SelenideElement confirmButton = $x("//*[@id=\"confirmButton\"]");
    private final SelenideElement promptButton = $x("//*[@id=\"promtButton\"]");

    public SelenideElement getAlertButton() {
        return alertButton;
    }

    public SelenideElement getTimerAlertButton() {
        return timerAlertButton;
    }

    public SelenideElement getConfirmButton() {
        return confirmButton;
    }

    public SelenideElement getPromptButton() {
        return promptButton;
    }

    private final SelenideElement buttonFrames = $x("//span[text()='Frames']");
    private final SelenideElement buttonNestedFrames = $x("//span[text()='Nested Frames']");
    private final SelenideElement buttonModalDialogs = $x("//span[text()='Modal Dialogs']");

    public SelenideElement getButtonBrowserWindows() {
        return buttonBrowserWindows;
    }

    public SelenideElement getButtonAlerts() {
        return buttonAlerts;
    }

    public SelenideElement getButtonFrames() {
        return buttonFrames;
    }

    public SelenideElement getButtonNestedFrames() {
        return buttonNestedFrames;
    }

    public SelenideElement getButtonModalDialogs() {
        return buttonModalDialogs;
    }
}
