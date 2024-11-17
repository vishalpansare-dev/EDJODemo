package com.edwardjones.cksn_ui_tests.tests;

import com.edwardjones.cksn_ui_tests._tsc.PaymentsTransferSteps;
import com.edwardjones.cksn_ui_tests.common.TestManager;
import org.junit.jupiter.api.Test;


@RunWith(SerenityRunner.class)
public class PaymentTransferTest extends TestManager {

    @TestDataInjector(fileName = "PaymentTransfer")
    private Map<String, TransactionTestData> testData;

    @Steps
    protected PaymentsTransferSteps paymentTransferSteps;

    @Test
    public void testCheckoutWithItemsInCart() {
        TransactionTestData data = this.testData.get("test_checkout");
        authenticationSteps.authenticateSession(data.getImpersonateID());
        paymentTransferSteps
                .navigateToCheckoutPage(data)
                .verifyItemsInCart(data)
                .completeCheckout();
    }
}
