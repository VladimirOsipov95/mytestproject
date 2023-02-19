package UI.Tests.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GameStoreApplicationPage {
    public  void openMainPage (String url) {
        Selenide.open(url);
    }
    private final SelenideElement buttonGSA = $x("//h5[text()='Game Store Application']"); // Открываем Game Store Application

    public SelenideElement getButtonGSA() {
        return buttonGSA;
    }
    private final SelenideElement buttonLinkPage = $x("//span[text()='Link Page']"); // Открываем Link page
    public SelenideElement getButtonLinkPage() {
        return buttonLinkPage;
    }
    private final SelenideElement textLinkPage = $x("//*[@id=\"notLoggin-label\"]");
    private final SelenideElement linkLinkPage = $x("//a[text()='link']");

    public SelenideElement getTextLinkPage() {
        return textLinkPage;
    }

    public SelenideElement getLinkLinkPage() {
        return linkLinkPage;
    }
}
