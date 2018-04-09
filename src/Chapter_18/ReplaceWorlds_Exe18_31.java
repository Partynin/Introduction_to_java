package Chapter_18;

import java.io.*;
import java.util.Scanner;

/** 18.31 (Replace words) Write a program that replaces all occurrences of a word with a
 new word in all the files under a directory, recursively. Pass the parameters from
 the command line as follows:
 java Exercise18_31 dirName oldWord newWord */

public class ReplaceWorlds_Exe18_31 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Use: java Exercise18_31 dirName oldWord newWord");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.isDirectory() && !file.isFile()) {
            System.out.println("Is not file or directory!");
        }

        System.out.println("Searching...");
        replaceOllWorlds(file, args[1], args[2]);
        System.out.println("Replace complete.");
    }

    public static void replaceOllWorlds(File file, String oldWorld, String newWorld) {
        if (file.isFile()) {
            String s = "";
            try (Scanner in = new Scanner(file)) {
                while (in.hasNext()) {
                    s += in.nextLine();
                }
            } catch (Exception ex) {
                System.out.println("We have a problem!");
                ex.printStackTrace();
            }
            if (s.length() > 0) {
                s = s.replaceAll(oldWorld, newWorld);

                try (BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(file, false))) {
                    out.write(s.getBytes());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            File[] files = file.listFiles();
            if (file != null) {
                for (File f : files) {
                    replaceOllWorlds(f, oldWorld, newWorld);
                }
            }
        }
    }
}
