import com.gevernova.UserRegistration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    UserRegistration reg;
    @BeforeEach
    void setUp(){
        reg = new UserRegistration();
    }
    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> reg.registerUser("john", "john@example.com", "secure123"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> reg.registerUser("", "ge@vernova.com", "pass123"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> reg.registerUser("user", "gevernova.com", "pass123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> reg.registerUser("user", "ge@vernova.com", "123"));
    }
}
