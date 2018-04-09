package Chapter_11;

import Chapter_10.MyDate;

public class Employee extends Person{
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee " + getName();
    }
}
