package Chapter_18;

import java.io.File;
import java.util.Scanner;

/** 18.30 (Find words) Write a program that finds all occurrences of a word in all the files
 under a directory, recursively. Pass the parameters from the command line as
 follows:
 java Exercise18_30 dirName word */

public class FindWords_Exe18_30 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Enter path as: java Exercise18_30 dirName word");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.isDirectory() && !file.isFile()) {
            System.out.println("Is not file or directory!");
        }

        System.out.println("Searching...");
        getOccurrences(file, args[1]);
        System.out.println("Search complete.");
    }

    public static void getOccurrences(File file, String world) {
        if (file.isFile()) {
            try (
                    Scanner input = new Scanner(file)
            ) {
                while (input.hasNextLine()) {
                    String s = input.nextLine();
                    if (s.contains(world))
                        System.out.println("File: " + s);
                }
            } catch (Exception ex) {
                System.out.println("We have a problem with input data!");
                ex.printStackTrace();
            }
        } else {
            File[] files = file.listFiles();
            if (file != null) {
                for (File f : files) {
                    getOccurrences(f, world);
                }
            }
        }
    }
}
