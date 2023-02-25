package UI.Tests;

import UI.Pages.InteractionsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * Проверка работы разделов на вкладке Interactions
 */

@DisplayName("Проверки на вкладке Interactions")
@Feature("Game Store ApplicationInteractions")
@Epic("UI")
public class InteractionsTest extends BaseTest {
    InteractionsPage page = new InteractionsPage();
    @BeforeEach
    public  void startPage () {
        Allure.step("Открываем главную страницу",
                ()-> page.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Interactions",
                ()->page
                        .getButtonInteractions()
                        .click());
    }
    private final static String homeURL = "http://85.192.34.140:8081/";
    private final static String element = "One";
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Открываем  вкладку Interactions")
    @DisplayName("1.Открываем  вкладку Interactions")
    public void openWidgets () {
        Allure.step("Проверяем содержимое раздела Interactions",
        ()-> {
            page.getButtonSortable()
                    .shouldBe(Condition.visible);
            page.getButtonSelectable()
                    .shouldBe(Condition.visible);
            page.getButtonResizable()
                    .shouldBe(Condition.visible);
            page.getButtonDroppable()
                    .shouldBe(Condition.visible);
            page.getButtonDragabble()
                    .shouldBe(Condition.visible);
        });
    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("Открываем  раздел  Sortable")
    @DisplayName("2.Открываем  раздел Sortable")
    public void openSortable () {
        Allure.step("Переходм в раздел Sortable",
                () -> page
                        .getButtonSortable()
                        .click());
        Allure.step("Проверяем содержимое раздела Sortable",
                () -> {
                    page.getTabList()
                            .shouldBe(Condition.visible);
                    page.getTabList()
                            .shouldBe(Condition.visible);
                    for (SelenideElement element : page.getTabPaneList()) {
                        if (!element.isDisplayed()) {
                            throw new AssertionError("Элемента нет на экране");
                        }
                    }
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(3)
    @Description("Работа в разделе Sortable")
    @DisplayName("3.Работа в разделе Sortable")
    public void workSortable () {
        Allure.step("Проверяем содержимое раздела Sortable",
                ()-> page
                        .getButtonSortable()
                        .click());
        Allure.step("Изменяем порядок элементов в List",
                ()-> {
            page
                    .getTabPaneList()
                    .last()
                    .scrollIntoView(true);
            Selenide
                    .actions()
                    .clickAndHold(page.getTabPaneList().first())
                    .dragAndDrop(page.getTabPaneList().first(), page.getTabPaneList().last())
                    .build()
                    .perform();
                    Allure.step("Проверяем что элемент " +element+" переместился в конец списка",
                            ()-> page
                                    .getTabPaneList()
                                    .last()
                                    .shouldHave(Condition.text(element)));
        });
    }
}
