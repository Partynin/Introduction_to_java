package Chapter_11;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public void dropStudent(String student) {
       students.remove(student);
       numberOfStudents--;
    }

    public String[] getStudents() {
        String[] arrayStudents = new String[students.size()];
        for (int i = 0; i < arrayStudents.length; i++) {
            arrayStudents[i] = students.get(i);
        }
        return arrayStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void clear() {
        students.clear();
        numberOfStudents = 0;
    }
}
