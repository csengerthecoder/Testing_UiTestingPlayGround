package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.SampleAppPage;
import tests.baseTest.BaseTest;

public class SampleAppPageTest extends BaseTest {

    @Test
    public void testSampleAppPage() {
        SampleAppPage sampleAppPage = mainPage.openSampleAppPage();
        boolean isLoginSuccessful = sampleAppPage.isLoginSuccessful();
        Assertions.assertTrue(isLoginSuccessful);
    }
}
