package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * ������� �������� ����� �������
 */
public class MainPage {
    private final SelenideElement buttonElements = $x("//h5[text()='Elements']"); // ��������� Elements
    private final SelenideElement buttonForms = $x("//h5[text()='Forms']"); // ��������� Forms
    private final SelenideElement buttonAFW = $x("//h5[text()='Alerts, Frame & Windows']"); // ��������� Alerts, Frame & Windows
    private final SelenideElement buttonWidgets = $x("//h5[text()='Widgets']"); // ��������� Widgets
    private final SelenideElement buttonInteractions = $x("//h5[text()='Interactions']"); // ��������� Interactions
    private final SelenideElement buttonGSA = $x("//h5[text()='Game Store Application']"); // ��������� Game Store Application


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
