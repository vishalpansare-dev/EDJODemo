package com.edwardjones.cksn_ui_tests._tsc;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStep {

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        // Code to navigate to login page
    }

    @When("the user enters valid credentials")
    public void userEntersValidCredentials() {
        // Code to enter valid username and password
    }

    @Then("the user should be logged in successfully")
    public void userShouldBeLoggedIn() {
        // Code to verify successful login
    }
}