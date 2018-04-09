package Chapter_12;

import java.io.File;
import java.util.ArrayList;

public class Exercise12_29 {
    /** Main method */
    public static void main(String[] args) {
        // Check java command line usage
        if (args.length < 1) {
            System.out.println("Usage: java Exercise_12_28 *");
            System.exit(1);
        }

        // Create an ArrayList of File objects
        ArrayList<File> list = getFiles(args);
        System.out.println(list.toString());
        // Pad each file's name in list
        for (int i = 0; i < list.size(); i++) {
            padFileName(list.get(i));
        }
    }

    /** Pads a file's name with a 0 */
    public static void padFileName(File file) {
        StringBuilder newName = new StringBuilder(file.getName());
        newName.insert(10, '0');
        file.renameTo(new File(newName.toString()));
    }

    /** Add Files named Exercisei_j, where i and j are digits to a list */
    public static ArrayList<File> getFiles(String[] args) {
        ArrayList<File> list = new ArrayList<>();
        for (String e: args) {
            File f = new File(e);
            if (f.isFile() &&
                    f.getName().matches("Exercise\\d_\\d.*"))
                list.add(f);
        }
        return list;
    }
}
