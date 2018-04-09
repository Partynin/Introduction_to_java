package Chapter_9;

public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChanel(30);
        tv1.setVolumeLevel(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.chanelUp();
        tv2.chanelUp();
        tv2.volumeUp();

        System.out.println("tv1's chanel is " + tv1.chanel
        + " and volume is " + tv1.volumeLevel);
        System.out.println("tv2's chanel is " + tv2.chanel
                + " and volume is " + tv2.volumeLevel);
    }
}
