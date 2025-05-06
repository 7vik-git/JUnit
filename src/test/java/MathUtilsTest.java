import com.gevernova.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void testDivideByNonZero() {
        assertEquals(2, MathUtils.divide(10, 5));
    }

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> MathUtils.divide(10, 0));
    }
}
