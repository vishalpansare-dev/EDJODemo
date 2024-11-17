package com.edwardjones.cksn_ui_tests._pom;



public class PaymentPage extends BasePage {
        @FindBy(xpath = "//h2[text()='Accounts']")
        private WebElementFacade accountsHeading;
        @FindBy(xpath = "//div|@class='ej-amc-transfers-dropdown-no-data']")
        private WebElementFacade textInvalidAccountSearchErmorMsg;
        @FindBy(xpath = "//div[@class='ej-amc-error-retry__link']ª)
        private WebElementFacade buttonRetryAccountSearch;
        @FindBy(xpath = "//p[@class='ej-amc-error-retry__text']ª)
        private WebElementFacade textAccountSearchRetrieveErrorMsg;

        public void completeCheckout() {
        // Code to complete checkout
    }

    public void applyPromoCode(String promoCode) {
        // Logic to apply promo code during checkout
    }

    public void verifyNoItemsInCart() {
        // Implement logic to verify no items in cart
    }
                }