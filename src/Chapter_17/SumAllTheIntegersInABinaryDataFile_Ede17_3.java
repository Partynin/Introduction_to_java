package Chapter_17;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class SumAllTheIntegersInABinaryDataFile_Ede17_3 {
    public static void main(String[] args) {
        try (
                DataInputStream input = new DataInputStream(
                        new FileInputStream("Exercise17_03.dat"))
                ) {
            long count = 0;
            int value;
            while ((value = input.read()) != -1)
                count += value;

            System.out.println("The sum of the integers = " + count);
        } catch (IOException ex) {
            System.out.println("Something is wrong!");
            ex.printStackTrace();
        }
    }
}
