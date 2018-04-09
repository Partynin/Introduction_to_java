package Chapter_9;

public class TV {
    int chanel = 1; // Default chanel is 1
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // TV is off

    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void rurnOff() {
        on = false;
    }

    public void setChanel(int newChanel) {
        if (on && newChanel >= 1 && newChanel <= 120)
        chanel = newChanel;
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
        volumeLevel = newVolumeLevel;
    }

    public void chanelUp() {
        if (on && chanel < 120)
        chanel++;
    }

    public void chanelDown() {
        if (on && chanel > 1)
        chanel--;
    }

    public void volumeUp() {
        if (on && volumeLevel < 7)
        volumeLevel++;
    }

    public void volumeDown() {
        if (on && volumeLevel > 1)
        volumeLevel--;
    }
}
