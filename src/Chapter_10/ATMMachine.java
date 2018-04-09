package Chapter_10;

import Chapter_9.Account;

import java.util.Scanner;

public class ATMMachine {
    /** Main method */
    public static void main(String[] args) {
        Account[] arrayAccounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            arrayAccounts[i] = new Account(i, 100, 5);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an id: ");
            int id = scanner.nextInt();
            if (id < 0 || id > 9) {
                System.out.println("Enter correct id");
                continue;
            }

            int choice = 0;
            while (choice != 4) {
            System.out.print("Main menu\n1: check balance\n2: withdraw\n3: deposit" +
                    "\n4: exit\nEnter a choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("The balance is " + arrayAccounts[id].getBalance());
                    break;
                }
                case 2: {
                    System.out.print("Enter an amount to withdraw: ");
                    arrayAccounts[id].withdraw(scanner.nextDouble());
                    break;
                }
                case 3: {
                    System.out.print("Enter an amount to deposit: ");
                    arrayAccounts[id].deposit(scanner.nextDouble());
                    break;
                }case 4: break;
            }
        }
        }
    }
}
