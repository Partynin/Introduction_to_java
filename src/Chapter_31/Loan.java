package Chapter_31;

import java.io.Serializable;

public class Loan implements Serializable {
    private double annualInterestRate;
    private double numberOfYears;
    private double loanAmount;

    public Loan(double annualInterestRate, double numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
}
