package com.edwardjones.cksn_ui_tests.tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class LogoutTest {
    @Test
    public void testUserLogout() {
        // Assuming user is logged in
LogoutSteps logoutSteps = new LogoutSteps();
logoutSteps.userClicksLogout();
String message = logoutSteps.verifyLogoutMessage();
assertEquals("Logged out successfully", message);
        LogoutSteps logoutSteps = new LogoutSteps();
        logoutSteps.userClicksLogout();
        String message = logoutSteps.verifyLogoutMessage();
        assertEquals("Logged out successfully", message);
    }
}