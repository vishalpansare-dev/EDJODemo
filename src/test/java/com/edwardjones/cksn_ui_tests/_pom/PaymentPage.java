package com.edwardjones.cksn_ui_tests._pom;


import lombok.Getter;
import lombok.Setter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
@Setter
public class PaymentPage extends BasePage {
        @FindBy(xpath = "//h2[text()='Accounts']")
        private WebElementFacade AccountsHeading;
        @FindBy(xpath = "//div|@class='ej-amc-transfers-dropdown-no-data']")
        private WebElementFacade textInvalidAccountSearchErmorMsg;
        @FindBy(xpath = "//div[@class='ej-amc-error-retry__link']")
        private WebElementFacade buttonRetryAccountSearch;
        @FindBy(xpath = "//p[@class='ej-amc-error-retry__text']")
        private WebElementFacade textAccountSearchRetrieveErrorMsg;

}