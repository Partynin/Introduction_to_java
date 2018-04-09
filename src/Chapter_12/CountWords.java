package Chapter_12;

import java.net.URL;
import java.util.Scanner;

public class CountWords {
    /**
     * Main method
     */
    public static void main(String[] args) {
        int count = 0;
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                String s = scanner.next();
                count++;
            }
        } catch (Exception ex) {
            System.out.println("URL crash!");
        }

        System.out.println("Counts the number of words in President" +
                "Abraham Lincoln’s Gettysburg \naddress" +
                " from http://cs.armstrong.edu/liang/data/Lincoln.txt");
        System.out.println("is " + count);
    }
}
