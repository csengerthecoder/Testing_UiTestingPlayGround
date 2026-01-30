package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NonBreakingSpacePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By button = By.xpath("//button[text()=concat('My', '\u00A0', 'Button')]");



    public NonBreakingSpacePage(WebDriver driver,  WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isButtonClicked() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(button)).click();
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
