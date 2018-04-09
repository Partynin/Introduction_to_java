package Chapter_11;

public class A {
    protected void m() {
    }
}

class B extends A {
}

class Main {
    public void p() {
        B b = new B();
        b.m();
    }
}
