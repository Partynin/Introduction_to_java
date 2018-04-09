package Chapter_6;

public class ConversionBetweenFeetAndMeters {
    /**
     * Main method
     */
    public static void main(String[] args) {
        System.out.println("Feet     Meters     |     Meters        Feet");
        System.out.println("_____________________________________________");
        double count = 20;
        for (int i = 1; i <= 10; i++) {
            double j = i;
            System.out.printf("%4.1f%10.3f     |%10.1f%15.3f\n", j, footToMeters(j), count, meterToFoot(count));
            count = count + 5;
        }
    }

    /**
     * Convert from feet to meters
     */
    public static double footToMeters(double foot) {
        double meters = 0.305 * foot;

        return meters;
    }

    /** Convert from meters to feet */
    public  static double meterToFoot(double meter) {
        double foot = 3.279 * meter;

        return foot;
    }
}