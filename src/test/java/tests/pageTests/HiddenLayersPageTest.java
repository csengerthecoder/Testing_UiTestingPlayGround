package tests.pageTests;

import project.pages.HiddenLayersPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.baseTest.BaseTest;

public class HiddenLayersPageTest extends BaseTest {

    @Test
    void hiddenButtonClickTest() {
        HiddenLayersPage hiddenLayersPage = mainPage.openHiddenLayersPage();
        boolean isCorrectButtonClicked = hiddenLayersPage.isCorrectButtonClicked();
        Assertions.assertTrue(isCorrectButtonClicked);
    }
}