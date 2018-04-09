package Chapter_7;

import java.util.Scanner;

public class CultureChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        System.out.println(zodiac[year % 12]);
    }
}