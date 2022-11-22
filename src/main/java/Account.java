public class Account {
  protected String name;
  protected long balance;

  public Account(String name, long balance) {
    this.name = name;
    this.balance = balance;

  }

  public boolean pay(long amount) {
    if (balance > amount) {
      balance -= amount;
      return true;
    } else {
      return false;
    }
  }

  public boolean add(long amount) {
    balance += amount;
    return true;
  }

}
