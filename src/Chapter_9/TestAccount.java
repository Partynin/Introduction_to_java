package Chapter_9;

public class TestAccount {
    /** Main method */
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance = " + account.getBalance());
        System.out.println("Monthly interest = " + account.getMonthlyInterest());
        System.out.println("Date of created: " + (account.getDateCreated()).toString());
    }
}
