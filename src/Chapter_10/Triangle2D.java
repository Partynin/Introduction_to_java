package Chapter_10;

public class Triangle2D {
//    private MyPoint p1;
//    private MyPoint p2;
//    private MyPoint p3;
//
//    public Triangle2D() {
//        this(new MyPoint(0, 0), new MyPoint(1,1), new MyPoint(2, 5));
//    }
//
//    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
//        this.p1 = p1;
//        this.p2 = p2;
//        this.p3 = p3;
//    }
//
//    public MyPoint getP1() {
//        return p1;
//    }
//
//    public void setP1(MyPoint p1) {
//        this.p1 = p1;
//    }
//
//    public MyPoint getP2() {
//        return p2;
//    }
//
//    public void setP2(MyPoint p2) {
//        this.p2 = p2;
//    }
//
//    public MyPoint getP3() {
//        return p3;
//    }
//
//    public void setP3(MyPoint p3) {
//        this.p3 = p3;
//    }
//
//    public double getArea() {
//        double side1 = Math.pow((Math.pow((p2.getX() - p1.getX()),2)) + (Math.pow((p2.getY() - p1.getY()),2)),0.5);
//        double side2 = Math.pow((Math.pow((p3.getX() - p2.getX()),2)) + (Math.pow((p3.getY() - p2.getY()),2)),0.5);
//        double side3 = Math.pow((Math.pow((p3.getX() - p1.getX()),2)) + (Math.pow((p3.getY() - p1.getY()),2)),0.5);
//
//        double S = (side1 + side2 + side3) / 2;
//
//        double area = Math.pow((S * ((S - side1) * (S - side2) * (S -side3))),0.5);
//
//        return area;
//    }
//
//    public double getPerimeter() {
//        double side1 = Math.pow((Math.pow((p2.getX() - p1.getX()),2)) + (Math.pow((p2.getY() - p1.getY()),2)),0.5);
//        double side2 = Math.pow((Math.pow((p3.getX() - p2.getX()),2)) + (Math.pow((p3.getY() - p2.getY()),2)),0.5);
//        double side3 = Math.pow((Math.pow((p3.getX() - p1.getX()),2)) + (Math.pow((p3.getY() - p1.getY()),2)),0.5);
//
//        return side1 + side2 + side3;
//    }
//
//    /** Математическая часть - векторное и псевдоскалярное произведение.
//     Реализация - считаются произведения (1,2,3 - вершины треугольника, 0 - точка):
//     (x1-x0)*(y2-y1)-(x2-x1)*(y1-y0)
//     (x2-x0)*(y3-y2)-(x3-x2)*(y2-y0)
//     (x3-x0)*(y1-y3)-(x1-x3)*(y3-y0)
//     Если они одинакового знака, то точка внутри треугольника,
//     если что-то из этого - ноль, то точка лежит на стороне, иначе точка вне треугольника. */
//    public boolean contains(MyPoint p) {
//        double a = (p1.getX() - p.getX()) * (p2.getY() - p1.getY()) - (p2.getX() - p1.getX()) * (p1.getY() - p.getY());
//        double b = (p2.getX() - p.getX()) * (p3.getY() - p2.getY()) - (p3.getX() - p2.getX()) * (p2.getY() - p.getY());
//        double c = (p3.getX() - p.getX()) * (p1.getY() - p3.getY()) - (p1.getX() - p3.getX()) * (p3.getY() - p.getY());
//
//        if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0))
//            return true;
//        else
//            return false;
//    }
//
//    public boolean contains(double x, double y) {
//        double a = (p1.getX() - x) * (p2.getY() - p1.getY()) - (p2.getX() - p1.getX()) * (p1.getY() - y);
//        double b = (p2.getX() - x) * (p3.getY() - p2.getY()) - (p3.getX() - p2.getX()) * (p2.getY() - y);
//        double c = (p3.getX() - x) * (p1.getY() - p3.getY()) - (p1.getX() - p3.getX()) * (p3.getY() - y);
//
//        if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0))
//            return true;
//        else
//            return false;
//    }
//
//    public boolean contains(Triangle2D t) {
//        if (contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3()))
//            return true;
//        else return false;
//    }
//
//    /** х1, у1 и х2,у2 - координаты вершин первого отрезка;
//     х3, у3 и х4,у4 - координаты вершин второго отрезка;
//
//     для нахождения пересечения составляем уравнения прямых:
//     первое уравнение:
//     (x-x1)/(x2-x1)=(y-y1)/(y2-y1);
//     второе уравнение
//     (x-x3)/(x4-x3)=(y-y3)/(y4-y3);
//     эти уравнения определяют прямую проходящую через две точки, то, что нам и надо.
//     Из этих уравнений находим х и у по следующим формулам:
//     x:=((x1*y2-x2*y1)*(x4-x3)-(x3*y4-x4*y3)*(x2-x1))/((y1-y2)*(x4-x3)-(y3-y4)*(x2-x1));
//     y:=((y3-y4)*x-(x3*y4-x4*y3))/(x4-x3);
//     так как наши прямые пересекаются, то у них есть общая точка пересечения с координатами (х,у), которую нам и надо найти.
//     для того, чтоб пересечение принадлежало нашим отрезкам, нужно его ограничить, т. е проверить условие:
//     если
//     (((x1<=x)and(x2>=x)and(x3<=x)and(x4 >=x))or((y1<=y)and(y2>=y)and(y3<=y) and(y4>=y)))
//     то существует точка пересечения данных отрезков, а нет – то нет и точки пересечения. */
//    public boolean overlaps(Triangle2D t) {
//        if (isLineIntersection(p1, p2, t.getP1(), t.getP2()))
//            return true;
//        else if (isLineIntersection(p2, p3, t.getP1(), t.getP2()))
//            return true;
//        else if (isLineIntersection(p3, p1, t.getP1(), t.getP2()))
//            return true;
//        else if (isLineIntersection(p1, p2, t.getP2(), t.getP3()))
//            return true;
//        else if (isLineIntersection(p2, p3, t.getP2(), t.getP3()))
//            return true;
//        else if (isLineIntersection(p2, p3, t.getP2(), t.getP3()))
//            return true;
//        else if (isLineIntersection(p1, p2, t.getP3(), t.getP1()))
//            return true;
//        else if (isLineIntersection(p1, p2, t.getP3(), t.getP1()))
//            return true;
//        else if (isLineIntersection(p1, p2, t.getP3(), t.getP1()))
//            return true;
//        else return false;
//    }
//
//    /** существует ли точка пересечения данных отрезков */
//    public boolean isLineIntersection(MyPoint p1,MyPoint p2,MyPoint p3,MyPoint p4) {
//        double x1 = p1.getX();
//        double y1 = p1.getY();
//        double x2 = p2.getX();
//        double y2 = p2.getY();
//        double x3 = p3.getX();
//        double y3 = p3.getY();
//        double x4 = p4.getX();
//        double y4 = p4.getY();
//
//        double a = y1 - y2;
//        double b = x1 - x2;
//        double c = y3 - y4;
//        double d = x3 - x4;
//
//        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
//        double f = (y3 - y4) * x3 - (x3 - x4) * y3;
//
//        if (a * d - b * c == 0){
//            // The two lines are parallel
//            return false;
//        }
//        else {
//            // The point intersection
//            double x = (e * d - b * f) / (a * d - b * c);
//            double y = (a * f - e * c) / (a * d - b * c);
//            if (((x1 <= x) && (x2 >= x) && (x3 <= x) && (x4 >= x)) ||
//                    ((y1 <= y) && (y2 >= y) && (y3 <= y) && (y4 >= y)))
//                return true;
//            else return false;
//        }
//    }
}
