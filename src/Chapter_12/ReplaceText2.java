package Chapter_12;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText2 {
    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println("java ReplaceText2 file oldString newString");
            System.exit(11);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(12);
        }

        StringBuilder text = new StringBuilder();
        try (
                // Create input and output files
                Scanner input = new Scanner(sourceFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                System.out.println(s1);

                text.append(s1.replaceAll(args[1], args[2]) + "\n");
            }
        }

        try (PrintWriter printWriter = new PrintWriter(sourceFile)) {
            printWriter.print(text);
        }
    }
}
