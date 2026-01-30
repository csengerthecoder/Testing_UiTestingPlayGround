package tests.pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.pages.AlertsPage;
import tests.baseTest.BaseTest;

public class AlertsPageTest extends BaseTest {

    @Test
    public void testAlertsPage() {
        AlertsPage alertsPage = mainPage.openAlertsPage();
        boolean areAlertsChecked = alertsPage.areAlertsHandled();
        Assertions.assertTrue(areAlertsChecked);
    }
}
