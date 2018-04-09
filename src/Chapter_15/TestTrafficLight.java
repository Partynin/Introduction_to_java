package Chapter_15;

public class TestTrafficLight {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.RED;
        System.out.println(light.getDescription());
    }
}

enum TrafficLight {
    RED("Please stop"), GREEN("Please go"), YELLOW("Please caution");

    private String description;

    private TrafficLight(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
