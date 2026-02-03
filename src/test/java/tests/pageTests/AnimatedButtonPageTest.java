package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.AnimatedButtonPage;
import tests.baseTest.BaseTest;

public class AnimatedButtonPageTest extends BaseTest {

    @Test
    public void testAnimatedButtonPage() {
        AnimatedButtonPage animatedButtonPage = mainPage.openAnimatedButtonPage();
        boolean isMovingButtonClicked = animatedButtonPage.isMovingTargetClicked();
        Assertions.assertTrue(isMovingButtonClicked);
    }
}
