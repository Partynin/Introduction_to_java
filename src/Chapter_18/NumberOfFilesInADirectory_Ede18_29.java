package Chapter_18;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberOfFilesInADirectory_Ede18_29 {
    public static void main(String[] args) {
        // Prompt the user to enter a directory or a file
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        // Display the size
        System.out.println(getSize(new File(directory)) + " files");
    }

    public static long getSize(File file) {
        long size = 0; // Store the total size of all files
        ArrayList<File> listFiles = new ArrayList<>();
        listFiles.add(file);

        for (int i = 0; i < listFiles.size(); i++) {
            if (listFiles.get(i).isFile())
                size++;
            else if (listFiles.get(i) != null && listFiles.get(i).length() != 0)
                Collections.addAll(listFiles, listFiles.get(i).listFiles());
        }

        return size;
    }
}
