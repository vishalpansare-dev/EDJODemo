package com.edwardjones.cksn_ui_tests._pom;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddToCartPage extends PageObject {

    @FindBy(id = "add-to-cart")
    private WebElementFacade addToCartButton;

    @FindBy(id = "cart-icon")
    private WebElementFacade cartIcon;

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public boolean isCartIconUpdated() {
        // Logic to check if cart icon is updated
        return cartIcon.isDisplayed();
    }
}