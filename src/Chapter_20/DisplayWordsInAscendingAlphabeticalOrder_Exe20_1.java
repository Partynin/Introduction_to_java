package Chapter_20;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/** *20.1 (Display words in ascending alphabetical order) Write a program that reads
 words from a text file and displays all the words (duplicates allowed) in ascending
 alphabetical order. The words must start with a letter. The text file is passed
 as a command-line argument. */

public class DisplayWordsInAscendingAlphabeticalOrder_Exe20_1 {
    /** Main method */
    public static void main(String[] args) {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println(
                    "Usage: java DisplayWordsInAscendingAlphabeticalOrder_Exe20_1 sourceFile"
            );
            System.exit(1);
        }

        // Check if source file exist
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " dose not exist");
            System.exit(2);
        }

        // Create arrayList
        List<String> list = new ArrayList<>();

        try (
                // Create input file
                Scanner input = new Scanner(sourceFile)
                ) {
            while (input.hasNext()) {
                list.add(input.next());
            }
            Collections.sort(list);
            System.out.println(list);
        } catch (Exception ex) {
            System.out.println("We have problem!");
            ex.printStackTrace();
        }
    }
}
