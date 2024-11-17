package com.edjo.demo;

import org.junit.jupiter.api.Test;
import static io.cucumber.junit.CucumberOptions.*;
import static org.junit.jupiter.api.Assertions.*;

public class LoginLogoutTest {

    @Given("the user has successfully logged in")
    public void userHasLoggedIn() {
        // Code to simulate user login
    }

    @When("the user clicks the \"Logout\" button")
    public void userClicksLogoutButton() {
        // Code to simulate clicking the logout button
    }

    @Then("the user should be redirected to the login page")
    public void userRedirectedToLoginPage() {
        // Code to verify redirection to login page
        assertEquals("loginPageUrl", getCurrentUrl());
    }

    @Then("a \"Logged out successfully\" message should be displayed")
    public void userSeesLogoutMessage() {
        // Code to verify logout message
        assertTrue(isMessageDisplayed("Logged out successfully"));
    }
}

