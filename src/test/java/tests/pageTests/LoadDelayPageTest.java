package tests.pageTests;

import project.pages.LoadDelayPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.baseTest.BaseTest;

public class LoadDelayPageTest extends BaseTest {

    @Test
    public void loadDelayedButtonClickTest() {
        LoadDelayPage loadDelayPage = mainPage.openLoadDelayPage();
        boolean isDelayedButtonClicked = loadDelayPage.isDelayedButtonClicked();
        Assertions.assertTrue(isDelayedButtonClicked);
    }
}