package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By firstClick = By.xpath("//a[normalize-space(.)='Click me']");
    private final By secondClick = By.xpath("//a[normalize-space(.)='Link Button']");
    private final By firstClickCountElement = By.id("clickCount");
    private final By secondClickCountElement = By.id("clickButtonCount");

    public MouseOverPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isClickCountIncreasedForBoth() {
        String initialFirstClickCount = getClickCount(firstClickCountElement);
        int initialFirstValue = Integer.parseInt(initialFirstClickCount);
        wait.until(ExpectedConditions.elementToBeClickable(firstClick)).click();
        String actualFirstClickCount =  getClickCount(firstClickCountElement);
        int actualFirstValue = Integer.parseInt(actualFirstClickCount);

        String initialSecondClickCount = getClickCount(secondClickCountElement);
        int initialSecondValue = Integer.parseInt(initialSecondClickCount);
        wait.until(ExpectedConditions.elementToBeClickable(secondClick)).click();
        String actualSecondClickCount =  getClickCount(secondClickCountElement);
        int actualSecondValue = Integer.parseInt(actualSecondClickCount);

        return initialFirstValue < actualFirstValue && initialSecondValue < actualSecondValue;
    }

     private String getClickCount(By element) {
        String count = wait.until(ExpectedConditions.visibilityOfElementLocated(element)).getText();
        return count;
     }
}
