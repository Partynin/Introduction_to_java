package Chapter_5;

/**
 * Created by Kos on 10.07.2017.
 */
public class FindNumbersDivisibleBy5Or6ButNotBoth {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 200; i++ ) {
            if (!(i % 5 == 0 && i % 6 == 0) && (i % 5 == 0 || i % 6 == 0)) {
                System.out.print(i + " ");
                count++;
            }
            if (count % 10 == 0 && count != 0) {
                System.out.println();
                count = 0;
            }
        }
    }
}
