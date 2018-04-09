package Chapter_11;

public class Student extends Person{
    private String classStaus;
    public final String FRESHMAN = "Freshman";
    public final String SOPHOMORE = "Sophomore";
    public final String JUNIOR = "Junior";
    public final String SENIOR = "Senior";

    @Override
    public String toString() {
        return "Student " + getName();
    }
}
