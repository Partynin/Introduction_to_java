package Chapter_13;

public class TestComparableCircle {
    /** Main method */
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(5);
        ComparableCircle comparableCircle2 = new ComparableCircle(5);

        System.out.println("comparableCircle1 is: " + comparableCircle1);
        System.out.println("comparableCircle2 is: " + comparableCircle2);

        System.out.println();

        if (comparableCircle1.compareTo(comparableCircle2) > 0)
            System.out.println("The comparableCircle1 larger.");
        else if (comparableCircle2.compareTo(comparableCircle1) > 0)
            System.out.println("The comparableCircle2 larger.");
        else System.out.println("The circles equal.");

        System.out.println();

        System.out.println("equals is: " + comparableCircle1.equals(comparableCircle2));
    }
}
