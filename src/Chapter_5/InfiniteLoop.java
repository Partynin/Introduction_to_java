package Chapter_5;

/**
 * Created by Kos on 04.07.2017.
 */
public class InfiniteLoop {
    public static void main(String[] args) {
        double item = 1;
        double sum = 0;
        while (item !=  0) {
            sum += item;
            item -= 0.1;
        }
        System.out.println(sum);
    }
}
