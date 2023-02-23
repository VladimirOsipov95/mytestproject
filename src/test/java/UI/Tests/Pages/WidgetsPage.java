package UI.Tests.Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;


import static com.codeborne.selenide.Selenide.$x;

@Getter
public class WidgetsPage {
    public  void openMainPage (String url) {
        Selenide.open(url);
    }
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
    private final SelenideElement buttonProgressBar= $x("//span[text()='Progress Bar']"); // Открываем Progress Bar
    private final SelenideElement buttonStart= $x("//*[@id=\"startStopButton\"]");
    private final SelenideElement buttonReset= $x("//*[@id=\"resetButton\"]");
    private final SelenideElement progressBar= $x("//*[@id=\"progressBar\"]");
    private final SelenideElement buttonTabs= $x("//span[text()='Tabs']"); // Открываем Tabs
    private final SelenideElement tabWhat= $x("//*[@id=\"demo-tab-what\"]");
    private final SelenideElement tabOrigin= $x("//*[@id=\"demo-tab-origin\"]");
    private final SelenideElement tabUse= $x("//*[@id=\"demo-tab-use\"]");
    private final SelenideElement tabMore= $x("//*[@id=\"demo-tab-more\"]");
    private final SelenideElement textWhat= $x("//*[@id=\"demo-tabpane-what\"]");
    private final SelenideElement textOrigin= $x("//*[@id=\"demo-tabpane-origin\"]");
    private final SelenideElement textUse= $x("//*[@id=\"demo-tabpane-use\"]");
    private final SelenideElement buttonToolTips= $x("//span[text()='Tool Tips']"); // Открываем Tool Tips
    private final SelenideElement buttonHover = $x("//*[@id=\"toolTipButton\"]");
    private final SelenideElement textField= $x("//*[@id=\"toolTipTextField\"]");
    private final SelenideElement textArea= $x("//*[@id=\"texToolTopContainer\"]");
    private final SelenideElement buttonMenu= $x("//span[text()='Menu']"); // Открываем Menu
    private final SelenideElement buttonSelectMenu= $x("//span[text()='Select Menu']"); // Открываем Select Menu
    private final SelenideElement section1= $x("//*[@id='section1Heading']");
}
