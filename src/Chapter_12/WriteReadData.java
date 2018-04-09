package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static Chapter_11.SortArrayList.sort;

public class WriteReadData {
   /** Main method */
   public static void main(String[] args) {
       File file = new File("Exercise12_15.txt");

       try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 0; i < 30; i++) {
                printWriter.print(((int)(Math.random() * Integer.MAX_VALUE)) + " ");
            }
       } catch (Exception ex) {
           System.out.println("PrintWriter do not work!");
       }

       ArrayList<Integer> array = new ArrayList<>();

       try (Scanner scanner = new Scanner(file)) {
           while (scanner.hasNext()) {
               array.add(scanner.nextInt());
           }
       } catch (Exception ex) {
           System.out.println("Scanner don't work!");
       }

       sort(array);
       System.out.println(array);
   }
}
