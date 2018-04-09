package Chapter_13;


public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " and this circle comparable " + "area is " + getArea();
    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Circle)
           return getRadius() == ((Circle)obj).getRadius();
       else return this == obj;
    }
}
