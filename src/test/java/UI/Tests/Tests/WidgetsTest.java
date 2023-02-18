package UI.Tests.Tests;


import UI.Tests.Pages.WidgetsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


@Epic("Проверки на вкладке Widgets")
public class WidgetsTest extends BaseTest {
    private final static String homeURL = "http://85.192.34.140:8081/";
    private final static String textSection1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    private final static String  textSection2  = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.";
    private final static String  textSection3  = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
    @Test
    @Owner("osipov_vr")
    @Order(1)
    @Description("Открываем  вкладку Widgets")
    @DisplayName("1.Открываем  вкладку Widgets")
    public void openWidgets () {
        WidgetsPage widgetsPage = new WidgetsPage();
        Allure.step("Открываем главную страницу",
                ()-> widgetsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                ()->widgetsPage
                        .getButtonWidgets()
                        .click());
        Allure.step("Проверяем содержимое раздела Widgets",
                ()-> {
                    widgetsPage
                            .getButtonAccordian()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getButtonAutoComplete()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getButtonDatePicker()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getButtonSlider()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getButtonProgressBar()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getButtonTabs()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getButtonToolTips()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getButtonMenu()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getButtonSelectMenu()
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(2)
    @Description("Открываем  раздел Accordian")
    @DisplayName("2.Открываем  раздел Accordian")
    public void openAccordian () {
        WidgetsPage widgetsPage = new WidgetsPage();
        Allure.step("Открываем главную страницу",
                () -> widgetsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                () -> widgetsPage
                        .getButtonWidgets()
                        .click());
        Allure.step("Переходим в раздел  Accordian",
                () -> widgetsPage
                        .getButtonAccordian()
                        .click());
        Allure.step("Проверяем содреждание раздела Accordian",
                () -> {
                    widgetsPage
                            .getSection1()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getSection2()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getSection3()
                            .shouldBe(Condition.visible);
                    widgetsPage
                            .getSection1Content()
                            .shouldBe(Condition.visible);
                    widgetsPage

                            .getSection2Content()
                            .shouldNotBe(Condition.visible);
                    widgetsPage
                            .getSection3Content()
                            .shouldNotBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(3)
    @Description("Проверяем  раздел Accordian")
    @DisplayName("3.Проверяем  раздел Accordian")
    public void workAccordian () {
        WidgetsPage widgetsPage = new WidgetsPage();
        Allure.step("Открываем главную страницу",
                () -> widgetsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                () -> widgetsPage
                        .getButtonWidgets()
                        .click());
        Allure.step("Переходим в раздел  Accordian",
                () -> widgetsPage
                        .getButtonAccordian()
                        .click());
        Allure.step("Проверяем текст в 1 секции",
                () -> Assertions.assertEquals(textSection1, widgetsPage.getSection1Content().getText()));
        Allure.step("Открываем 2 секцию",
                () -> {
                    widgetsPage
                            .getSection2()
                            .click();
                    Selenide.sleep(1000);
                    Allure.step("Проверяем текст во 2 секции",
                            () -> Assertions.assertEquals(textSection2, widgetsPage.getSection2Content().getText().trim().replace("\n", " ")));
                });
        Allure.step("Открываем 3 секцию",
                () -> {
                    widgetsPage
                            .getSection3()
                            .click();
                    Selenide.sleep(1000);
                    Allure.step("Проверяем текст в 3 секции",
                            () -> Assertions.assertEquals(textSection3, widgetsPage.getSection3Content().getText()));
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("Открываем  раздел Slider")
    @DisplayName("4.Открываем  раздел Slider")
    public void openSlider () {
        WidgetsPage widgetsPage = new WidgetsPage();
        Allure.step("Открываем главную страницу",
                () -> widgetsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                () -> widgetsPage
                        .getButtonWidgets()
                        .click());
        Allure.step("Переходим в раздел  Slider",
                () -> widgetsPage
                        .getButtonSlider()
                        .click());
        Allure.step("Проверяем содреждание раздела Slider",
                () -> {
            widgetsPage.getSlider().shouldBe(Condition.visible);
            widgetsPage.getSliderInput().shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(5) //сделать проверку на перенос слайдера
    @Description("Проверяем работу слайдера")
    @DisplayName("5.Проверяем работу слайдера")
    public void workSlider () {
        WidgetsPage widgetsPage = new WidgetsPage();
        Allure.step("Открываем главную страницу",
                () -> widgetsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                () -> widgetsPage
                        .getButtonWidgets()
                        .click());
        Allure.step("Переходим в раздел  Slider",
                () -> widgetsPage
                        .getButtonSlider()
                        .click());
        Allure.step("Проверяем работу раздела Slider",
                () -> {
                    // widgetsPage.getSlider().dragAndDropTo("55");
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(6)
    @Description("Открываем  раздел Progress Bar")
    @DisplayName("6.Открываем  раздел Progress Bar")
    public void openProgressBar () {
        WidgetsPage widgetsPage = new WidgetsPage();
        Allure.step("Открываем главную страницу",
                () -> widgetsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                () -> widgetsPage
                        .getButtonWidgets()
                        .click());
        Allure.step("Переходим в раздел  Progress Bar",
                () -> widgetsPage
                        .getButtonProgressBar()
                        .click());
        Allure.step("Проверяем содреждание раздела Progress Bar",
                () -> {
                    widgetsPage.getButtonStart().shouldBe(Condition.visible);
                    widgetsPage.getProgressBar().shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(7)
    @Description("Проверяем работу Progress Bar")
    @DisplayName("7.Проверяем работу Progress Bar")
    public void workProgressBar () {
        WidgetsPage widgetsPage = new WidgetsPage();
        Allure.step("Открываем главную страницу",
                () -> widgetsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                () -> widgetsPage
                        .getButtonWidgets()
                        .click());
        Allure.step("Переходим в раздел  Progress Bar",
                () -> widgetsPage
                        .getButtonProgressBar()
                        .click());
        Allure.step("Нажимаем на кнопку Start",
                () -> {
                    widgetsPage.getButtonStart().click();
                    Allure.step(":Ждем пока Progress Bar достигнет 100%",
                            () -> {
                                String progress;
                                do
                                {
                                    progress = widgetsPage.getProgressBar().getText();
                                }
                                while (!progress.equals("100%"));
                            });
                });
        Allure.step("Проверяем что Progrees Bar достиг 100% и появлиась кнопка Reset",
                () -> {
                    Assertions.assertEquals("100%", widgetsPage.getProgressBar().getText());
                    widgetsPage.getButtonReset().shouldBe(Condition.visible);
                });
        Allure.step("Нажимаем на Reset",
                () -> {
                    widgetsPage
                            .getButtonReset()
                            .click();
                    Assertions.assertEquals("0%", widgetsPage.getProgressBar().getText());
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(8)
    @Description("Открываем  раздел Tabs")
    @DisplayName("8.Открываем  раздел Tabs")
    public void openTabs () {
        WidgetsPage widgetsPage = new WidgetsPage();
        Allure.step("Открываем главную страницу",
                () -> widgetsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                () -> widgetsPage
                        .getButtonWidgets()
                        .click());
        Allure.step("Переходим в раздел  Tabs",
                () -> widgetsPage
                        .getButtonTabs()
                        .click());
        Allure.step("Проверяем содреждание раздела Tabs",
                () -> {
                    widgetsPage.getTabWhat().shouldBe(Condition.visible);
                    widgetsPage.getTabOrigin().shouldBe(Condition.visible);
                    widgetsPage.getTabUse().shouldBe(Condition.visible);
                    widgetsPage.getTabMore().shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(9)
    @Description("Открываем  раздел Tabs")
    @DisplayName("9.Открываем  раздел Tabs")
    public void workTabs () {
        WidgetsPage widgetsPage = new WidgetsPage();
        Allure.step("Открываем главную страницу",
                () -> widgetsPage.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                () -> widgetsPage
                        .getButtonWidgets()
                        .click());
        Allure.step("Переходим в раздел  Tabs",
                () -> widgetsPage
                        .getButtonTabs()
                        .click());
        Allure.step("Проверяем текст в  табе What",
                () -> Assertions.assertEquals(textSection1, widgetsPage.getTextWhat().getText()));
        Allure.step("Открываем таб Origin",
                () -> {
                    widgetsPage
                            .getTabOrigin()
                            .click();
                    Selenide.sleep(1000);
                    Allure.step("Проверяем текст в  табе Origin",
                            () -> Assertions.assertEquals(textSection2, widgetsPage.getTextOrigin().getText().trim().replace("\n", " ")));
                });
        Allure.step("Открываем таб Use",
                () -> {
                    widgetsPage
                            .getTabUse()
                            .click();
                    Selenide.sleep(1000);
                    Allure.step("Проверяем текст в  табе Use",
                            () -> Assertions.assertEquals(textSection3, widgetsPage.getTextUse().getText()));
                });
        Allure.step("Проверяем  таб More недоступен",
                () -> widgetsPage.getTabMore().shouldBe(Condition.enabled));
    }
}
