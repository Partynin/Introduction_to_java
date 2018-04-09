package Chapter_21;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** **21.12 (Name for both genders) Write a program that prompts the user to enter one of
 the filenames described in Programming Exercise 12.31 and displays the names
 that are used for both genders in the file. Use sets to store names and find common
 names in two sets. */

public class NameForBothGenders_Exe21_12 {
    private Set<String> boyNames = new HashSet<>();
    private Set<String> girlNames = new HashSet<>();

    /** Main method */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name for baby name ranking(babynamesranking2001.txt): ");
        String fileName = input.nextLine();

        NameForBothGenders_Exe21_12 nameForBothGenders = new NameForBothGenders_Exe21_12();
        nameForBothGenders.fillSets(fileName);
    }

    /** Fill sets and get values */
    public void fillSets(String fileName) {
        try {
            URL url = new URL("http://www.cs.armstrong.edu/liang/data/" + fileName);
            Scanner inputURL = new Scanner(url.openStream());
            while (inputURL.hasNext()) {
                ArrayList<String> listNames = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    String data = inputURL.next();
                    listNames.add(data);
                }
                boyNames.add(listNames.get(1));
                girlNames.add(listNames.get(3));
            }

            boyNames.retainAll(girlNames);
            System.out.println(boyNames);

            System.out.println(boyNames.size() + " names used for both genders");
            System.out.print("They are ");
            for (String s: boyNames) {
                System.out.print(s + " ");
            }
        } catch (MalformedURLException ex) {
            System.out.println("We have problem with url!");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("We hav I/O exception!");
            ex.printStackTrace();
        }
    }
}
