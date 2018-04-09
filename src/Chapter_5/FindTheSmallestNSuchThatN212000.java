package Chapter_5;

/**
 * Created by Kos on 10.07.2017.
 */
public class FindTheSmallestNSuchThatN212000 {
    public static void main(String[] args) {
        int n = 0;
        int x = 2;
        while (12000 > x) {
            x = (int) Math.pow(n, 2);
            n++;
        }
        System.out.println(n - 1);
    }
}
