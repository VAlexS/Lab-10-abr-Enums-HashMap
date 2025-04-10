import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;

    private int grade;

    public Student(String name, int grade) throws IllegalArgumentException {
        setName(name);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) throws IllegalArgumentException {
        if (grade < 0 || grade > 100)
            throw new IllegalArgumentException("La calificación ha de estar comprendida entre 0 y 100");
        this.grade = grade;
    }



    public void increaseGrades(Map<String, Student> students){

        int newGrade;

        for (Student student : students.values()){
            newGrade = (int) Math.ceil(student.getGrade() * 0.10);
            student.setGrade(newGrade);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
