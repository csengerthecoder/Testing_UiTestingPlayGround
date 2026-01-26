package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.MouseOverPage;
import tests.baseTest.BaseTest;

public class MouseOverPageTest extends BaseTest {

    @Test
    public void testMouseOverPage() {
        MouseOverPage mouseOverPage = mainPage.openMouseOverPage();
        boolean isCountIncreased = mouseOverPage.isClickCountIncreasedForBoth();
        Assertions.assertTrue(isCountIncreased);
    }
}
