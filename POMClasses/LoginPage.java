// POM class for the Login Page

public class LoginPage {
    // Web elements
    private WebElement usernameField;
    private WebElement passwordField;
    private WebElement loginButton;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.usernameField = driver.findElement(By.id("username"));
        this.passwordField = driver.findElement(By.id("password"));
        this.loginButton = driver.findElement(By.id("loginButton"));
    }

    // Method to perform login
    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}