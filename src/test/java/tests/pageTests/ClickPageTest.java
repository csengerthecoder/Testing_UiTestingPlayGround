package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.ClickPage;
import tests.baseTest.BaseTest;

public class ClickPageTest extends BaseTest {

    @Test
    public void testClickPage() {
        ClickPage clickPage = mainPage.openClickPage();
        boolean isButtonClicked = clickPage.isButtonClicked();
        Assertions.assertTrue(isButtonClicked);
    }
}
