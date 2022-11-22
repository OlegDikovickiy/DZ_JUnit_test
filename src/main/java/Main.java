public class Main {

  public void main(String[] args) {
    Account account = new Account("Oleg", 1000);

    System.out.println(account.add(1500));
    System.out.println(account.pay(300));
    System.out.println(account.balance);


    SavingsAccount SavingsAccount = new SavingsAccount("Nikita", 3000, 2000);
    System.out.println(SavingsAccount.add(2000));
    System.out.println(SavingsAccount.pay(1500));
    System.out.println(SavingsAccount.balance);

    CheckingAccount CheckingAccount = new CheckingAccount("Marina", 5000);
    System.out.println(CheckingAccount.add(2000));
    System.out.println(CheckingAccount.pay(9000));
    System.out.println(CheckingAccount.balance);

    CreditAccount CreditAccount = new CreditAccount("Marina", -5000);
    System.out.println(CreditAccount.add(2000));
    System.out.println(CreditAccount.pay(15000));
    System.out.println(CreditAccount.add(50000));
    System.out.println(CreditAccount.balance);


  }
}