package Chapter_17;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class TestObjectInputStream {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try ( // Create an input stream for file object.dat
              ObjectInputStream input = new ObjectInputStream(
                      new BufferedInputStream(new FileInputStream("object.dat")))
        ) {
            // Read string, double value, and object from the file
            String name = input.readUTF();
            double score = input.readDouble();
            Date date = (Date) (input.readObject());
            System.out.println(name + " " + score + " " + date);
        }
    }
}
