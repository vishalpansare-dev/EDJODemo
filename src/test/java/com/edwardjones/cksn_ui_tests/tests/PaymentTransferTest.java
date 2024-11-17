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
    @Test
    public void testUserCanLogOutAfterSuccessfulLogin() {
        TransactionTestData data = this.testData.get("test_account");
        authenticationSteps.authenticateSession(data.getImpersonateID());
        // Simulate clicking the Logout button
        paymentTransferSteps.clickLogoutButton();
        // Verify that the user is redirected to the login page
        paymentTransferSteps.verifyRedirectToLoginPage();
        // Verify the logout success message
        paymentTransferSteps.verifyLogoutSuccessMessage();
    }
        TransactionTestData data = this.testData.get("test_account");
        authenticationSteps.authenticateSession(data.getImpersonateID());
        paymentTransferSteps
                .navigateToPaymentTransferPage(data)
                .verifySenderBankField()
                .verifyTransferAmountField();
    }
}
