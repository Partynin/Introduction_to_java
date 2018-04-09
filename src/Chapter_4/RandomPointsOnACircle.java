package Chapter_4;

/**
 * Created by Kos on 29.06.2017.
 */
public class RandomPointsOnACircle {
    public static void main(String[] args) {

        System.out.println("Three random point are ");
        double randomAngle1 = Math.random() * (2 * Math.PI);
        double x1 = 40 * Math.cos(randomAngle1);
        double y1 = 40 * Math.sin(randomAngle1);
        System.out.println("(" + x1+ " ' " + y1 + ")" );


        double randomAngle2 = Math.random() * (2 * Math.PI);
        double x2 = 40 * Math.cos(randomAngle2);
        double y2 = 40 * Math.sin(randomAngle2);
        System.out.println("(" + x2 + " ' " + y2 + ")" );

        double randomAngle3 = Math.random() * (2 * Math.PI);
        double x3 = 40 * Math.cos(randomAngle3);
        double y3 = 40 * Math.sin(randomAngle3);

        System.out.println("(" + x3 + " ' " + y3 + ")" );

        // Compute three sides
        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        // Compute three angles
        double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c)
                / (-2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c)
                / (-2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a)
                / (-2 * a * b)));

        // Display results
        System.out.println("The three angles are " +
                Math.round(angleA * 100) / 100.0 + " " +
                Math.round(angleB * 100) / 100.0 + " " +
                Math.round(angleC * 100) / 100.0);
    }
}
