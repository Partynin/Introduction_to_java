package Chapter_24;

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
    }
}
