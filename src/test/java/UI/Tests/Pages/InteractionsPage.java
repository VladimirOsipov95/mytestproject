package UI.Tests.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import lombok.Getter;


import static com.codeborne.selenide.Selenide.$x;
@Getter
public class InteractionsPage {
    private final SelenideElement buttonInteractions = $x("//h5[text()='Interactions']"); // Открываем Interactions
    private final SelenideElement buttonSortable = $x("//span[text()='Sortable']");
    private final SelenideElement buttonSelectable = $x("//span[text()='Selectable']");
    private final SelenideElement buttonResizable = $x("//span[text()='Resizable']");
    private final SelenideElement buttonDroppable = $x("//span[text()='Droppable']");
    private final SelenideElement buttonDragabble = $x("//span[text()='Dragabble']");
    public  void openMainPage (String url) {
        Selenide.open(url);
    }
}
