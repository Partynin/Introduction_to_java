package Chapter_17;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateABinaryDataFile_Exe17_2 {
    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream output = new DataOutputStream(
                        new FileOutputStream("Exercise17_02.dat", true))
                ) {
            for (int i = 0; i < 100; i++) {
                output.writeInt((int) (Math.random() * 100));
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
            fnf.printStackTrace();
        }
    }
}
