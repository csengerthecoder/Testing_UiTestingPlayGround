package tests.pageTests;

import tests.baseTest.BaseTest;
import project.pages.AjaxDataPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AjaxDataPageTest extends BaseTest {

    @Test
    public void AjaxDataButtonTest() {
        AjaxDataPage ajaxDataPage = mainPage.openAjaxDataPage();
        boolean isPElementClicked = ajaxDataPage.isPElementClicked();
        Assertions.assertTrue(isPElementClicked);
    }
}
