package Chapter_20;

import java.io.File;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/** *20.18 (Directory size) Listing 20.7, DirectorySize.java, gives a recursive method for
 finding a directory size. Rewrite this method without using recursion. Your program should use a queue to store the subdirectories under a directory. The
 algorithm can be described as follows:
 long getSize(File directory) {
 long size = 0;
 add directory to the queue;
 while (queue is not empty) {
 Remove an item from the queue into t;
 if (t is a file)
 size += t.length();
 else
 add all the files and subdirectories under t into the
 queue;
 }
 return size;
 }*/

public class DirectorySize_Exe20_18 {
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
        Queue<File> queue = new PriorityQueue<>();
        queue.offer(directory);
        while (!queue.isEmpty()) {
            File t = queue.poll();
            if (t.isFile())
                size += t.length();
            else {
                File[] files = t.listFiles();  // All files and subdirectories
                for (int i = 0; files != null && i < files.length; i++)
                    queue.offer(files[i]);
            }
        }
        return size;
    }
}
