package com.edwardjones.cksn_ui_tests._tsc;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.core.annotations.Step;
import com.edwardjones.cksn_ui_tests._pom.PaymentPage;

public class PaymentsTransferSteps extends UIInteractionSteps {
    private PaymentPage paymentPage;

    @Step("Navigate to checkout page")
    public PaymentsTransferSteps navigateToCheckoutPage(TransactionTestData data) {
        // Implement navigation logic
        return this;
    }

    @Step("Verify items in cart")
    public PaymentsTransferSteps verifyItemsInCart(TransactionTestData data) {
        // Implement verification logic
        return this;
    }

    @Step("Complete checkout")
    public PaymentsTransferSteps completeCheckout() {
        paymentPage.completeCheckout();
        return this;
    }
}