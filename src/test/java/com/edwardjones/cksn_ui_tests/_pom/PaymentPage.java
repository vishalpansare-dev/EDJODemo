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

        public WebElementFacade allAmcTabLocators (String userPick) { return $(allAmcTabs,userPick); }
                }

        public void checkoutWithItemsInCart() {
            public void checkoutWithItemsInCart() {
        // Implementation for interacting with checkout and cart
        public void addItemToCart() {
        // Implementation for adding items to the cart
    }

    public void proceedToCheckout() {
        // Implementation for proceeding to checkout
    }

    public void verifyCheckoutDetails() {
        // Implementation for verifying checkout details
    }
    }
            public void addItemToCart() {
        // Implementation for adding items to the cart
    }

    public void proceedToCheckout() {
        // Implementation for proceeding to checkout
    }

    public void verifyCheckoutDetails() {
        // Implementation for verifying checkout details
    }
        }