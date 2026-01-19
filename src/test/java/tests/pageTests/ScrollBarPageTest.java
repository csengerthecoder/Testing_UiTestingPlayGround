package tests.pageTests;

import tests.baseTest.BaseTest;
import project.pages.ScrollBarPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScrollBarPageTest extends BaseTest {

    @Test
    void scrollBarsTest() {
        ScrollBarPage scrollBarPage = mainPage.openScrollBarPage();
        boolean isButtonCLicked = scrollBarPage.scrollToButton();
        Assertions.assertTrue(isButtonCLicked);
    }
}
