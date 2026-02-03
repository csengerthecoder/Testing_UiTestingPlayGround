package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisabledInputPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By disableButton = By.cssSelector(".btn.btn-primary");
    private final By inputField = By.id("inputField");
    private final By statusDiv = By.id("opstatus");

    public DisabledInputPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isInputEnteredCorrectly() {
        wait.until(ExpectedConditions.elementToBeClickable(disableButton)).click();
        wait.until(driver -> driver.findElement(inputField).isEnabled());
        driver.findElement(inputField).sendKeys("Sophie");
        driver.findElement(inputField).sendKeys(Keys.ENTER);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(statusDiv)).getText().equals("Value changed to: Sophie");
    }
}
