package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 02.07.2017.
 */
public class FinancialApplicationPayroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter number of hours worked in week: ");
        double x = scanner.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double y = scanner.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double z = scanner.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double c = scanner.nextDouble();

        System.out.println("Employee Name: " + s1);
        System.out.println("Hours Worked: " + x);
        System.out.println("Pay Rate: " + y);
        double grossPay = x * y;
        System.out.println("Gross Pay: " + grossPay);
        double fed = grossPay * z;
        double sta = grossPay * c;
        System.out.printf("Deduction: \n\tFederal Withholding (%.1f%%): $%.2f\n\t" +
                "State Withholding (%.1f%%): $%.2f\n\tTotal Deduction: &%.2f\n" +
                "Net Pay: $%.2f", (100 * z), fed, (c * 100), sta, (fed + sta), (grossPay
                - (fed + sta)));
    }
}
