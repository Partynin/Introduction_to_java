package Chapter_12;

public class CircleWithException {
    /** The radius of the circle */
 private double radius;

         /** The number of the objects created */
         private static int numberOfObjects = 0;

         /** Construct a circle with radius 1 */
         public CircleWithException() throws Exception {
         this(1.0);
         }

         /** Construct a circle with a specified radius */
         public CircleWithException(double newRadius) throws Exception {
         setRadius(newRadius);
         numberOfObjects++;
         }

         /** Return radius */
         public double getRadius() {
         return radius;
         }

         /** Set a new radius */
         public void setRadius(double newRadius) throws Exception {
         if (newRadius >= 0)
             radius = newRadius;
         else
         throw new Exception("Radius cannot be negative");
         }

         /** Return numberOfObjects */
         public static int getNumberOfObjects() {
         return numberOfObjects;
         }

         /** Return the area of this circle */
         public double findArea() {
         return radius * radius * 3.14159;
         }
}
