package Chapter_17;

import java.io.*;

public class UpdateCount_Ede17_8 {
    public static void main(String[] args) throws IOException {
        try (
                RandomAccessFile raf = new RandomAccessFile("Exercise17_08. dat", "rw")
                ) {
            int count = (raf.length() != 0) ? raf.readInt() + 1 : 1;
            raf.seek(0);
            raf.writeInt(count);
            System.out.println("The cont is = " + count);
        }
    }
}
