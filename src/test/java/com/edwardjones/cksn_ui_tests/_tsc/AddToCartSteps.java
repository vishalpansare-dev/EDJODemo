package com.edwardjones.cksn_ui_tests._tsc;

import net.serenitybdd.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;
import com.edwardjones.cksn_ui_tests._pom.AddToCartPage;

public class AddToCartSteps extends ScenarioSteps {

    AddToCartPage addToCartPage;

    @Step("Add item to cart")
    public void addItemToCart() {
        addToCartPage.clickAddToCart();
    }

    @Step("Verify cart icon is updated")
    public void verifyCartIconUpdated() {
        assert addToCartPage.isCartIconUpdated();
    }

    @Step("Add item to cart")
    public void addItemToCart() {
        addToCartPage.clickAddToCart();
    }

    @Step("Verify cart icon updates")
    public void verifyCartIconUpdates() {
        assert addToCartPage.isCartIconUpdated();
    }
}