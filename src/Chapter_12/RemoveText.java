package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
    /** Main method */
    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 2) {
            System.out.println("Usage: java RemoveText somText fileName");
            System.exit(1);
        }

        // Check if source file for change exists
        File sourceFile = new File(args[1]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[1] + " dose not exist");
            System.exit(2);
        }

        String s = "";
        try (
            Scanner input = new Scanner(sourceFile)
        ) {
            while (input.hasNext()) {
                s = s + input.nextLine();
            }

            s = s.replaceAll(args[0], "");
            System.out.println(s);
        }

        try (PrintWriter output = new PrintWriter(sourceFile)) {
            output.print(s);
        }

    }
}
