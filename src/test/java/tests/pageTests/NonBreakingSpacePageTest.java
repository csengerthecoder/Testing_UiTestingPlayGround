package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.NonBreakingSpacePage;
import tests.baseTest.BaseTest;

public class NonBreakingSpacePageTest extends BaseTest {

    @Test
    public void testNonBreakingSpacePage() {
        NonBreakingSpacePage nonBreakingSpacePage = mainPage.openNonBreakingSpacePage();
        boolean isButtonCLicked = nonBreakingSpacePage.isButtonClicked();
        Assertions.assertTrue(isButtonCLicked);
    }
}
