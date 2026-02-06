package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShadowDomPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private final By copyButton = By.id("buttonCopy");
    private final By generateButton = By.id("buttonGenerate");
    private final By inputField = By.id("editField");
    private final By shadowHost = By.cssSelector("guid-generator");

    public ShadowDomPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    private SearchContext shadowRoot() {
        WebElement host = wait.until(ExpectedConditions.visibilityOfElementLocated(shadowHost));
        return host.getShadowRoot();
    }

    public String generateGuid() {
        SearchContext root = shadowRoot();
        root.findElement(generateButton).click();

        String value = root.findElement(inputField).getAttribute("value");
        return value;
    }

    public String generateAndCopyGuidValue() {
        SearchContext root = shadowRoot();

        root.findElement(generateButton).click();
        String value = root.findElement(inputField).getAttribute("value");
        root.findElement(copyButton).click();

        return value;
    }
}
