package UI.Tests.Tests;

import UI.Tests.Pages.InteractionsPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
/**
 * Проверка работы разделов на вкладке Interactions
 */
@Epic("Проверки на вкладке Interactions")
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
}
