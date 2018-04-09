package Chapter_4;

/**
 * Created by Kos on 01.07.2017.
 */
public class Alphabet {
    private static char ch = 'A';
    public static void main(String[] args) {

        for(int i = 'A'; i <= 90; i++){
            System.out.print(" " + ch + " = " + i);
            ch++;
        }
    }
}
