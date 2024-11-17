import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogoutTest {

    @Test
    public void testUserLogout() {
        // Given the user has successfully logged in
        User user = new User();
        user.login();

        // When the user clicks the "Logout" button
        user.clickLogoutButton();

        // Then the user should be redirected to the login page
        assertEquals("LoginPage", user.getCurrentPage());

        // And a "Logged out successfully" message should be displayed
        assertEquals("Logged out successfully", user.getLogoutMessage());
    }
}