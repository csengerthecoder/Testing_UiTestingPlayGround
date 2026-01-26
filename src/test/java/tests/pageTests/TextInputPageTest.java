package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.TextInputPage;
import tests.baseTest.BaseTest;

public class TextInputPageTest extends BaseTest {

    @Test
    public void testTextInputPage() {
        TextInputPage textInputPage = mainPage.openTextInputPage();
        boolean isButtonNameChanged = textInputPage.isTextValueChanged();
        Assertions.assertTrue(isButtonNameChanged);
    }
}
