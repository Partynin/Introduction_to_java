package Chapter_24;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class CheckPoint {
    public static void main(String[] args) {
        MyArrayList<Double> list = new MyArrayList<>();
        list.add(1.5);
        System.out.println(list.size());
        list.trimToSize();
        System.out.println(list.size());
        list.add(3.4);
        System.out.println(list.size());
        list.add(7.4);
        System.out.println(list.size());
        list.add(17.8);
        System.out.println(list.size());
        System.out.println();

        LinkedList<String> list1 = new LinkedList<>();
        list1.add(0,"first");
        list1.add("second");
        list1.add(2, "forth");

        System.out.println(list1);
        System.out.println();

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("first");
        list3.add(1,"el");
        list3.set(1,"second");
        System.out.println(list3);

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(0, "zero");
        map.put(1, "first");
        map.put(2, "second");
        System.out.println(map);
    }
}
