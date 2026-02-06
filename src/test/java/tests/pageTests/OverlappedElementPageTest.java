package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.OverlappedElementPage;
import tests.baseTest.BaseTest;

public class OverlappedElementPageTest extends BaseTest {

    @Test
    void testOverlappedElementPage() {
        OverlappedElementPage overlappedElementPage = mainPage.openOverlappedElementPage();
        boolean isInputCorrect = overlappedElementPage.isInputValueCorrectlyFilledOut("Sophie");
        Assertions.assertTrue(isInputCorrect);
    }
}
