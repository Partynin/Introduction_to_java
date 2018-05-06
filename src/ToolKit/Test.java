package ToolKit;

public class Test implements Runnable {
    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("test");
    }
}
