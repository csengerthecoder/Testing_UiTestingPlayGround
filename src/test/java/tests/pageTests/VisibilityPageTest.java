package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.VisibilityPage;
import tests.baseTest.BaseTest;

public class VisibilityPageTest extends BaseTest {
    @Test
    public void testVisibilityPage() {
        VisibilityPage visibilityPage = mainPage.openVisibilityPage();
        Assertions.assertFalse(visibilityPage.isZeroWidthButtonVisible());
        Assertions.assertTrue(visibilityPage.isOverlappedButtonVisible());
        Assertions.assertFalse(visibilityPage.isInvisibleButtonVisible());
        Assertions.assertFalse(visibilityPage.isOffscreenButtonVisible());
        Assertions.assertFalse(visibilityPage.isTransparentButtonVisible());
        Assertions.assertFalse(visibilityPage.isRemovedButtonVisible());
        Assertions.assertFalse(visibilityPage.isNotDisplayedButtonVisible());
    }
}
