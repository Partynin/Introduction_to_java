package Chapter_11;

public class SubclassesOfAccount {
    public static void main(String[] args) {
        Account account = new Account(1, 100, 5);
        SavingAccount savingAccount = new SavingAccount();
        CheckingAccount checkingAccount = new CheckingAccount();

        System.out.println(account.toString());
        System.out.println(savingAccount.toString());
        System.out.println(checkingAccount.toString());

        System.out.println("SavingAccount balance " + savingAccount.getBalance());
    }
}
