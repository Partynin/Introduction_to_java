package Chapter_13;

import java.math.BigInteger;
import java.util.ArrayList;

public class ShuffleArrayList {
    /** Main method */
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(3);
        list.add(3.33);
        list.add((short)5);
        list.add(new BigInteger("23454093795023985423543452345"));
        list.add(2385498716324782784L);

        System.out.println(list);
        shuffle(list);
        System.out.println(list);
    }

    /** Method that shuffles an ArrayList of numbers */
    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int randomNumber = (int)(Math.random() * list.size());
            Number temp = list.get(i);
            list.set(i, list.get(randomNumber));
            list.set(randomNumber, temp);
        }
    }
}
