package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By hideButton = By.id("hideButton");
    private final By removedButton =  By.id("removedButton");
    private final By zeroWidthButton =  By.id("zeroWidthButton");
    private final By overlappedButton = By.id("overlappedButton");
    private final By transparentButton = By.id("transparentButton");
    private final By invisibleButton = By.id("invisibleButton");
    private final By notDisplayedButton = By.id("notDisplayedButton");
    private final By offscreenButton =  By.id("offscreenButton");

    public VisibilityPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private void hideButtons() {
        wait.until(ExpectedConditions.elementToBeClickable(hideButton)).click();
    }

    public boolean isRemovedButtonVisible() {
        hideButtons();
        System.out.print(driver.findElements(removedButton).size() > 0);
        return driver.findElements(removedButton).size() > 0;
    }
    public boolean isZeroWidthButtonVisible() {
        hideButtons();
        System.out.print(driver.findElement(zeroWidthButton).isDisplayed());
        return driver.findElement(zeroWidthButton).isDisplayed();
    }
    public boolean isOverlappedButtonVisible() {
        hideButtons();
        System.out.print(driver.findElement(overlappedButton).isDisplayed());
        return driver.findElement(overlappedButton).isDisplayed();
    }
    public boolean isTransparentButtonVisible() {
        hideButtons();
        System.out.print(driver.findElement(transparentButton).isDisplayed());
        return driver.findElement(transparentButton).isDisplayed();
    }
    public boolean isInvisibleButtonVisible() {
        hideButtons();
        System.out.print(driver.findElement(invisibleButton).isDisplayed());
        return driver.findElement(invisibleButton).isDisplayed();
    }
    public boolean isNotDisplayedButtonVisible() {
        hideButtons();
        System.out.print(driver.findElements(notDisplayedButton).size() > 0);
        return driver.findElements(notDisplayedButton).size() > 0;
    }
    public boolean isOffscreenButtonVisible() {
        hideButtons();
        System.out.print(driver.findElement(offscreenButton).isDisplayed());
        return driver.findElement(offscreenButton).isDisplayed();
    }
}
