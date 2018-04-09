package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceGlyph {
    public static void main(String[] args) throws Exception {
        // Check if source file exists
        File sourceFile = new File("2s_8series (2).txt");
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Check if target file exists
        File targetFile = new File("t.txt");
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        try (
                // Create input and output files
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replace("<i>", " ");
                output.println(s2);
            }
        }
    }
}
