package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReformatJavaSourceCode {
    /** Main method */
    public static void main(String[] args) {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println("Usage: java ReformatJavaSourceCode Test.java");
            System.exit(1);
        }

        // Check if source file for change exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " dose not exist");
            System.exit(2);
        }

        String s1 = "";
        try (Scanner scanner = new Scanner(sourceFile)) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                if (s.endsWith(")")) {
                    s1 = s1 + s + " {\n";
                }
                else if (!s.startsWith("{"))
                    s1 = s1 + s + "\n";
            }
        }
        catch (Exception ex) {
            System.out.println("Exception !!!");
            System.exit(3);
        }

        try (PrintWriter printWriter = new PrintWriter(sourceFile)) {
            printWriter.print(s1);
        }
        catch (Exception ex) {
            System.out.println("Exception pw");
            System.exit(4);
        }
    }
}
