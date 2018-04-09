package Chapter_12;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFileClass {
    public static void main(String[] args) throws IOException {
        File file3 = new File("C:\\Users\\Константин\\Desktop\\image");
        file3.mkdir();
        File file = new File("C:\\Users\\Константин\\Desktop\\image/us.gif");
        File file1 = new File("C:\\Users\\Константин\\Desktop\\image", "txt.txt");
        file1.createNewFile();
        file.createNewFile();
        System.out.println("txt is exist? " + file1.exists());
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new Date(file.lastModified()));
    }
}
