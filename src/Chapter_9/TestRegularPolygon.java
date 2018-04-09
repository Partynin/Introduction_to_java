package Chapter_9;

public class TestRegularPolygon {
    /** Main method */
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon1 perimeter = " + regularPolygon1.getPerimetr() + ", area " +
                "= " + regularPolygon1.getArea());
        System.out.println("Polygon2 perimeter = " + regularPolygon2.getPerimetr() + ", area " +
                "= " + regularPolygon2.getArea());
        System.out.println("Polygon3 perimeter = " + regularPolygon3.getPerimetr() + ", area " +
                "= " + regularPolygon3.getArea());
    }
}
