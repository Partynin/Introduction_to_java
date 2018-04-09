package Chapter_13;

import java.util.ArrayList;
import java.util.Date;

public class CheckPoint {
    public static void main(String[] args) {
//        At runtime, JVM attempts to convert numberRef to a Double object,
//        but numberRef is an instance of Integer, not Double.
//        Number numberRef = new Integer(0);
//        Double doubleRef = (Double)numberRef;

        Number x = 3;
        System.out.println(x.intValue());
        System.out.println(x.doubleValue());

//        The program has a syntax error because x does not have the compareTo method
//        Number x = new Integer(3);
//        System.out.println(x.intValue());
//        System.out.println(x.compareTo(new Integer(4)));

//        The program has a syntax error because the member access
//        operator (.) is executed before the casting operator
//        Number x = new Integer(3);
//        System.out.println(x.intValue());
//        System.out.println((Integer)x.compareTo(new Integer(4)));

        Date date = new Date();
        Date date1 = date;
        Date date2 = (Date)(date.clone());
        System.out.println(date == date1);
        System.out.println(date == date2);
        System.out.println(date.equals(date2));

        ArrayList<String> list = new ArrayList<>();
        list.add("New York");
        ArrayList<String> list1 = list;
        ArrayList<String> list2 = (ArrayList<String>)(list.clone());
        System.out.println(list == list1);
        System.out.println(list == list2);
        System.out.println("list is " + list);
        System.out.println("list1 is " + list1);
        System.out.println("list2.get(0) is " + list2.get(0));
        System.out.println("list2.size() is " + list2.size());
    }
}

