package Chapter_9;

public class CheckPoint {
   /** public static void main(String[] args) {
        Count myCount = new Count();
        int times = 0;

        for (int i = 0; i < 100; i++)
            increment(myCount, times);

        System.out.println("countPosition is " + myCount.countPosition);
        System.out.println("times is " + times);
    }

    public static void increment(Count c, int times) {
        c.countPosition++;
        times++;
    }
}

class Count {
    public int countPosition;

    public Count(int c) {
        countPosition = c;
    }

    public Count() {
        countPosition = 1;
    }
}

   public static void main(String[] args) {
       Circle circle1 = new Circle(1);
       Circle circle2 = new Circle(2);

       swap1(circle1, circle2);
       System.out.println("After swap1: circle1 = " +
               circle1.radius + " circle2 = " + circle2.radius);

       swap2(circle1, circle2);
       System.out.println("After swap2: circle1 = " +
               circle1.radius + " circle2 = " + circle2.radius);
   }

   public static void swap1(Circle x, Circle y) {
       Circle temp = x;
       x = y;
       y = temp;
   }

   public static void swap2(Circle x, Circle y) {
       double temp = x.radius;
       x.radius = y.radius;
       y.radius = temp;
   }

}


class Circle {
        double radius;

        Circle(double newRadius) {
            radius = newRadius;
        }

   public static void main(String[] args) {
        int[] a = {1, 2};
        swap(a[0], a[1]);
        System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);
    }

    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

   public static void main(String[] args) {
       int[] a = {1, 2};
       swap(a);
       System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);
   }

    public static void swap(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }

   public static void main(String[] args) {
       T t = new T();
       swap(t);
       System.out.println("e1 = " + t.e1 + " e2 = " + t.e2);
   }

   public static void swap(T t) {
       int temp = t.e1;
       t.e1 = t.e2;
       t.e2 = temp;
   }

}

class T {
    int e1 = 1;
    int e2 = 2;

   public static void main(String[] args) {
       T t1 = new T();
       T t2 = new T();
       System.out.println("t1's i = " +
       t1.i + " and j = " + t1.j);
       System.out.println("t2's i = " +
       t2.i + " and j = " + t2.j);
   }

}

class T {
    static int i = 0;
    int j = 0;

    T() {
        i++;
        j = 1;
    } */

   public static void main(String[] args) {
       String s1 = "abf";
       String s2 = "abcadfgd";
       System.out.println(s2.substring(29));
       System.out.println(s1.compareTo(s2));
   }
}