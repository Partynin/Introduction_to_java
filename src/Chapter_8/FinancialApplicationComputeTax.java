package Chapter_8;

import java.util.Scanner;

public class FinancialApplicationComputeTax {

public static void main(String[] args) {
    // Create a scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter filing status
    System.out.print("(0-single filter, 0-married jointly or " +
            "qualifying widow(er), 1-married separately, 1-head of " +
            "household)\n Enter the filing status: ");

    int status = input.nextInt();

    // Prompt the user to enter taxable income
    System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();
    int rat = 0;

    if (income <= 8350)
        rat = 0;
    else if (income <= 33950)
        rat = 1;
    else if (income <= 82250)
        rat = 2;
    else if (income <= 171550)
        rat = 3;
    else if (income <= 372950)
        rat = 4;

    // Compute tax
    double tax = 0;

    double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

    int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},   // Single filer
            {16700, 67900, 137050, 20885, 372950},  // Married jointly
                                                    // -or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475},   // Married separately
            {11950, 45500, 117450, 190200, 372950}  // Head of household
    };

    tax = brackets[status][rat] * rates[0] + (brackets[0][1] - brackets[0][0]) * rates[1] +
            (brackets[0][2] - brackets[0][1]) * rates[2] + (brackets[0][3] -
            brackets[0][2]) * rates[3] + (brackets[0][4] - brackets[0][3]) *
            rates[4] + (400000 - brackets[0][4]) * rates[5];

   /** if (status == 0){ // Compute tax for single filers
        if (income <= 8350)
            tax = income * 0.10;
        else if (income <= 33950)
            tax = 8350 * 0.10 + (income - 8350) * 0.15;
        else if (income <= 82250)
            tax = 8350 * 0.10 + (33950 - 8530) * 0.15 +
                    (income - 33950) * 0.25;
        else if (income <= 171550)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
        else if (income <= 372950)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                    (income - 171550) * 0.33;
        else
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                    (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
    }
    else if (status == 1){
        if (income <= 16700)
            tax = income * 0.10;
        else if (income <= 67900)
            tax = 16700 * 0.10 + (income - 16700) * 0.15;
        else if (income <= 173050)
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                    (income - 67900) * 0.25;
        else if (income <= 208850)
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                    (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
        else if (income <= 372950)
            tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                    (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                    (income - 208850) * 0.33;
        else
            tax = 167700 * 0.10 + (67900 - 16700) * 0.15 +
                    (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                    (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
    }
    else if (status == 2){
        if (income <= 8350)
            tax = income * 0.10;
        else if (income <= 33950)
            tax = 8350 * 0.10 + (income - 8350) * 0.15;
        else if (income <= 68525)
            tax = 8350 * 0.10 + (33950 - 8530) * 0.15 +
                    (income - 33950) * 0.25;
        else if (income <= 104425)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
        else if (income <= 186475)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                    (income - 104425) * 0.33;
        else
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                    (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
    }
    else if (status == 3){
        if (income <= 11950)
            tax = income * 0.10;
        else if (income <= 45500)
            tax = 11950 * 0.10 + (income - 11950) * 0.15;
        else if (income <= 117450)
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                    (income - 45500) * 0.25;
        else if (income <= 190200)
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                    (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
        else if (income <= 372950)
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                    (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                    (income - 190200) * 0.33;
        else
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                    (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                    (372950 - 190200) * 0.33 + (income - 372950);
    }
    else {
        System.out.println("Error: invalid status");
        System.exit(1);
    }
        */
    // Display the result
    System.out.println("Tax is " + tax);
}
}