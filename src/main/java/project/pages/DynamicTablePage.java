package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DynamicTablePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private final By table = By.cssSelector("div[role='table'][aria-label='Tasks']");
    private final By row = By.cssSelector("div[role='row']");
    private final By headers = By.cssSelector("span[role='columnheader']");
    private final By cells = By.cssSelector("span[role='cell']");
    private final By cpuParagraph = By.className("bg-warning");

    public DynamicTablePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isCpuCorrect() {
        String expected = "Chrome CPU: " + getCpuForChrome();
        wait.until(ExpectedConditions.textToBe(cpuParagraph, expected));

        String actual = driver.findElement(cpuParagraph).getText().trim();

        return expected.equals(actual);
    }

    private String getCpuForChrome() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(table));

        int cpuIndex = getColumnIndex(element,"CPU");
        if (cpuIndex == -1) {
            throw new RuntimeException("Column Not Found");
        }
        WebElement chromeRow = getRowByFirstCell(element, "Chrome");
        List<WebElement> chromeCells = chromeRow.findElements(cells);

        if (cpuIndex >= chromeCells.size()) {
            throw new RuntimeException("CPU index out of range for Chrome row.");
        }

        return chromeCells.get(cpuIndex).getText().trim();
    }

    private int getColumnIndex(WebElement tableEl, String columnName) {
        List<WebElement> allRows = tableEl.findElements(row);

        for (WebElement row : allRows) {
            List<WebElement> hs = row.findElements(headers);
            if (hs.isEmpty()) continue;

            for (int i = 0; i < hs.size(); i++) {
                if (hs.get(i).getText().trim().equalsIgnoreCase(columnName)) {
                    return i;
                }
            }
            break;
        }
        return -1;
    }

    private WebElement getRowByFirstCell(WebElement tableEl, String firstCellText) {
        List<WebElement> allRows = tableEl.findElements(row);

        for (WebElement row : allRows) {
            List<WebElement> cs = row.findElements(cells);
            if (cs.isEmpty()) continue;

            String name = cs.get(0).getText().trim();
            if (name.equalsIgnoreCase(firstCellText)) {
                return row;
            }
        }
        throw new RuntimeException("Row not found: " + firstCellText);
    }
}
