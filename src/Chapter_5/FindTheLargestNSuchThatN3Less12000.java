package Chapter_5;

/**
 * Created by Kos on 10.07.2017.
 */
public class FindTheLargestNSuchThatN3Less12000 {
    public static void main(String[] args) {
        int n = 0;
        int x;
        do {
            n++;
            x = (int) Math.pow(n, 3);
        } while (x < 12000);
        System.out.println(n - 1);
    }
}
