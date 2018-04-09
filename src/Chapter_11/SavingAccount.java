package Chapter_11;

public class SavingAccount extends Account{
    private double savingsLimit;

    public SavingAccount() {
        this.savingsLimit = 1;
        setBalance(1);
    }

    public SavingAccount(int id, double balance, double annualInterestRate, double savingsLimit) {
        super(id, balance, annualInterestRate);
        this.savingsLimit = savingsLimit;
    }


    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < savingsLimit) {
            System.out.println("Invalid operation");
        }
        else setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {
        return "Saving-Account: " + getId();
    }
}
