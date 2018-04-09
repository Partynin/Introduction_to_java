package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 01.07.2017.
 */
public class ConvertLetterGradeToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String s = scanner.nextLine();

        if (s.equals("A")){
            System.out.println("The numeric value for grade " + s + " is 4");
        }
        else if (s.equals("B")){
            System.out.println("The numeric value for grade " + s + " is 3");
        }
        else if (s.equals("C")){
            System.out.println("The numeric value for grade " + s + " is 2");
        }
        else if (s.equals("D")){
            System.out.println("The numeric value for grade " + s + " is 1");
        }
        else if (s.equals("F")){
            System.out.println("The numeric value for grade " + s + " is 0");
        }
        else System.out.println(s + " is invalid input");
    }
}
