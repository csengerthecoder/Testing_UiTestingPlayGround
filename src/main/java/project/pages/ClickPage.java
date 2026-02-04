package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By button = By.id("badButton");

    public ClickPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isButtonClicked() {
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();
        String classOfButton = driver.findElement(button).getAttribute("class");
        System.out.println(classOfButton);
        return classOfButton.equals("btn btn-success");
    }

}
