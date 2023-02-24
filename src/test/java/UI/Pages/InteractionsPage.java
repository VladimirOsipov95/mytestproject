package UI.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import lombok.Getter;


import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
@Getter
public class InteractionsPage {
    private final SelenideElement buttonInteractions = $x("//h5[text()='Interactions']"); // Открываем Interactions
    private final SelenideElement buttonSortable = $x("//span[text()='Sortable']");
    private final SelenideElement buttonSelectable = $x("//span[text()='Selectable']");
    private final SelenideElement buttonResizable = $x("//span[text()='Resizable']");
    private final SelenideElement buttonDroppable = $x("//span[text()='Droppable']");
    private final SelenideElement buttonDragabble = $x("//span[text()='Dragabble']");
    private final SelenideElement tabList = $x("//*[@id=\"demo-tab-list\"]");
    private final SelenideElement tabGrid = $x("//*[@id=\"demo-tab-grid\"]");
    private final ElementsCollection tabPaneList = $$x("//*[@id=\"demo-tabpane-list\"]/div/div");
    public  void openMainPage (String url) {
        Selenide.open(url);
    }
}
