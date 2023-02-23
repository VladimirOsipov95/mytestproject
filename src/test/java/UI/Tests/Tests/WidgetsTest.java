package UI.Tests.Tests;


import UI.Tests.Pages.WidgetsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Проверка работы разделов на вкладке Widgets
 */
@Epic("Проверки на вкладке Widgets")
public class WidgetsTest extends BaseTest {
    WidgetsPage page = new WidgetsPage();
    @BeforeEach
    public  void startPage () {
        Allure.step("Открываем главную страницу",
                ()-> page.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                ()->page
                        .getButtonWidgets()
                        .click());
    }
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
        Allure.step("Проверяем содержимое раздела Widgets",
                ()-> {
                    page
                            .getButtonAccordian()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonAutoComplete()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonDatePicker()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonSlider()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonProgressBar()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonTabs()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonToolTips()
                            .shouldBe(Condition.visible);
                    page
                            .getButtonMenu()
                            .shouldBe(Condition.visible);
                    page
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
        Allure.step("Переходим в раздел  Accordian",
                () -> page
                        .getButtonAccordian()
                        .click());
        Allure.step("Проверяем содреждание раздела Accordian",
                () -> {
                    page
                            .getSection1()
                            .shouldBe(Condition.visible);
                    page
                            .getSection2()
                            .shouldBe(Condition.visible);
                    page
                            .getSection3()
                            .shouldBe(Condition.visible);
                    page
                            .getSection1Content()
                            .shouldBe(Condition.visible);
                    page

                            .getSection2Content()
                            .shouldNotBe(Condition.visible);
                    page
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
        Allure.step("Переходим в раздел  Accordian",
                () -> page
                        .getButtonAccordian()
                        .click());
        Allure.step("Проверяем что в 1 секции текст" +textSection1,
                () -> page
                        .getSection1Content()
                        .shouldHave(text(textSection1)));
        Allure.step("Открываем 2 секцию",
                () -> {
                    page
                            .getSection2()
                            .click();
                    Selenide.sleep(1000);
                    Allure.step("Проверяем текст во 2 секции текст" +textSection2,
                            () -> Assertions.assertEquals(textSection2, page.getSection2Content().getText().trim().replace("\n", " ")));
                });
        Allure.step("Открываем 3 секцию",
                () -> {
                    page
                            .getSection3()
                            .click();
                    Selenide.sleep(1000);
                    Allure.step("Проверяем что в 3 секции текст"+textSection3,
                            () -> page
                                    .getSection3Content()
                                    .shouldHave(text(textSection3)));
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(4)
    @Description("Открываем  раздел Slider")
    @DisplayName("4.Открываем  раздел Slider")
    public void openSlider () {
        Allure.step("Переходим в раздел  Slider",
                () -> page
                        .getButtonSlider()
                        .click());
        Allure.step("Проверяем содреждание раздела Slider",
                () -> {
            page
                    .getSlider()
                    .shouldBe(Condition.visible);
            page
                    .getSliderInput()
                    .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(5) 
    @Description("Проверяем работу слайдера")
    @DisplayName("5.Проверяем работу слайдера")
    public void workSlider () {
        Allure.step("Переходим в раздел  Slider",
                () -> page
                        .getButtonSlider()
                        .click());
        Allure.step("Проверяем работу раздела Slider",
                () -> {
                    Allure.step("Двигаем слайдер",
                            () -> page
                                    .getSlider()
                                    .setValue("35"));
                    Allure.step("Проверяем что значение слайдера изменилось",
                            () -> Assertions.assertNotEquals("25", page.getSlider().getValue()));
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(6)
    @Description("Открываем  раздел Progress Bar")
    @DisplayName("6.Открываем  раздел Progress Bar")
    public void openProgressBar () {
        Allure.step("Переходим в раздел  Progress Bar",
                () -> page
                        .getButtonProgressBar()
                        .click());
        Allure.step("Проверяем содреждание раздела Progress Bar",
                () -> {
                    page
                            .getButtonStart()
                            .shouldBe(Condition.visible);
                    page
                            .getProgressBar()
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(7)
    @Description("Проверяем работу Progress Bar")
    @DisplayName("7.Проверяем работу Progress Bar")
    public void workProgressBar () {
        Allure.step("Переходим в раздел  Progress Bar",
                () -> page
                        .getButtonProgressBar()
                        .click());
        Allure.step("Нажимаем на кнопку Start",
                () -> {
                    page
                            .getButtonStart()
                            .click();
                    Allure.step(":Ждем пока Progress Bar достигнет 100%",
                            () -> {
                                String progress;
                                do
                                {
                                    progress = page.getProgressBar().getText();
                                    Selenide.sleep(2000);
                                }
                                while (!progress.equals("100%"));
                            });
                });
        Allure.step("Проверяем что Progrees Bar достиг 100% и появлиась кнопка Reset",
                () -> {
                    page
                            .getProgressBar()
                            .shouldHave(text("100%"));
                    page
                            .getButtonReset()
                            .shouldBe(Condition.visible);
                });
        Allure.step("Нажимаем на Reset",
                () -> {
                    page
                            .getButtonReset()
                            .click();
                    page
                            .getProgressBar()
                            .shouldHave(text("0%"));
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(8)
    @Description("Открываем  раздел Tabs")
    @DisplayName("8.Открываем  раздел Tabs")
    public void openTabs () {
        Allure.step("Переходим в раздел  Tabs",
                () -> page
                        .getButtonTabs()
                        .click());
        Allure.step("Проверяем содреждание раздела Tabs",
                () -> {
                    page
                            .getTabWhat()
                            .shouldBe(Condition.visible);
                    page
                            .getTabOrigin()
                            .shouldBe(Condition.visible);
                    page
                            .getTabUse()
                            .shouldBe(Condition.visible);
                    page
                            .getTabMore()
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(9)
    @Description("Открываем  раздел Tabs")
    @DisplayName("9.Открываем  раздел Tabs")
    public void workTabs () {
        Allure.step("Переходим в раздел  Tabs",
                () -> page
                        .getButtonTabs()
                        .click());
        Allure.step("Проверяем что в  табе What текст" +textSection1,
                () -> page
                        .getTextWhat()
                        .shouldHave(text(textSection1)));
        Allure.step("Открываем таб Origin",
                () -> {
                    page
                            .getTabOrigin()
                            .click();
                    Selenide.sleep(1000);
                    Allure.step("Проверяем что табе в табе Origin текст"+textSection2,
                            () -> Assertions.assertEquals(textSection2, page.getTextOrigin().getText().trim().replace("\n", " ")));
                });
        Allure.step("Открываем таб Use",
                () -> {
                    page
                            .getTabUse()
                            .click();
                    Selenide.sleep(1000);
                    Allure.step("Проверяем что в табе Use текст "+textSection3,
                            () -> page
                                    .getTextUse()
                                    .shouldHave(text(textSection3)));
                });
        Allure.step("Проверяем  таб More недоступен",
                () -> page
                        .getTabMore()
                        .shouldBe(Condition.enabled));
    }
    @Test
    @Owner("osipov_vr")
    @Order(10)
    @Description("Открываем  раздел Tool Tips")
    @DisplayName("10.Открываем  раздел Tool Tips")
    public void openToolTips () {
        Allure.step("Переходим в раздел  ToolTips",
                () -> page
                        .getButtonToolTips()
                        .click());
        Allure.step("Проверяем содреждание раздела Tabs",
                () -> {
                    page
                            .getButtonHover()
                            .shouldBe(Condition.visible);
                    page
                            .getTextField()
                            .shouldBe(Condition.visible);
                    page
                            .getTextArea()
                            .shouldBe(Condition.visible);
                });
    }
    @Test
    @Owner("osipov_vr")
    @Order(11)
    @Description("Проверка работы Tool Tips")
    @DisplayName("11.Проверка работы Tool Tips")
    public void workToolTips () throws InterruptedException {
        Allure.step("Открываем главную страницу",
                () -> page.openMainPage(homeURL));
        Allure.step("Переходим на вкладку Widgets",
                () -> page
                        .getButtonWidgets()
                        .click());
        Allure.step("Переходим в раздел  ToolTips",
                () -> page
                        .getButtonToolTips()
                        .click());
        Thread.sleep(1000);
        Allure.step("Проверяем содреждание тултипа у кнопки",
                () -> {
                    page
                            .getButtonHover()
                            .hover();
                    Allure.step("Проверяем текст в тултипе",
                            () -> $x("//*[@class='tooltip-inner']")
                                    .shouldHave(text("You hovered over the Button")));
                });
        Allure.step("Проверяем содреждание тултипа у поля",
                () -> {
                    page
                            .getTextField()
                            .hover();
                    Allure.step("Проверяем текст в тултипе",
                            () -> $x("//*[@class='tooltip-inner']")
                                    .shouldHave(text("You hovered over the text field")));
                });
        Allure.step("Проверяем содреждание тултипа у Contrary",
                () -> {
                    $x("//*[@id=\"texToolTopContainer\"]/a[1]")
                            .hover();
                    Allure.step("Проверяем текст в тултипе",
                            () -> $x("//*[@class='tooltip-inner']")
                                    .shouldHave(text("You hovered over the Contrary")));
                });
        Allure.step("Проверяем содреждание тултипа у 1.10.32",
                () -> {
                    $x("//*[@id=\"texToolTopContainer\"]/a[2]")
                            .hover();
                    Allure.step("Проверяем текст в тултипе",
                            () -> $x("//*[@class='tooltip-inner']")
                                    .shouldHave(text("You hovered over the 1.10.32")));
                });
    }
}
