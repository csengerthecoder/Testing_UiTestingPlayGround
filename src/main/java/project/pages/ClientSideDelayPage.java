package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientSideDelayPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By triggerButton = By.cssSelector(".btn.btn-primary");
    private final By resultParagraph = By.className("bg-success");

    public ClientSideDelayPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isResultParagraphClicked() {
        wait.until(ExpectedConditions.elementToBeClickable(triggerButton)).click();
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(resultParagraph));
            System.out.println("paragraph is clicked");
            return true;
        } catch (Exception e) {
            System.out.println("paragraph is not clicked");
            return false;
        }
    }
}
