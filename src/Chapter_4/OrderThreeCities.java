package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 02.07.2017.
 */
public class OrderThreeCities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second city: ");
        String s2 = scanner.nextLine();
        System.out.print("Enter the third city: ");
        String s3 = scanner.nextLine();

        String first = "";
        String second = "";
        String third = "";

        if (s1.compareTo(s2) < 0 && s2.compareTo(s3) < 0){
            first = s1;
            second = s2;
            third = s3;
        }
        else if (s3.compareTo(s1) < 0 && s1.compareTo(s2) < 0){
            first = s3;
            second = s1;
            third = s2;
        }
        else if (s2.compareTo(s3) < 0 && s3.compareTo(s1) < 0){
            first = s2;
            second = s3;
            third = s1;
        }
        else if (s3.compareTo(s2) < 0 && s2.compareTo(s1) < 0){
            first = s3;
            second = s2;
            third = s1;
        }
        else if (s1.compareTo(s3) < 0 && s3.compareTo(s2) < 0){
            first = s1;
            second = s3;
            third = s2;
        }
        else if (s2.compareTo(s1) < 0 && s1.compareTo(s3) < 0){
            first = s2;
            second = s1;
            third = s3;
        }
        System.out.printf("Three cities in alphabetical order are %s %s %s", first,
                second, third);
    }
}
