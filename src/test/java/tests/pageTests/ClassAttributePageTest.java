package tests.pageTests;

import tests.baseTest.BaseTest;
import project.pages.ClassAttributePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassAttributePageTest extends BaseTest {

    @Test
    public void testClassAttributePage() {
        ClassAttributePage classAttributePage = mainPage.openClassAttributePage();
        boolean isCorrectButtonClicked = classAttributePage.ClickClassAttributeButton();
        Assertions.assertTrue(isCorrectButtonClicked);
    }
}
