package Chapter_6;

public class ConversionsBetweenCelsiusAndFahrenheit {
    /** Main method */
    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius");
        System.out.println("_______________________________________________________");
        double count = 0;
        for (int i = 40; i >= 31; i--) {
            double j = i;
        System.out.printf("%.1f%13.1f          |%10.1f%15.2f\n", j, celsiusToFahrenheit(j), 120 - count, fahrenheitToCelsius(120 - count));
        count = count + 10;
        }
    }

    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;

        return fahrenheit;
    }

    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        return celsius;
    }
}
