package tests.pageTests;

import tests.baseTest.BaseTest;
import project.pages.DynamicIdPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicIdPageTest extends BaseTest {

    @Test
    void dynamicIdButtonTest() {
        DynamicIdPage dynamicIdPage = mainPage.openDynamicIdPage();
        boolean isClickHappened = dynamicIdPage.ClickTheButton();
        Assertions.assertTrue(isClickHappened);
    }
}
