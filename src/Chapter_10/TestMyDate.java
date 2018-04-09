package Chapter_10;

public class TestMyDate {
    /** Main method */
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133191L);

        System.out.println("date1 is " + date1.getYear()+ "/" + date1.getMonth() +
                "/" + date1.getDay());
        System.out.println("date2 is " + date2.getYear()+ "/" + date2.getMonth() +
                "/" + date2.getDay());
    }
}
