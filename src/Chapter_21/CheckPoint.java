package Chapter_21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class CheckPoint {
    public static void main(String[] args) throws Exception {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("New York");
        LinkedHashSet<String> set2 = set1;
        LinkedHashSet<String> set3 = (LinkedHashSet<String>) (set1.clone());
        set1.add("Atlanta");
        System.out.println("set1 is " + set1);
        System.out.println("set2 is " + set2);
        System.out.println("set3 is " + set3);
        set1.forEach(e -> System.out.print(e + " "));

        Set<String> set = new LinkedHashSet<>();
        set.add("ABC");
        set.add("ABD");
        System.out.println(set);

        System.out.println();

        Set<String> set4 = new TreeSet<>(Comparator.comparing(String::length));
        set4.add("ABC");
        set4.add("ABD");
        System.out.println(set4);

        System.out.println();

        ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("d:\\test.dat"));
        LinkedHashSet<String> set5 = new LinkedHashSet<>();
        set5.add("New York");
        LinkedHashSet<String> set6 = (LinkedHashSet<String>)set5.clone();
        set5.add("Atlanta");
        output.writeObject(set5);
        output.writeObject(set6);
        output.close();

        ObjectInputStream input = new ObjectInputStream(
                new FileInputStream("d:\\test.dat"));
        set5 = (LinkedHashSet<String>)input.readObject();
        set6 = (LinkedHashSet<String>)input.readObject();
        System.out.println(set5);
        System.out.println(set6);
        input.close();

        System.out.println();

        int a = 'a';
        String as = "a";
        System.out.println(as.hashCode());

        Map<String, String> map = new LinkedHashMap<>();
        map.put("123", "John Smith");
        map.put("111", "George Smith");
        map.put("123", "Steve Yao");
        map.put("222", "Steve Yao");
        System.out.println("(1) " + map);
        System.out.println("(2) " + new TreeMap<String, String>(map));

        map.forEach((k, v) -> {
            if(k.equals("123")) System.out.println(v);
        });
    }
}
