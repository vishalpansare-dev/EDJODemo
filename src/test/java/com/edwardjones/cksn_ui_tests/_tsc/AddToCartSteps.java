package com.edwardjones.cksn_ui_tests._tsc;

import net.serenitybdd.core.steps.ScenarioSteps;
    import net.thucydides.core.annotations.Step;
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

    @Step("User verifies success message is displayed")
    public void userVerifiesSuccessMessage() {
        assertThat(addToCartPage.getSuccessMessage()).isEqualTo("Item added to cart!");
    }

    @Step("Add item to cart")
    public void addItemToCart() {
        addToCartPage.clickAddToCart();
    }

    @Step("User verifies success message is displayed")
    public void userVerifiesSuccessMessage() {
        assertThat(addToCartPage.getSuccessMessage()).isEqualTo("Item added to cart!");
    }
}