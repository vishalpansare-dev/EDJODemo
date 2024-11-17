package com.edwardjones.cksn_ui_tests._pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    // Locators for elements on the cart page
    private By cartIcon = By.id("cart-icon");
    private By addToCartButton = By.id("add-to-cart");
    private By confirmationMessage = By.id("confirmation-message");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}