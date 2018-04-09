package Chapter_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/** **21.8 (Count the occurrences of words in a text file) Rewrite Listing 21.9 to read the
 text from a text file. The text file is passed as a command-line argument. Words
 are delimited by whitespace characters, punctuation marks (,;.:?), quotation
 marks ('"), and parentheses. Count words in case-insensitive fashion (e.g., consider
 Good and good to be the same word). The words must start with a letter.
 Display the output in alphabetical order of words, with each word preceded by
 its occurrence count. */

public class CountTheOccurrencesOfWordsInATextFile_Exe21_8 {
    /** Main method */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use: java CountTheOccurrencesOfWordsInATextFile_Exe21_8 Text.txt");
            System.exit(10);
        }

        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("We have problem!");
            System.exit(20);
        }

        // Set text in a String
        String text = "";

        try (
                Scanner input = new Scanner(file);
                ) {
            while (input.hasNext()) {
                text += input.nextLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Where did he go!");
            ex.printStackTrace();
        }

        // Create a TreeMap to store words as a kye and count as value
        Map<String, Integer> map = new TreeMap<>();

        String[] words = text.split("[ \n\t\r}.,:;!?(){\"\']");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();

            if (key.length() > 0 && Character.isLetter(key.charAt(0))) {
                map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
            }
        }


        // Get all entries into a set
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Get key and value from each entry
        for (Map.Entry<String, Integer> entry: entrySet) {
            String s = String.format("%-15s%d", entry.getKey(), entry.getValue());
            System.out.println(s);
        }
    }
}
