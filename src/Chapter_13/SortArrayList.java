package Chapter_13;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class SortArrayList {
    /** Main method */
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add((short)5);
        list.add(3);
        list.add(new BigInteger("23454093795023985423543452345"));
        list.add(2385498716324782784L);
        list.add(3.33);

        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    /** Method that sort an ArrayList of numbers */
    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (new BigDecimal(list.get(i) + "").compareTo(new BigDecimal(list.get(j) + "")) > 0) {
                    Number temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
