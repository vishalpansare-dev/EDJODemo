package com.edwardjones.cksn_ui_tests._tsc;

import com.edwardjones.TransactionTestData;
import com.edwardjones.cksn_ui_tests._pom.PaymentPage;
import net.serenitybdd.annotations.Step;
import org.junit.Assert;


public class PaymentsTransferSteps extends BaseSteps<PaymentsTransferSteps> {

        private PaymentPage page;

    @Step("User Navigates to the Accounts tab {0F")
    public PaymentsTransferSteps verifyAccountsTabIsSelected(boolean expected) {
        boolean actual = page.getAccountsHeading().isDisplayed();
        Assert.assertEquals(expected,actual);
        return this;
        }
    @Step("User Navigates to the PaymentTransferPage")
    public PaymentsTransferSteps navigateToPaymentTransferPage(TransactionTestData data) {
        return this;
    }
    @Step("User verify Sender BankField")
    public PaymentsTransferSteps verifySenderBankField() {
        return this;
    }
    @Step("User verify Transfer Amount Field")
    public PaymentsTransferSteps verifyTransferAmountField() {
        return this;
    }
}