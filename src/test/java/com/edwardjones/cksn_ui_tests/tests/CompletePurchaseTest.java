package com.edwardjones.cksn_ui_tests.tests;

import com.edwardjones.SerenityRunner;
import com.edwardjones.TestDataInjector;
import com.edwardjones.cksn_ui_tests._tsc.AuthenticationSteps;
import com.edwardjones.cksn_ui_tests._tsc.PaymentsTransferSteps;
import com.edwardjones.cksn_ui_tests.common.TestManager;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import com.edwardjones.TransactionTestData;

import java.util.Map;

@RunWith(SerenityRunner.class)
public class CompletePurchaseTest extends TestManager {

    @TestDataInjector(fileName = "CompletePurchase")
    private Map<String, TransactionTestData> testData;

    @Steps
    protected PaymentsTransferSteps paymentTransferSteps;
    @Steps
    protected AuthenticationSteps authenticationSteps;

    @Test
    public void testCompletePurchase() {
        TransactionTestData data = this.testData.get("test_account");
        authenticationSteps.authenticateSession(data.getImpersonateID());
        paymentTransferSteps
                .navigateToPaymentTransferPage(data)
                .completePurchase(data)
                .verifyPurchaseConfirmation();
    }
}