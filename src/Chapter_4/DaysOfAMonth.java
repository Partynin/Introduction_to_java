package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 01.07.2017.
 */
public class DaysOfAMonth {

    private static int month;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String s = scanner.nextLine();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

                if (s.equals("Jan")) month = 1;
        else if (s.equals("Feb")) month = 2;
        else if (s.equals("Mar")) month = 3;
        else if (s.equals("Apr")) month = 4;
        else if (s.equals("May")) month = 5;
        else if (s.equals("Jun")) month = 6;
        else if (s.equals("Jul")) month = 7;
        else if (s.equals("Aug")) month = 8;
        else if (s.equals("Sep")) month = 9;
        else if (s.equals("Oct")) month = 10;
        else if (s.equals("Nov")) month = 11;
        else if (s.equals("Dec")) month = 12;

            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        switch (month) {
            case 1:
                System.out.println("January " + year + " has 31 days");
                break;
            case 2: {
                if (isLeapYear)
                    System.out.println("February " + year + " has 29 days");
                else
                    System.out.println("February " + year + " has 28 days");
                break;
            }
            case 3:
                System.out.println("March " + year + " has 31 days");
                break;
            case 4:
                System.out.println("April " + year + " has 30 days");
                break;
            case 5:
                System.out.println("May " + year + " has 31 days");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days");
                break;
            case 7:
                System.out.println("July " + year + " has 31 days");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days");
                break;
            case 9:
                System.out.println("September " + year + " has 30 days");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days");
                break;
            case 11:
                System.out.println("November " + year + " has 30 days");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days");
        }
    }
}