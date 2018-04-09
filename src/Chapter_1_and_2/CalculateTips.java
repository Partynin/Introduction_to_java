package Chapter_1_and_2;

import Chapter_6.TestMax;

import java.util.Scanner;

/**
 * 1.1 (Display three messages) Write a program that displays Welcome to Java,
 * Welcome to Computer Science, and Programming is fun.
 *
 * Created by Kos on 26.05.2017.
 */
public class CalculateTips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuityRate = scanner.nextDouble();

        double gratuity = subtotal / 100 * gratuityRate;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

        System.out.println(TestMax.max(3,5));
    }
}
