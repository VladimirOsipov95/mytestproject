package UI.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;
@Getter
public class AFWPage {
    public  void openMainPage (String url) {
        Selenide.open(url);
    }
    private final SelenideElement buttonAFW = $x("//h5[text()='Alerts, Frame & Windows']"); // Открываем Alerts, Frame & Windows
    private final SelenideElement buttonBrowserWindows = $x("//span[text()='Browser Windows']"); // Открываем Browser Windows
    private final SelenideElement buttonNewTab = $x("//*[@id=\"tabButton\"]");
    private final SelenideElement buttonNewWindow = $x("//*[@id=\"windowButton\"]");
    private final SelenideElement buttonNewWindowMessage = $x("//*[@id=\"messageWindowButton\"]");
    private final SelenideElement buttonAlerts = $x("//span[text()='Alerts']");
    private final SelenideElement alertButton = $x("//*[@id=\"alertButton\"]");
    private final SelenideElement timerAlertButton = $x("//*[@id=\"timerAlertButton\"]");
    private final SelenideElement confirmButton = $x("//*[@id=\"confirmButton\"]");
    private final SelenideElement promptButton = $x("//*[@id=\"promtButton\"]");
    private final SelenideElement buttonFrames = $x("//span[text()='Frames']");
    private final SelenideElement buttonNestedFrames = $x("//span[text()='Nested Frames']");
    private final SelenideElement buttonModalDialogs = $x("//span[text()='Modal Dialogs']");
}
