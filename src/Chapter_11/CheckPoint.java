package Chapter_11;

import java.util.ArrayList;

public class CheckPoint {
   /** public static void main(String[] args) {
        new Person1().printPerson();
        new Student1().printPerson();
    }
}

class Student1 extends Person1 {
    @Override
    public String getInfo() {
        return "Student";
    }
}

class Person1 {
    public String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
   public static void main(String[] args) {
       new Person2().printPerson();
       new Student2().printPerson();
   }
}

    class Student2 extends Person2 {
    private String getInfo() {
        return "Student";
    }
}

    class Person2 {
    private String getInfo() {
        return "Person";
    }

    public void printPerson() {
        System.out.println(getInfo());
    }
   public static void main(String[] args) {
       A a = new A(3);
   }
}

class A extends B {
    public A(int t) {

        System.out.println("A's constructor is invoked");
    }
}

class B {
    public B() {
        System.out.println("B's constructor is invoked");
    }
   public static void main(String[] args) {
       new A();
       new B();
   }
}

class A {
    int i = 7;

    public A() {
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class B extends A {
    public B() {
        System.out.println("i from B is " + i);
    }

    public void setI(int i) {
        this.i = 3 * i;
    }
   public static void main(String[] args) {
       Circle circle1 = new Circle();
       Circle circle2 = new Circle();
       System.out.println(circle1.equals(circle2));
   }
}

class Circle {
    double radius;

    @Override
    public boolean equals(Object circle) {
        return this.radius == ((Circle)circle).radius;
    } */
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.remove((Integer)1);
       System.out.println(list);
   }
}
