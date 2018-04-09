package Chapter_4;

import java.util.Random;

/**
 * Created by Kos on 25.06.2017.
 */
public class ThreadRunRun implements Runnable {
    String name;
    int time;
    Random r = new Random();

    public ThreadRunRun(String name){
        this.name = name;
        time = r.nextInt(100999);
    }

    @Override
    public void run() {
        System.out.printf("Поток %s проснулся и живет %d.\n", name, time);
        try {
            Thread.sleep(time);
        }catch (Exception e){}
        System.out.printf("Поток %s отжил своё.\n", name);
    }
}
