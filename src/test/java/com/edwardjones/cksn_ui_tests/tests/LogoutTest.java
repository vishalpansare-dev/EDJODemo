package com.edwardjones.cksn_ui_tests.tests;

import com.edwardjones.cksn_ui_tests._tsc.LogoutSteps;
import com.edwardjones.cksn_ui_tests.common.TestManager;
import org.junit.jupiter.api.Test;

public class LogoutTest extends TestManager {
    @Steps
    protected LogoutSteps logoutSteps;

    @Test
    public void testUserCanLogout() {
        logoutSteps.userLogsOut();
        // Assertions to verify redirection and message
    }
}