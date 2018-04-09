package Chapter_11;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        // Add some cities in the list
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size is " + cityList.size());
        System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        // Insert a new city at index 2
        cityList.add(2, "Xian");
        // Contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]

        cityList.remove("Miami");

        cityList.remove(1);

        System.out.println(cityList.toString());

        // Display the contents in the list in revers order
        for (int i = cityList.size() - 1; i >= 0; i--)
            System.out.print(cityList.get(i) + " ");
        System.out.println();

        ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();

        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));

        System.out.println("The area of the circle? " + list.get(0).getArea());
    }
}
