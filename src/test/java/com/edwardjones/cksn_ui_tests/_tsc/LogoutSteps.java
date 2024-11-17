package com.edwardjones.cksn_ui_tests._tsc;

import net.serenitybdd.core.steps.ScenarioSteps;
import net.serenitybdd.core.annotations.Step;
import com.edwardjones.cksn_ui_tests._pom.LogoutPage;

public class LogoutSteps extends ScenarioSteps {
    private LogoutPage logoutPage;

    @Step("User logs out after successful login")
    public void userLogsOut() {
        logoutPage.clickLogout();
    }
}