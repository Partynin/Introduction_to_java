package Chapter_11;

public class Staff extends Employee {
    private String title;

    @Override
    public String toString() {
        return "Staff " + getName();
    }
}
