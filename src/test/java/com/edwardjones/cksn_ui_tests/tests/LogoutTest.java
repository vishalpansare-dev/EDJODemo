package com.edwardjones.cksn_ui_tests.tests;

import com.edwardjones.cksn_ui_tests._pom.LogoutPage;
import com.edwardjones.cksn_ui_tests.common.TestManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogoutTest extends TestManager {
    private LogoutPage logoutPage = new LogoutPage();

    @Test
    public void testUserCanLogout() {
        // Given the user has successfully logged in
        // Simulate successful login here

        // When the user clicks the "Logout" button
        logoutPage.clickLogoutButton();

        // Then the user should be redirected to the login page
        assertTrue(logoutPage.isRedirectedToLoginPage(), "User is not redirected to login page");

        // And a "Logged out successfully" message should be displayed
        assertEquals("Logged out successfully", logoutPage.getLogoutMessage(), "Logout message is not displayed");
    }
}