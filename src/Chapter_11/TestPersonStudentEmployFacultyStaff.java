package Chapter_11;

public class TestPersonStudentEmployFacultyStaff {
    private Person person;
    private Student student;
    private Employee employee;
    private Faculty faculty;
    private Staff staff;

    public static void main(String[] args) {
        TestPersonStudentEmployFacultyStaff o = new TestPersonStudentEmployFacultyStaff();
        o.test();
    }

    public void test() {
        person = new Person();
        student = new Student();
        employee = new Employee();
        faculty = new Faculty();
        staff = new Staff();

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
