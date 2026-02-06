package project.mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.pages.*;

import java.util.Objects;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private final By dynamicButtonTaskButton = By.linkText("Dynamic ID");
    private final By classAttributeButton = By.linkText("Class Attribute");
    private final By hiddenLayersButton = By.linkText("Hidden Layers");
    private final By loadDelayButton = By.linkText("Load Delay");
    private final By ajaxDataButton = By.linkText("AJAX Data");
    private final By scrollBars = By.linkText("Scrollbars");
    private final By ProgressBarButton = By.linkText("Progress Bar");
    private final By clientSideDelayButton = By.linkText("Client Side Delay");
    private final By textInputButton = By.linkText("Text Input");
    private final By dynamicTableButton = By.linkText("Dynamic Table");
    private final By verifyTextButton = By.linkText("Verify Text");
    private final By sampleAppButton = By.linkText("Sample App");
    private final By mouseOverButton = By.linkText("Mouse Over");
    private final By nonBreakingSpaceButton = By.linkText("Non-Breaking Space");
    private final By alertsButton = By.linkText("Alerts");
    private final By animatedButtonButton = By.linkText("Animated Button");
    private final By disabledInputButton = By.linkText("Disabled Input");
    private final By clickPageButton = By.linkText("Click");
    private final By overlappedElementButton = By.linkText("Overlapped Element");
    private final By visibilityPage = By.linkText("Visibility");

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private void click(By locator) {
        Objects.requireNonNull(wait.until(ExpectedConditions.elementToBeClickable(locator))).click();
    }

    public HiddenLayersPage openHiddenLayersPage() {
        click(hiddenLayersButton);
        return new HiddenLayersPage(driver, wait);
    }
    public ClassAttributePage openClassAttributePage() {
        click(classAttributeButton);
        return new ClassAttributePage(driver, wait);
    }
    public DynamicIdPage openDynamicIdPage() {
        click(dynamicButtonTaskButton);
        return new DynamicIdPage(driver, wait);
    }
    public LoadDelayPage openLoadDelayPage() {
        click(loadDelayButton);
        return new LoadDelayPage(driver, wait);
    }
    public AjaxDataPage openAjaxDataPage() {
        click(ajaxDataButton);
        return new AjaxDataPage(driver, wait);
    }
    public ScrollBarPage openScrollBarPage() {
        click(scrollBars);
        return new ScrollBarPage(driver, wait);
    }
    public ProgressBarPage openProgressBarPage() {
        click(ProgressBarButton);
        return new ProgressBarPage(driver, wait);
    }
    public ClientSideDelayPage openClientSideDelayPage() {
        click(clientSideDelayButton);
        return new ClientSideDelayPage(driver, wait);
    }
    public TextInputPage openTextInputPage() {
        click(textInputButton);
        return new TextInputPage(driver, wait);
    }
    public DynamicTablePage openDynamicTablePage() {
        click(dynamicTableButton);
        return new DynamicTablePage(driver, wait);
    }
    public VerifyTextPage openVerifyTextPage() {
        click(verifyTextButton);
        return new VerifyTextPage(driver, wait);
    }
    public SampleAppPage openSampleAppPage() {
        click(sampleAppButton);
        return new SampleAppPage(driver, wait);
    }
    public MouseOverPage openMouseOverPage() {
        click(mouseOverButton);
        return new MouseOverPage(driver, wait);
    }
    public NonBreakingSpacePage openNonBreakingSpacePage() {
        click(nonBreakingSpaceButton);
        return new NonBreakingSpacePage(driver, wait);
    }
    public AlertsPage openAlertsPage() {
        click(alertsButton);
        return new AlertsPage(driver, wait);
    }
    public AnimatedButtonPage openAnimatedButtonPage() {
        click(animatedButtonButton);
        return new AnimatedButtonPage(driver, wait);
    }
    public DisabledInputPage openDisabledInputPage() {
        click(disabledInputButton);
        return new DisabledInputPage(driver, wait);
    }
    public ClickPage openClickPage() {
        click(clickPageButton);
        return new ClickPage(driver, wait);
    }
    public OverlappedElementPage openOverlappedElementPage() {
        click(overlappedElementButton);
        return new OverlappedElementPage(driver, wait);
    }
    public VisibilityPage openVisibilityPage() {
        click(visibilityPage);
        return new VisibilityPage(driver, wait);
    }
}
