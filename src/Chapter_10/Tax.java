package Chapter_10;

public class Tax {
    private int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HED_OF_HOUSEHOLD = 3;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {

    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTax() {
        double tax = 0;

        if (filingStatus == SINGLE_FILER){ // Compute tax for single filers
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 82250)
                tax = 8350 * 0.10 + (33950 - 8530) * 0.15 +
                        (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (taxableIncome - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        else if (filingStatus == MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER){
            if (taxableIncome <= 16700)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 67900)
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            else if (taxableIncome <= 173050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (taxableIncome - 67900) * 0.25;
            else if (taxableIncome <= 208850)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                        (taxableIncome - 208850) * 0.33;
            else
                tax = 167700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                        (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        else if (filingStatus == MARRIED_SEPARATELY){
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 68525)
                tax = 8350 * 0.10 + (33950 - 8530) * 0.15 +
                        (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 104425)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
            else if (taxableIncome <= 186475)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                        (taxableIncome - 104425) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                        (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
        }
        else if (filingStatus == HED_OF_HOUSEHOLD){
            if (taxableIncome <= 11950)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 45500)
                tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
            else if (taxableIncome <= 117450)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (taxableIncome - 45500) * 0.25;
            else if (taxableIncome <= 190200)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                        (taxableIncome - 190200) * 0.33;
            else
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                        (372950 - 190200) * 0.33 + (taxableIncome - 372950);
        }
        else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        return tax = (int)(tax * 100) / 100.0;
    }
}
