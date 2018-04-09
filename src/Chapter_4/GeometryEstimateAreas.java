package Chapter_4;

/**
 * Created by Kos on 29.06.2017.
 */
public class GeometryEstimateAreas {
    public static void main(String[] args) {
        double x1 = 33.7489954;
        double y1 = -84.3879824;

        double x2 = 28.5383355;
        double y2 = -81.37923649999999;

        double x3 = 32.0835407;
        double y3 = -81.09983419999998;

        double x4 = 35.2270869;
        double y4 = -80.84312669999997;

        double y12 = ((Math.sin(Math.toRadians(x1))) * (Math.sin(Math.toRadians(x2)))) +
                ((Math.cos(Math.toRadians(x1))) * (Math.cos(Math.toRadians(x2))) *
                        (Math.cos((Math.toRadians(y1)) - (Math.toRadians(y2)))));
        double d12 = 6371.01 * (Math.acos(y12));

        double y23 = ((Math.sin(Math.toRadians(x2))) * (Math.sin(Math.toRadians(x3)))) +
                ((Math.cos(Math.toRadians(x2))) * (Math.cos(Math.toRadians(x3))) *
                        (Math.cos((Math.toRadians(y2)) - (Math.toRadians(y3)))));
        double d23 = 6371.01 * (Math.acos(y23));

        double y34 = ((Math.sin(Math.toRadians(x3))) * (Math.sin(Math.toRadians(x4)))) +
                ((Math.cos(Math.toRadians(x3))) * (Math.cos(Math.toRadians(x4))) *
                        (Math.cos((Math.toRadians(y3)) - (Math.toRadians(y4)))));
        double d34 = 6371.01 * (Math.acos(y34));

        double y41 = ((Math.sin(Math.toRadians(x1))) * (Math.sin(Math.toRadians(x4)))) +
                ((Math.cos(Math.toRadians(x1))) * (Math.cos(Math.toRadians(x4))) *
                        (Math.cos((Math.toRadians(y1)) - (Math.toRadians(y4)))));
        double d41 = 6371.01 * (Math.acos(y41));

        double y13 = ((Math.sin(Math.toRadians(x1))) * (Math.sin(Math.toRadians(x3)))) +
                ((Math.cos(Math.toRadians(x1))) * (Math.cos(Math.toRadians(x3))) *
                        (Math.cos((Math.toRadians(y1)) - (Math.toRadians(y3)))));
        double d13 = 6371.01 * (Math.acos(y13));

        double s1 = (d13 + d34 + d41) / 2;
        double area1 = Math.sqrt(s1 * (s1 - d13) * (s1 - d23) * (s1 - d41));

        double s2 = (d13 + d23 + d12) / 2;
        double area2 = Math.sqrt(s2 * (s2 - d13) * (s2 - d23) * (s2 - d12));

        double area = area1 + area2;

        System.out.println("Estimate area = " +area);

    }
}
