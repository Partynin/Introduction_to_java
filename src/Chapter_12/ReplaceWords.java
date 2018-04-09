package Chapter_12;

import java.io.File;

public class ReplaceWords {
    /** Main method */
    public static void main(String[] args) {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_27 *");
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
            String s = filesList[i].getName();
            System.out.println(s);
            if (s.equals("Exercise2_2.txt")) {
                filesList[i].renameTo(new File(filesList[i].getName() + ".java"));
            }
        }

    }
}
