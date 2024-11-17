package com.edwardjones.cksn_ui_tests._pom;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.targets.Target;

public class LogoutPage extends BasePage {
    @FindBy(id = "logout")
    private WebElementFacade logoutButton;

    public void clickLogout() {
        logoutButton.click();
    }
}