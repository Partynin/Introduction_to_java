package Chapter_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/** 21.2 (Display nonduplicate words in ascending order) Write a program that reads
 words from a text file and displays all the nonduplicate words in ascending order.
 The text file is passed as a command-line argument. */

public class DisplayNonduplicateWordsInAscendingOrder_Exe21_2 {
    /** Main method */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use: java DisplayNonduplicateWordsInAscendingOrder_Exe21_2  filePath");
            System.exit(10);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("We don't have file!");
            System.exit(20);
        }

        // Set for saving words
        Set<String> setOfWords = new TreeSet<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String word = input.next();
                setOfWords.add(word);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("We have lost file(");
            ex.printStackTrace();
        }

        System.out.println(setOfWords);
    }
}
