package com.edjo.demo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTest {

    private WebDriver driver;

    @Test
    public void testUserCanLogOutAfterSuccessfulLogin() {
        // Given the user has successfully logged in
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://example.com/login");
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("validUsername");
        passwordField.sendKeys("validPassword");
        loginButton.click();

        // When the user clicks the "Logout" button
        WebElement logoutButton = driver.findElement(By.id("logoutButton"));
        logoutButton.click();

        // Then the user should be redirected to the login page
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("http://example.com/login", currentUrl);

        // And a "Logged out successfully" message should be displayed
        WebElement logoutMessage = driver.findElement(By.id("logoutMessage"));
        Assert.assertTrue(logoutMessage.isDisplayed());
        Assert.assertEquals("Logged out successfully", logoutMessage.getText());

        // Close the browser
        driver.quit();
    }
}