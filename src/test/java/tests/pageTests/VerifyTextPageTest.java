package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.VerifyTextPage;
import tests.baseTest.BaseTest;

public class VerifyTextPageTest extends BaseTest {

    @Test
    public void testVerifyTextPage() {
        VerifyTextPage verifyTextPage = mainPage.openVerifyTextPage();
        boolean isWelcomeMessageDisplayed =  verifyTextPage.isWelcomeMessageDisplayed();
        Assertions.assertTrue(isWelcomeMessageDisplayed);
    }
}
