import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest {

  @Test
  public void SavingsAccountTest() {
    SavingsAccount savingsAccount = new SavingsAccount("TestNameSave", 1000, 200);
    Assertions.assertTrue(savingsAccount.pay(1));
  }

  @Test
  public void CreditAccountTest() {
    CreditAccount creditAccount = new CreditAccount("TestNameCredit", -2000);
    Assertions.assertFalse(creditAccount.add(3000));
  }

  @Test
  public void CheckingAccount() {
    CheckingAccount checkingAccount = new CheckingAccount("TestNameCheck", 1000);
    Assertions.assertNotNull(checkingAccount);
  }
}

