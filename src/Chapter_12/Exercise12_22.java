package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/** Revise Programming Exercise 12.16 to replace a string in a file
 with a new string for all files in the specified directory using the command:
 java Exercise12_22 dir oldString newString */

public class Exercise12_22 {
    /** Main method */
    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
         if (args.length != 3) {
             System.out.println("Usage: java Exercise12_22 dir oldString newString");
             System.exit(11);
             }

         // Check if the File object represents a directory.
         File sourceFiles = new File(args[0]);
         if (!sourceFiles.exists()) {
             System.out.println("Source file " + args[0] + " does not directory");
             System.exit(12);
             }

         // Returns the files under the directory for a directory File object
         File[] filesList = sourceFiles.listFiles();

        for (int i = 0; i < filesList.length; i++) {
            // Check if target file exists
             File targetFile = new File(args[0] + "\\" +
                     filesList[i].getName() + i + "new.txt");
             if (targetFile.exists()) {
                 System.out.println("Target file " + filesList[i].getName() + i +
                         "new.txt" + " already exists");
                 System.exit(13);
                 }
            try (
                    // Create input and output files
                    Scanner input = new Scanner(filesList[i]);
                    PrintWriter output = new PrintWriter(targetFile)
            ) {
                while (input.hasNext()) {
                    String s1 = input.nextLine();
                    String s2 = s1.replaceAll(args[1], args[2]);
                    output.println(s2);
                }
            }

        }
    }
}
