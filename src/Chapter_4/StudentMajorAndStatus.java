package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 01.07.2017.
 */
public class StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = scanner.nextLine();
        String major = "";
        String character = "";
        if (s.length() > 2 || !Character.isLetter(s.charAt(0)) ||
                !Character.isDigit(s.charAt(1))){
            System.out.println("Invalid input");
            System.exit(1);
        }
        else if (s.charAt(0) == 'M')
            major = "Mathematics";
        else if (s.charAt(0) == 'C')
            major = "Computer Science";
        else if (s.charAt(0) == 'I')
            major = "Information Technology";
        else {
            System.out.println("Invalid input");
            System.exit(2);
        }
        if (s.charAt(1) == '1')
            character = "Freshman";
        else if (s.charAt(1) == '2')
            character = "Sophomore";
        else if (s.charAt(1) == '3')
            character = "Junior";
        else if (s.charAt(1) == '4')
            character = "Senior"; else {
            System.out.println("Invalid input");
            System.exit(3);
        }

        System.out.printf("%s %s", major, character);
    }
}
