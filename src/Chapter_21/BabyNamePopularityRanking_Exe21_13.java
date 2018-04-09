package Chapter_21;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/** **21.13 (Baby name popularity ranking) Revise Programming Exercise 21.11 to prompt
 the user to enter year, gender, and name and display the ranking for the name.
 Prompt the user to enter another inquiry or exit the program. */

public class BabyNamePopularityRanking_Exe21_13 {
    private HashMap<String, String>[] boyNames =  new HashMap[10];
    private HashMap<String, String>[] girlNames = new HashMap[10];

    /** Main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BabyNamePopularityRanking_Exe21_13 babyNamePopularityRanking = new BabyNamePopularityRanking_Exe21_13();
        babyNamePopularityRanking.makeArrays();
        String yOrN = "Y";
        while (yOrN.equals("Y")) {
            babyNamePopularityRanking.getRank();
            System.out.println("Enter another inquiry(Y/N)? ");
            yOrN = scanner.nextLine();
        }

    }

    private void getRank() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year(2010): ");
        String year = input.nextLine();
        System.out.print("Enter the gender(M/F): ");
        String gender = input.nextLine();
        System.out.print("Enter the name(Javier): ");
        String name = input.nextLine();

        System.out.println( getGender(gender) + " name " + name + " is ranked #"
                + getRanking(name, gender, year) + " in year " + year);
    }

    private String getRanking(String name, String gender, String year) {
        String rank = "";
        if (gender.equals("M")) {
            rank = boyNames[Integer.parseInt(year) - 2001].get(name);
        } else {
            rank = girlNames[Integer.parseInt(year) - 2001].get(name);
        }
        return rank;
    }

    private String getGender(String gender) {
        return gender.equals("M") ? "Boy" : "Girl";
    }

    /** Fill arrays of map with specific gender */
    private void makeArrays() {
        for (int i = 0; i < boyNames.length; i++) {
            boyNames[i] = new HashMap<>();
            girlNames[i] = new HashMap<>();
        }

        for (int j = 2001; j < 2011; j++) {
            try {
                URL url = new URL(
                        "http://www.cs.armstrong.edu/liang/data/babynamesranking" +
                                j + ".txt");
                Scanner input = new Scanner(url.openStream());
                while (input.hasNext()) {
                    ArrayList<String> list = new ArrayList<>();
                    for (int i = 0; i < 5; i++) {
                        String data = input.next();
                        list.add(data);
                    }
                    boyNames[j - 2001].put(list.get(1), list.get(0));
                    girlNames[j - 2001].put(list.get(3), list.get(0));
                }
            } catch (MalformedURLException ex) {
                System.out.println("Invalid URL");
                ex.printStackTrace();
            } catch (IOException ex) {
                System.out.println("I/O Errors: no such file");
                ex.printStackTrace();
            }
        }
    }
}
