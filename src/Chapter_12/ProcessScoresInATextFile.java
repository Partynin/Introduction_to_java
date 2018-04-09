package Chapter_12;

import java.io.File;
import java.util.Scanner;

public class ProcessScoresInATextFile {
    /** Main method */
    public static void main(String[] args) {
        File file = new File("Test2.txt");

        int count = 0;
        int countScore = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                count += scanner.nextInt();
                countScore++;
            }
        }
        catch (Exception es) {
            System.out.println("Scanner break1");
            System.exit(11);
        }

        System.out.println("Total score is " + count);
        System.out.println("Average score is " + count / (countScore + 0.0));
    }
}
