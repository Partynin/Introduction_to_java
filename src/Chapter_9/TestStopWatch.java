package Chapter_9;

import Chapter_7.SelectionSort;

import java.util.Date;

public class TestStopWatch {
    /** Main method */
    public static void main(String[] args) {
        double[] array = new double[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        SelectionSort.selectionSSort(array);
        stopWatch.stop();


        System.out.println("Elapse time = " + (stopWatch.getElapsedTime() / 1000.0) + " sec");
    }
}
