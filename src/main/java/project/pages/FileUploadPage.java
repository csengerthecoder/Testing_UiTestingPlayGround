package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By fileUpload = By.id("browse");
    private final By browseButton = By.className("browse-btn");

    public FileUploadPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

//    private boolean isFileAttached() {
//        WebElement input = driver.findElement(fileUpload);
//        input.sendKeys("C:\\testFile\\oop_java_basics.pdf");
//
//
//    }
}
