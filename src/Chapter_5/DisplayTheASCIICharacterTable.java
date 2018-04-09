package Chapter_5;

/**
 * Created by Kos on 10.07.2017.
 */
public class DisplayTheASCIICharacterTable {
    public static void main(String[] args) {
        int x = 33;
        int count = 0;
        while (x <= 126) {
            if (count % 10 == 0 && count != 0)
                System.out.println();
            System.out.print((char) x + " ");
            x++;
            count++;
        }
    }
}
