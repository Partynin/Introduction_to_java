package Chapter_27;

public class TestMyMap_Exe27_1 {
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap_Exe27_1<>();
        map.put("Smith", 33);
        map.put("Anderson", 23);
        map.put("Lewis", 33);
        map.put("Snow", 22);

        System.out.println("Entries in map: " + map);

        System.out.println("The age for " + "Lewis is " + map.get("Lewis"));

        System.out.println("Is Smith in the map? " + map.containsKey("Smith"));
        System.out.println("Is age 33 in the map? " + map.containsValue(33));

        map.remove("Smith");
        System.out.println("Entries in map: " + map);

        map.clear();
        System.out.println("Entries in map: " + map);
    }
}
