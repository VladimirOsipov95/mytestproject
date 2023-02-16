package UI.Tests.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WidgetsPage {
    private final SelenideElement buttonWidgets = $x("//h5[text()='Widgets']"); // Открываем Widgets
    private final SelenideElement buttonAccordian = $x("//span[text()='Accordian']"); // Открываем Accordian
    private final SelenideElement section1Content= $x("//*[@id='section1Content']");
    private final SelenideElement section2Content= $x("//*[@id='section2Content']");
    private final SelenideElement section3Content= $x("//*[@id='section3Content']");
    private final SelenideElement section2= $x("//*[@id='section2Heading']");
    private final SelenideElement section3= $x("//*[@id='section3Heading']");
    private final SelenideElement buttonAutoComplete = $x("//span[text()='Auto Complete']"); // Открываем Auto Complete

    private final SelenideElement buttonDatePicker= $x("//span[text()='Date Picker']"); // Открываем Date Picker
    private final SelenideElement buttonSlider= $x("//span[text()='Slider']"); // Открываем Slider

    public SelenideElement getSlider() {
        return slider;
    }

    public SelenideElement getSliderInput() {
        return sliderInput;
    }

    private final SelenideElement slider = $x("//*[@id=\"sliderContainer\"]/div[1]/span/input");
    private final SelenideElement sliderInput = $x("//*[@id=\"sliderValue\"]");

    private final SelenideElement buttonProgressBar= $x("//span[text()='Progress Bar']"); // Открываем Progress Bar
    private final SelenideElement buttonTabs= $x("//span[text()='Tabs']"); // Открываем Tabs
    private final SelenideElement buttonToolTips= $x("//span[text()='Tool Tips']"); // Открываем Tool Tips
    private final SelenideElement buttonMenu= $x("//span[text()='Menu']"); // Открываем Menu
    private final SelenideElement buttonSelectMenu= $x("//span[text()='Select Menu']"); // Открываем Select Menu
    private final SelenideElement section1= $x("//*[@id='section1Heading']");



    public  void openMainPage (String url) {
        Selenide.open(url);
    }
    public SelenideElement getButtonWidgets() {
        return buttonWidgets;
    }
    public SelenideElement getButtonAccordian() {
        return buttonAccordian;
    }
    public SelenideElement getButtonAutoComplete() {
        return buttonAutoComplete;
    }
    public SelenideElement getButtonDatePicker() {
        return buttonDatePicker;
    }
    public SelenideElement getButtonSlider() {
        return buttonSlider;
    }
    public SelenideElement getButtonProgressBar() {
        return buttonProgressBar;
    }
    public SelenideElement getButtonTabs() {
        return buttonTabs;
    }
    public SelenideElement getButtonToolTips() {
        return buttonToolTips;
    }
    public SelenideElement getButtonMenu() {
        return buttonMenu;
    }
    public SelenideElement getButtonSelectMenu() {
        return buttonSelectMenu;
    }
    public SelenideElement getSection1() {
        return section1;
    }
    public SelenideElement getSection2() {
        return section2;
    }
    public SelenideElement getSection3() {
        return section3;
    }
    public SelenideElement getSection1Content() {
        return section1Content;
    }

    public SelenideElement getSection2Content() {
        return section2Content;
    }

    public SelenideElement getSection3Content() {
        return section3Content;
    }

}
