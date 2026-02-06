package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OverlappedElementPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By inputField = By.id("name");

    public OverlappedElementPage(WebDriver driver,  WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private void scrollToInputElement(By element) {
        WebElement webElement = driver.findElement(element);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public boolean isInputValueCorrectlyFilledOut(String input) {
        scrollToInputElement(inputField);
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputField)).sendKeys(input);
        return driver.findElement(inputField).getAttribute("value").equals(input);
    }
}

