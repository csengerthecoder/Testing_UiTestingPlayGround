package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextInputPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By textInput = By.className("form-control");
    private final By button = By.className("btn-primary");

    public TextInputPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isTextValueChanged() {
        String expectedText = "changed button";
        wait.until(ExpectedConditions.elementToBeClickable(textInput)).sendKeys(expectedText);
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();

        String actualText = wait.until(ExpectedConditions.elementToBeClickable(button)).getText();

        return expectedText.equals(actualText);
    }
}
