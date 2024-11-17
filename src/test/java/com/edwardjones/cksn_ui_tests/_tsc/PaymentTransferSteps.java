package com.edwardjones.cksn_ui_tests._tsc;

import net.serenitybdd.core.annotations.Step;
import com.edwardjones.cksn_ui_tests._pom.PaymentPage;

public class PaymentsTransferSteps {
    private PaymentPage paymentPage;

    @Step("Add item to cart")
    @Step("Add item to cart")
    public void addItemToCart() {
        // Implementation for adding an item to cart
        paymentPage.addItemToCart();
    }

    @Step("Proceed to checkout")
    @Step("Proceed to checkout")
    public void proceedToCheckout() {
        // Implementation for proceeding to checkout
        paymentPage.proceedToCheckout();
    }

    @Step("Verify checkout details")
    @Step("Verify checkout details")
    public void verifyCheckoutDetails() {
        // Implementation for verifying checkout details
        paymentPage.verifyCheckoutDetails();
    }
}