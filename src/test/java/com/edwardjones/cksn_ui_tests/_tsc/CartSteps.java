package com.edwardjones.cksn_ui_tests._tsc;

import com.edwardjones.cksn_ui_tests._pom.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    private WebDriver driver;
    private CartPage cartPage;

    public CartSteps(WebDriver driver) {
        this.driver = driver;
        cartPage = new CartPage(driver);
    }

    @When("the user adds an item to the cart")
    public void addItemToCart() {
        cartPage.clickAddToCart();
    }

    @Then("the confirmation message should be displayed")
    public void verifyConfirmationMessage() {
        String message = cartPage.getConfirmationMessage();
        assert message.contains("Item added to cart");
    }

    @When("the user clicks on the cart icon")
    public void clickOnCartIcon() {
        cartPage.clickCartIcon();
    }
}