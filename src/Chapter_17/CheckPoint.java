package Chapter_17;

import java.io.*;

public class CheckPoint {
    public static void main(String[] args) throws IOException {
        try (PrintWriter output = new PrintWriter("t.txt")) {
            output.printf("%s", "1234");
            output.printf("%s", "5678");
            output.close();
        }

        try (FileInputStream input = new FileInputStream("t.txt")) {
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        }

        System.out.println();

        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("t.dat"))) {
            output.writeInt(1234);
            output.writeInt(5678);
            output.close();
        }

        try (FileInputStream input = new FileInputStream("t.dat")) {
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        }

        try (
                RandomAccessFile inout = new RandomAccessFile("address.dat", "rw");
                DataOutputStream output = new DataOutputStream(
                        new FileOutputStream("address.dat"))
                ) {

        }
    }
}
