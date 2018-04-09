package Chapter_4;

import java.util.Scanner;

/**
 * Created by Kos on 01.07.2017.
 */
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = scanner.nextLine();

        if (s.length() > 1 || !Character.isLetter(s.charAt(0))){
            System.out.println(s + " is an invalid input");
            System.exit(1);
        }
        else if ((s.toUpperCase()).charAt(0) == 65 || (s.toUpperCase()).charAt(0) == 69 || (s.toUpperCase()).charAt(0) == 73 ||
                (s.toUpperCase()).charAt(0) == 79 || (s.toUpperCase()).charAt(0) == 65 || (s.toUpperCase()).charAt(0) == 89){
            System.out.println(s + " is a vowel");
        }
        else System.out.println(s + " is a consonant");
    }
}
