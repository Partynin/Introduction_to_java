package Chapter_5;

/**
 * Created by Kos on 15.07.2017.
 */
public class HeadsOrTails {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        for (int i = 1; i <= 1000000; i++) {
            if ((int) (Math.random() * 2) == 0)
                head++;
            else tail++;
        }
        System.out.printf("Heads = %d, tails = %d", head, tail);
    }
}
