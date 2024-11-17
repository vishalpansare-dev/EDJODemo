package com.edwardjones.cksn_ui_tests._tsc;

public class PaymentsTransferSteps extends BaseSteps<PaymentsTransferSteps> {

        private Accountspage page;
        private NewTransferPage commonElements;

    @Step("User Navigates to the Accounts tab {0F")
    public PaymentsTransferSteps verifyAccountsTabIsSelected(boolean expected) {
        boolean actual = page-getAccountsHeading.isDisplayedO;
        assertThat(actual). isEqualTo(expected);
        return this;
        }
    @Step("User Navigates to the Payment Transfer page")
    public PaymentsTransferSteps navigateToPaymentTransferPage(TransactionTestData data) {
        return this;
    }

    @Step("Apply promo code")
    public PaymentsTransferSteps applyPromoCode(String promoCode) {
        paymentPage.applyPromoCode(promoCode);
        return this;
    }

    public PaymentsTransferSteps verifySenderBankField() {
        return this;
    }
}