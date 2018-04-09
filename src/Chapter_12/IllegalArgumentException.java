package Chapter_12;

import java.util.Date;

public class IllegalArgumentException {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    /** Default constructor */
    public IllegalArgumentException() {
        this(2.5, 1, 1000);
    }

    /** Constructor a loan with specified annual interest rate,
     * number of years, and loan amount.
     */
    public IllegalArgumentException(double annualInterestRate, int numberOfYears, double loanAmount) {
        setAnnualInterestRate(annualInterestRate);
        setLoanAmount(loanAmount);
        setNumberOfYears(numberOfYears);
        loanDate = new Date();
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /** Return loanAmount */
    public double getLoanAmount() {
        return loanAmount;
    }

    /** Return loan date */
    public Date getLoanDate() {
        return loanDate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) throws java.lang.IllegalArgumentException {
        if (annualInterestRate > 0)
            this.annualInterestRate = annualInterestRate;
        else throw new java.lang.IllegalArgumentException("Illegal argument! Interest rate");
    }

    /** Set a numberOfYears */
    public void setNumberOfYears(int numberOfYears) throws java.lang.IllegalArgumentException {
        if (numberOfYears > 0)
            this.numberOfYears = numberOfYears;
        else throw new java.lang.IllegalArgumentException("Illegal argument! Number of years");
    }

    /** Set a new loanAmount */
    public void setLoanAmount(double loanAmount) throws java.lang.IllegalArgumentException {
        if (loanAmount > 0)
            this.loanAmount = loanAmount;
        else throw new java.lang.IllegalArgumentException("Illegal argument! Loan amount");
    }

    /** Find monthly payment */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    /** Find total payment */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
}

