package Chapter_23;

import java.io.*;

public class CreateLargeFile {
    public static void main(String[] args) throws Exception {
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("largedata.dat")));

        for (int i = 0; i < 800_008; i++)
            output.writeInt((int)(Math.random() * 1_000_000));

        output.close();

        // Display first 100 numbers
        DataInputStream input = new DataInputStream(new BufferedInputStream(
                new FileInputStream("largedata.dat")));
        for (int i = 0; i < 100; i++)
            System.out.print(input.readInt() + " ");

        input.close();
    }
}