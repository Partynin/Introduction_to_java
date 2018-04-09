package Chapter_18;

import java.io.File;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

/** *20.20 (Directory size) Rewrite Programming Exercise 18.28 using a stack instead of
 a queue. */

public class DirectoySize_Exe20_20 {
    /** Main method */
    public static void main(String[] args) {
        // Prompt the user to enter a directory or a file
        System.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

        // Display the size
        System.out.println(getSize(new File(directory)) + " bytes");
    }

    public static long getSize(File directory) {
        long size = 0;
        Stack<File> stack = new Stack<>();
        stack.push(directory);
        while (!stack.isEmpty()) {
            File t = stack.pop();
            if (t.isFile())
                size += t.length();
            else {
                File[] files = t.listFiles();  // All files and subdirectories
                for (int i = 0; files != null && i < files.length; i++)
                    stack.push(files[i]);
            }
        }
        return size;
    }
}
