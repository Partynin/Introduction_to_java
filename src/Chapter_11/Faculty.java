package Chapter_11;

public class Faculty extends Employee {
    private double officeHours;
    private String rank;

    @Override
    public String toString() {
        return "Faculty " + getName();
    }
}
