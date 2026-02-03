package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.DisabledInputPage;
import tests.baseTest.BaseTest;

public class DisabledInputPageTest extends BaseTest {

    @Test
    public void testDisabledInputPage() {
        DisabledInputPage disabledInputPage = mainPage.openDisabledInputPage();
        boolean isInputTypedCorrectly = disabledInputPage.isInputEnteredCorrectly();
        Assertions.assertTrue(isInputTypedCorrectly);
    }
}
