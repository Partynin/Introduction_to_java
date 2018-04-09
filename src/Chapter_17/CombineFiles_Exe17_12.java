package Chapter_17;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CombineFiles_Exe17_12 {
    public static void main(String[] args) {
        // Check if source file exists
        File[] filesSource = new File[args.length - 1];
        for (int i = 0; i < filesSource.length; i++) {
            filesSource[i] = new File(args[i]);
            if (!filesSource[i].exists()) {
                System.out.println("Source file " + args[i] + " does not exist");
                System.exit(1);
            }
        }

        File targetFile = new File(args[args.length - 1]);

        try (
                RandomAccessFile rafTarget = new RandomAccessFile(targetFile, "rw")
                ) {
            long pos = 0;
            byte[] b;
            for (int i = 0; i < filesSource.length; i++) {
                RandomAccessFile file = new RandomAccessFile(filesSource[i], "r");
                b = new byte[(int) file.length()];
                file.read(b);
                rafTarget.seek(pos);
                rafTarget.write(b);
                pos += file.length();
            }
        } catch (IOException ex) {
            System.out.println("We have a problem!");
            ex.printStackTrace();
        }
    }
}
