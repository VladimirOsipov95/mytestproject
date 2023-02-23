package UI.Tests.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;
@Getter
public class GameStoreApplicationPage {
    private final SelenideElement buttonGSA = $x("//h5[text()='Game Store Application']"); // Открываем Game Store Application
    private final SelenideElement buttonLinkPage = $x("//span[text()='Link Page']"); // Открываем Link page
    private final SelenideElement textLinkPage = $x("//*[@id=\"notLoggin-label\"]");
    private final SelenideElement linkLinkPage = $x("//a[text()='link']");
    public  void openMainPage (String url) {
        Selenide.open(url);
    }

}
