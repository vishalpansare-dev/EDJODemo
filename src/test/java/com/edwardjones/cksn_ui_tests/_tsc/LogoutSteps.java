package com.edwardjones.cksn_ui_tests._tsc;

import com.edwardjones.cksn_ui_tests._pom.LogoutPage;

public class LogoutSteps {
    LogoutPage logoutPage = new LogoutPage();

    public void userClicksLogout() {
        logoutPage.clickLogout();
    }

    public String verifyLogoutMessage() {
        return logoutPage.getLogoutMessage();
    }
}