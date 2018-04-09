package Chapter_12;

import java.net.URL;
import java.util.Scanner;

public class ProcessScoresInATextFileOnTheWeb {
    /** Main method */
    public static void main(String[] args) {
        int scoresTotal = 0;
        int numberScores = 0;
       try {
           URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
           Scanner scanner = new Scanner(url.openStream());
           while (scanner.hasNext()) {
               scoresTotal += scanner.nextInt();
               numberScores++;
           }
       }
       catch (Exception ex) {
           System.out.println("url don't work!");
           ex.printStackTrace();
       }

        System.out.println("Total scores = " + scoresTotal);
        System.out.println("Average scores = " + scoresTotal / numberScores);
    }
}
