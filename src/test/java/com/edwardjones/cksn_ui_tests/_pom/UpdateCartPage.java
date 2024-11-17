package com.edwardjones.cksn_ui_tests._pom;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class UpdateCartPage extends PageObject {
    @FindBy(id = "product-quantity")
    private WebElementFacade productQuantity;

    public void updateProductQuantity(int quantity) {
        productQuantity.clear();
        productQuantity.type(String.valueOf(quantity));
    }
}