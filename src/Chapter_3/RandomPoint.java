package Chapter_3;

/**
 * Created by Kos on 13.06.2017.
 */
public class RandomPoint {
    public static void main(String[] args) {
        int x =  50 - (int)(Math.random() * 100);
        int y = 100 - (int)(Math.random() * 200);
        System.out.println("Random coordinates is x = " + x + " and y = " + y);
    }
}
