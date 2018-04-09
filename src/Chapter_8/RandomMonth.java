package Chapter_8;

public class RandomMonth {
    /** Main method */
    public static void main(String[] args) {
        String[] array = {"January", "February", "March", "April", "May",
        "June", "July", "August", "September", "October", "November",
        "December"};
        int intRandom = 1 + (int)(Math.random() * 12);
        System.out.println(array[intRandom - 1]);
    }
}
