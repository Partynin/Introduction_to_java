package Chapter_17;

import java.io.*;

public class TestObjectStreamForArray {
    public static void main(String[] arg) throws ClassNotFoundException, IOException {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Susan", "Kim"};

        try ( // Create an output stream for file array.dat
              ObjectOutputStream output = new ObjectOutputStream(
                      new BufferedOutputStream(new FileOutputStream("array.dat", true)))
                ) {
            // Write arrays to the object output stream
            output.writeObject(numbers);
            output.writeObject(strings);
        }

        try ( // Create ana input stream for file array.dat
              ObjectInputStream input = new ObjectInputStream(
                      new BufferedInputStream(new FileInputStream("array.dat")))
                ) {
            int[] newNumbers = (int[]) (input.readObject());
            String[] newString = (String[]) (input.readObject());

            // Display arrays
            for (int i = 0; i < newNumbers.length; i++)
                System.out.print(newNumbers[i] + " ");
            System.out.println();

            for (int i = 0; i < newString.length; i++)
                System.out.print(newString[i] + " ");
        }
    }
}
