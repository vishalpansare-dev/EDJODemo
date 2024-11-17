package com.edwardjones.cksn_ui_tests.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.edwardjones.cksn_ui_tests._tsc.UpdateCartSteps;

@RunWith(SerenityRunner.class)
public class UpdateCartTest {
    @Steps
    UpdateCartSteps updateCartSteps;

    @Test
    public void testUpdateProductQuantity() {
        updateCartSteps.updateProductQuantity(5);
    }
}