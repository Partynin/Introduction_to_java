package Chapter_17;

import java.io.*;
import java.util.Date;

public class StoreObjectsAndArraysInAFile_Exe17_5 {
    public static void main(String[] args) throws IOException {
        try (
                ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(
                        new FileOutputStream("Exercise17_05.dat")))
                ) {
            int[] array = {1, 2, 3 , 4, 5};
            Date date = new Date();
            double doubleValue = 5.5;
            output.writeObject(array);
            output.writeObject(date);
            output.writeDouble(doubleValue);
        }
    }
}
