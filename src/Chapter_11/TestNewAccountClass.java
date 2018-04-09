package Chapter_11;

public class TestNewAccountClass {
    /** Main method */
    public static void main(String[] args) {
        NewAccountClass account = new NewAccountClass(1122, 1000, 1.5,
                "George");

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Account summary: \nholder name - " + account.getName() +
                "\ninterest rate - " + account.getAnnualInterestRate() + "\nbalance - " +
        account.getBalance() + "\nall transaction:");

        for (Transaction transaction: account.getTransactions()) {
            System.out.println(transaction.toString());
        }
    }
}
