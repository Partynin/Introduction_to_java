package Chapter_10;

import java.util.Arrays;

public class TestCourse2 {
    public static void main(String[] args) {
        Course course = new Course("Geometry");
        course.addStudent("Smith");
        course.addStudent("Doe");
        course.addStudent("Bush");
        course.addStudent("Bush");
        course.addStudent("Bush");
        course.dropStudent("Doe");

        System.out.println(Arrays.toString(course.getStudents()));
    }
}
