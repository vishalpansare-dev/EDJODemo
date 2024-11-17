package com.edwardjones.cksn_ui_tests._tsc;

import net.serenitybdd.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;
import com.edwardjones.cksn_ui_tests._pom.UpdateCartPage;

public class UpdateCartSteps extends ScenarioSteps {
    UpdateCartPage updateCartPage;

    @Step
    public void updateProductQuantity(int quantity) {
        updateCartPage.updateProductQuantity(quantity);
    }
}