package Chapter_8;

import java.util.Scanner;

public class GeometryPolygonSubareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }
        
        double[] point = getIntersectingPoint(points);
        double[][] triangle1 = {{points[0][0], points[0][1]}, {points[1][0], points[1][1]},
                {point[0], point[1]}};
        double[][] triangle2 = {{points[1][0], points[1][1]}, {points[2][0], points[2][1]},
                {point[0], point[1]}};
        double[][] triangle3 = {{points[2][0], points[2][1]}, {points[3][0], points[3][1]},
                {point[0], point[1]}};
        double[][] triangle4 = {{points[3][0], points[3][1]}, {points[0][0], points[0][1]},
                {point[0], point[1]}};
        
        double area1 = GeometryAreaOfATriangle.getTriangleArea(triangle1);
        double area2 = GeometryAreaOfATriangle.getTriangleArea(triangle2);
        double area3 = GeometryAreaOfATriangle.getTriangleArea(triangle3);
        double area4 = GeometryAreaOfATriangle.getTriangleArea(triangle4);

        System.out.println("The areas are " + area1 + " " + area2 + " " +
        area3 + " " + area4);
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] point = new double[2];

        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];
        double x4 = points[3][0];
        double y4 = points[3][1];

        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;

        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        if (a * d - b * c == 0){
            System.out.println("The two lines of divided polygon are parallel");
            System.exit(1);
        }
        else {
            point[0] = (e * d - b * f) / (a * d - b * c);
            point[1] = (a * f - e * c) / (a * d - b * c);
        }

        return point;
    }
}
