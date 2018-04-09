package Chapter_10;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[3];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] studentsTemp = new String[students.length + students.length / 2];
            for (int i = 0; i < students.length; i++) {
                studentsTemp[i] = students[i];
            }
            students = studentsTemp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student)
                for (int j = i; j < students.length - 1; j++)
                    students[j] = students[j + 1];
        }
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void clear() {
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Course clone = (Course) super.clone();

        String[] studentsClone = new String[students.length];
        for (int i = 0; i < studentsClone.length; i++) {
            studentsClone[i] = students[i];
        }

        clone.students = studentsClone;

        return clone;
    }
}
