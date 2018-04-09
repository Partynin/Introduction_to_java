package Chapter_13;

public class TestOctagon {
    /** Main method */
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon1 = new Octagon(5);

        System.out.println("Area the octagon is " + octagon1.getArea());
        System.out.println("Perimeter is " + octagon1.getPerimeter());

        Octagon cloneOctagon1 = (Octagon) octagon1.clone();

        System.out.println("Compare two octagon. Octagon1 is large then clone: " +
        octagon1.compareTo(cloneOctagon1));
    }
}
