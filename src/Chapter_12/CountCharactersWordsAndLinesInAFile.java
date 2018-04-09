package Chapter_12;

import java.io.File;
import java.util.Scanner;

public class CountCharactersWordsAndLinesInAFile {
    /** Main method */
    public static void main(String[] args) {
        // Check if right input args
        if (args.length != 1) {
            System.out.println("Users: CountCharactersWordsAndLinesInAFile.java Test1.txt");
            System.exit(11);
        }

        // Check the file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File do not exists");
            System.exit(12);
        }

        int countLines = 0;
        int countWords = 0;
        int countCharacters = 0;
        try (
                Scanner scanner = new Scanner(file)
                ) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                countLines++;
                countCharacters += charactersPerLine(s);
                countWords += wordsPerLine(s);
            }
        }
        catch (Exception ex) {
            System.out.println("File do not found");
        }

        System.out.println("File " + args[0] + " has");
        System.out.println(countLines + " lines");
        System.out.println(countCharacters + " characters");
        System.out.println(countWords + " words");
    }

    /** Count characters per line */
    public static int charactersPerLine(String s) {
        int count = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                count--;
        }

        return count;
    }

    /** Count words per line */
    public static int wordsPerLine(String s) {
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                count += 1;
        }

        return count;
    }
}
