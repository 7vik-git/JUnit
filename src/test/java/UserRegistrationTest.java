import com.gevernova.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    void testValidRegistration() {
        UserRegistration reg = new UserRegistration();
        assertDoesNotThrow(() -> reg.registerUser("john", "john@example.com", "secure123"));
    }

    @Test
    void testInvalidUsername() {
        UserRegistration reg = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> reg.registerUser("", "user@example.com", "pass123"));
    }

    @Test
    void testInvalidEmail() {
        UserRegistration reg = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> reg.registerUser("user", "userexample.com", "pass123"));
    }

    @Test
    void testInvalidPassword() {
        UserRegistration reg = new UserRegistration();
        assertThrows(IllegalArgumentException.class, () -> reg.registerUser("user", "user@example.com", "123"));
    }
}
