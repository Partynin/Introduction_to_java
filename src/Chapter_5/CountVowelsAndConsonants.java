package Chapter_5;

import java.util.Scanner;

/**
 * Created by Kos on 16.07.2017.
 */
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int vowels = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                count++;
            if (Character.toUpperCase(s.charAt(i)) == 'A' || Character.toUpperCase(s.charAt(i)) == 'E'
                    || Character.toUpperCase(s.charAt(i)) == 'I' || Character.toUpperCase(s.charAt(i)) == 'O'
                    || Character.toUpperCase(s.charAt(i)) == 'U') {
                vowels++;
            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonant is " + (count - vowels));
    }
}
