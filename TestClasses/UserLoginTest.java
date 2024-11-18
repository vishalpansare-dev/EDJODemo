import org.junit.Test;
import static org.junit.Assert.*;

public class UserLoginTest {

    @Test
    public void testUserLogin() {
        // Given
        String username = "testUser";
        String password = "testPassword";

        // When
        boolean loginSuccess = User.login(username, password);

        // Then
        assertTrue(loginSuccess);
    }
}