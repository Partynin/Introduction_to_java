package Chapter_4;

/**
 * Created by Kos on 25.06.2017.
 */
public class TestTestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadRunRun("1"));
        Thread t2 = new Thread(new ThreadRunRun("2"));
        Thread t3 = new Thread(new ThreadRunRun("3"));
        t1.start();
        Thread.sleep(50);
        t2.start();
        Thread.sleep(50);
        t3.start();
    }
}
