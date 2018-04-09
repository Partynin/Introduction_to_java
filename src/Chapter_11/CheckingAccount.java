package Chapter_11;

public class CheckingAccount extends Account {
    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {
        return "Checking-Account: " + getId();
    }
}
