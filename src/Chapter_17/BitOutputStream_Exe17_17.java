package Chapter_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitOutputStream_Exe17_17 {
    public static void main(String[] args) {
        try (
        BitOutputStream bos = new BitOutputStream(new File("Exercise17_17.dat"))
        ) {
            bos.writeBit("0100000100100001001101");
        } catch (IOException ex) {
            System.out.println("We have a problem!");
            ex.printStackTrace();
        }
    }
}

class BitOutputStream implements AutoCloseable{
    private int myByte;
    private int positionInByte;
    private FileOutputStream fos;

    public BitOutputStream(File file) throws FileNotFoundException {
        fos = new FileOutputStream(file);
    }

    public void writeBit(char bit) throws IOException {
        myByte = myByte << 1;

        if (bit == '1')
            myByte = myByte | 1;

        positionInByte++;

        if(positionInByte == 8) {
            fos.write(myByte);
            positionInByte = 0;
        }
    }

    public void writeBit(String bit) throws IOException {
        for (int i = 0; i < bit.length(); i++) {
            writeBit(bit.charAt(i));
        }
    }

    public void close() throws IOException {
        if (positionInByte > 0) {
           myByte = myByte << 8 - positionInByte;
           fos.write(myByte);
        }
        fos.close();
    }
}
