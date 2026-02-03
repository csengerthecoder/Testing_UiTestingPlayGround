package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnimatedButtonPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By statusDiv = By.id("opstatus");
    private final By startButton = By.cssSelector(".btn.btn-secondary");
    private final By movingButton = By.id("movingTarget");

    public AnimatedButtonPage(WebDriver driver,  WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isMovingTargetClicked() {
        wait.until(ExpectedConditions.elementToBeClickable(startButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(movingButton)).click();
        return driver.findElement(statusDiv).getText().equals("Moving Target clicked. It's class name is 'btn btn-primary spin'");
    }
}
