import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testSuccessfulLogin() {
        // Given valid credentials
        String username = "validUser";
        String password = "validPassword";

        // When the user attempts to log in
        boolean loginResult = login(username, password);

        // Then the login should be successful
        assertTrue(loginResult);
    }

    // Simulated login method for demonstration purposes
    private boolean login(String username, String password) {
        return "validUser".equals(username) && "validPassword".equals(password);
    }
}