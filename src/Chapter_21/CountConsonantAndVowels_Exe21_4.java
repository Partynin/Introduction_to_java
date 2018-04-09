package Chapter_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** *21.4 (Count consonants and vowels) Write a program that prompts the user to enter a
 text file name and displays the number of vowels and consonants in the file. Use
 a set to store the vowels A, E, I, O, and U. */

public class CountConsonantAndVowels_Exe21_4 {
    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filename = input.nextLine();

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("The number of vowels and consonants in " + filename
                    + " is " + countVowelsAndConsonants(file));
        } else {
            System.out.println("File " + filename + " dose not exist");
        }
    }

    private static String countVowelsAndConsonants(File file) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        String[] vowelLetters = {"a", "e",  "i",  "o", "u"};
        Set<String> setLetters = new HashSet<>(Arrays.asList(vowelLetters));

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                char[] characters = input.next().toCharArray();
                for (char c : characters) {
                    if (setLetters.contains(Character.toString(c).toLowerCase()))
                        vowelsCount++;
                    else if (Character.isLetter(c))
                        consonantsCount++;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("We have problem(");
            ex.printStackTrace();
        }

        return "vowels count = " + vowelsCount + " consonants count = " + consonantsCount;
    }
}
