package com.edwardjones.cksn_ui_tests._tsc;

import net.serenitybdd.core.steps.ScenarioSteps;
    import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Step;
import com.edwardjones.cksn_ui_tests._pom.AddToCartPage;

public class AddToCartSteps extends ScenarioSteps {

    AddToCartPage addToCartPage;

    @Step("User updates product quantity in cart")
    public void updateProductQuantity(CartTestData data, int quantity) {
        addToCartPage.updateQuantity(data.getProductName(), quantity);
    }

    @Step("Verify product quantity in cart")
    public void verifyProductQuantityInCart(CartTestData data, int expectedQuantity) {
        assertThat(addToCartPage.getProductQuantity(data.getProductName())).isEqualTo(expectedQuantity);
    }

    @Step("Verify the cart icon is updated")
    public void verifyCartIconIsUpdated() {
        assert addToCartPage.isCartIconUpdated();
    }

    @Step("Add item to cart")
    public void addItemToCart() {
        addToCartPage.clickAddToCart();
    }

    @Step("Verify cart icon is updated")
    public void verifyCartIconUpdated() {
        assert addToCartPage.isCartIconUpdated();
    }

    @Step("User verifies success message is displayed")
    @Step("User verifies success message is displayed")
    @Step("User verifies success message is displayed")
    public void userVerifiesSuccessMessage() {
        assertThat(addToCartPage.getSuccessMessage()).isEqualTo("Product added to cart");
    }

    @Step("Add item to cart")
    public void addItemToCart() {
        addToCartPage.clickAddToCart();
    }

    @Step("User verifies success message is displayed")
    @Step("User verifies success message is displayed")
    @Step("User verifies success message is displayed")
    public void userVerifiesSuccessMessage() {
        assertThat(addToCartPage.getSuccessMessage()).isEqualTo("Product added to cart");
    }
}