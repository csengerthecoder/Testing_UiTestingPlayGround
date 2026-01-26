package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleAppPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By usernameInput = By.name("UserName");
    private final By passwordInput = By.name("Password");
    private final By loginButton = By.cssSelector(".btn.btn-primary");
    private final By loginStatus = By.id("loginstatus");

    public SampleAppPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isLoginSuccessful() {
        String expectedLoginStatusText = "Welcome, Thiaoouba!";
        login("Thiaoouba", "pwd");
        String actualLoginStatusText = wait.until(ExpectedConditions.visibilityOfElementLocated(loginStatus)).getText();
        return actualLoginStatusText.equals(expectedLoginStatusText);
    }

    private void login(String username, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

}
