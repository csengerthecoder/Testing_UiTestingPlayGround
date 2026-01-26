package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyTextPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By welcomeMessageParagraph = By.xpath("//span[normalize-space(.)='Welcome UserName!']");

    public VerifyTextPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isWelcomeMessageDisplayed() {
        WebElement welcomeMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeMessageParagraph));
        return welcomeMessage.isDisplayed();
    }
}
