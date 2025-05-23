import com.gevernova.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    BankAccount account;
    @BeforeEach
    void setUp(){
        account = new BankAccount();
    }

    @Test
    void testDepositIncreasesBalance() {
        account = new BankAccount();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testWithdrawDecreasesBalance() {
        account = new BankAccount();
        account.deposit(200.0);
        account.withdraw(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFundsThrowsException() {
        account = new BankAccount();
        account.deposit(50.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(100.0));
    }
}

