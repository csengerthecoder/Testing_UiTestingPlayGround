package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.ClientSideDelayPage;
import tests.baseTest.BaseTest;

public class ClientSideDelayPageTest extends BaseTest {

    @Test
    public void testClientSideDelayPage() {
        ClientSideDelayPage clientSideDelayPage = mainPage.openClientSideDelayPage();
        boolean isParagraphClicked = clientSideDelayPage.isResultParagraphClicked();
        Assertions.assertTrue(isParagraphClicked);
    }
}
