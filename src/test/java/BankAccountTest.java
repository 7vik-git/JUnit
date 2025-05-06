import com.gevernova.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDepositIncreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testWithdrawDecreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFundsThrowsException() {
        BankAccount account = new BankAccount();
        account.deposit(50.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(100.0));
    }
}

