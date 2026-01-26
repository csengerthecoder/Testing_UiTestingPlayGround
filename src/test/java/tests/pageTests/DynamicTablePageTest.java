package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.DynamicTablePage;
import tests.baseTest.BaseTest;

public class DynamicTablePageTest extends BaseTest {

    @Test
    public void testDynamicTablePage(){
        DynamicTablePage dynamicTablePage = mainPage.openDynamicTablePage();
        boolean isCpuCorrect = dynamicTablePage.isCpuCorrect();
        Assertions.assertTrue(isCpuCorrect);
    }
}
