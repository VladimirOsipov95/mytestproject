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
    private final SelenideElement slider = $x("//*[@id=\"sliderContainer\"]/div[1]/span/input");
    private final SelenideElement sliderInput = $x("//*[@id=\"sliderValue\"]");

    public SelenideElement getSlider() {
        return slider;
    }

    public SelenideElement getSliderInput() {
        return sliderInput;
    }



    private final SelenideElement buttonProgressBar= $x("//span[text()='Progress Bar']"); // Открываем Progress Bar
    private final SelenideElement buttonStart= $x("//*[@id=\"startStopButton\"]");
    private final SelenideElement buttonReset= $x("//*[@id=\"resetButton\"]");

    public SelenideElement getButtonReset() {
        return buttonReset;
    }

    private final SelenideElement progressBar= $x("//*[@id=\"progressBar\"]");

    public SelenideElement getButtonStart() {
        return buttonStart;
    }

    public SelenideElement getProgressBar() {
        return progressBar;
    }

    private final SelenideElement buttonTabs= $x("//span[text()='Tabs']"); // Открываем Tabs
    private final SelenideElement tabWhat= $x("//*[@id=\"demo-tab-what\"]");
    private final SelenideElement tabOrigin= $x("//*[@id=\"demo-tab-origin\"]");
    private final SelenideElement tabUse= $x("//*[@id=\"demo-tab-use\"]");
    private final SelenideElement tabMore= $x("//*[@id=\"demo-tab-more\"]");
    private final SelenideElement textWhat= $x("//*[@id=\"demo-tabpane-what\"]");
    private final SelenideElement textOrigin= $x("//*[@id=\"demo-tabpane-origin\"]");
    private final SelenideElement textUse= $x("//*[@id=\"demo-tabpane-use\"]");

    public SelenideElement getTextWhat() {
        return textWhat;
    }

    public SelenideElement getTextOrigin() {
        return textOrigin;
    }

    public SelenideElement getTextUse() {
        return textUse;
    }

    public SelenideElement getTabWhat() {
        return tabWhat;
    }

    public SelenideElement getTabOrigin() {
        return tabOrigin;
    }

    public SelenideElement getTabUse() {
        return tabUse;
    }

    public SelenideElement getTabMore() {
        return tabMore;
    }

    private final SelenideElement buttonToolTips= $x("//span[text()='Tool Tips']"); // Открываем Tool Tips
    private final SelenideElement buttonHover = $x("//*[@id=\"toolTipButton\"]");
    private final SelenideElement textField= $x("//*[@id=\"toolTipTextField\"]");
    private final SelenideElement textArea= $x("//*[@id=\"texToolTopContainer\"]");

    public SelenideElement getButtonHover() {
        return buttonHover;
    }

    public SelenideElement getTextField() {
        return textField;
    }

    public SelenideElement getTextArea() {
        return textArea;
    }

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
