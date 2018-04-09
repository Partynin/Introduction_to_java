package Chapter_17;

import java.io.*;
import java.util.Scanner;

/** (Convert a text file into UTF) Write a program that reads lines of characters from
 a text file and writes each line as a UTF-8 string into a binary file. Display the
 sizes of the text file and the binary file. Use the following command to run the
 program:
 java Exercise17_04 Welcome.java Welcome.utf */

public class ConvertATextFileIntoUTF_Exe17_4 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java ConvertATextFileIntoUTF_Exe17_4 Welcome.java " +
                    "Welcome.utf");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " dose not exist");
            System.exit(2);
        }

        // Check if target file exists
        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("Target file " + args[0] + " already exists");
            System.exit(3);
        }

        try (
                Scanner input = new Scanner(sourceFile);
                DataOutputStream output = new DataOutputStream(new BufferedOutputStream(
                        new FileOutputStream(targetFile)))
                ) {
            String s;
            int fileSize = 0;
            while (input.hasNext()) {
                s = input.nextLine();
                output.writeUTF(s);
                fileSize += s.length();
            }
            System.out.println("Text file " + args[0] + " has size = " + fileSize + " bytes");
            System.out.println("Text file " + args[1] + " has size = " + output.size() + " bytes");
        }
    }
}
