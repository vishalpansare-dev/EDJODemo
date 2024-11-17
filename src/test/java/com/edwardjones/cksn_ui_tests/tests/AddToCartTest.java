package com.edwardjones.cksn_ui_tests.tests;

import com.edwardjones.cksn_ui_tests._tsc.AddToCartSteps;
import com.edwardjones.cksn_ui_tests.common.TestManager;
import org.junit.jupiter.api.Test;

@RunWith(SerenityRunner.class)
public class AddToCartTest extends TestManager {

    @TestDataInjector(fileName = "AddToCart")
    private Map<String, CartTestData> testData;

    @Steps
    protected AddToCartSteps addToCartSteps;

    @Test
    public void testAddToCart() {
        CartTestData data = this.testData.get("test_product");
        addToCartSteps
                .navigateToProductPage(data)
                .addProductToCart(data)
                .verifyProductInCart(data);
    }
}