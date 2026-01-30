package project.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By alertButton = By.id("alertButton");
    private final By confirmButton = By.id("confirmButton");
    private final By promptButton = By.id("promptButton");

    public AlertsPage(WebDriver driver,  WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean areAlertsHandled() {
        try {
            checkAcceptAlert();
            checkConfirmAlert();
            checkPromptAlert();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkAcceptAlert() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(alertButton)).click();
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkConfirmAlert() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(confirmButton)).click();
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
            Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
            alert2.accept();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean checkPromptAlert() {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(promptButton)).click();
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.sendKeys("dogs");
            alert.accept();
            Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
            alert2.accept();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
