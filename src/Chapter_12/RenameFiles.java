package Chapter_12;

import java.io.File;

public class RenameFiles {
    /** Main method */
    public static void main(String[] args) {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_28 *");
            System.exit(11);
        }

        // Check if the File object represents a directory.
        File sourceFiles = new File(args[0]);
        if (!sourceFiles.exists()) {
            System.out.println("Source file " + args[0] + " does not directory");
            System.exit(12);
        }


    }
}
