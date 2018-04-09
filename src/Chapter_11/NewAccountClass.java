package Chapter_11;

import java.util.ArrayList;
import java.util.Date;

public class NewAccountClass {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();


    public NewAccountClass(int id, double balance, double annualInterestRate, String name) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate / 100;
        this.dateCreated = new Date();
        this.name = name;
    }

    public NewAccountClass() {
        this(0, 0,0, "Nemo");
    }

    public NewAccountClass(int id, double balance, String name) {
        this(id, balance, 0, name);
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterest() {
        double monthlyInterestRate = annualInterestRate / 12;

        return balance * monthlyInterestRate;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance,
                amount + " withdraw"));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance,
                amount + " deposit"));
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
