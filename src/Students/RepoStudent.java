package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RepoStudent {
    protected ArrayList<Student> students;

    public RepoStudent() {
        students = initialStudents();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public  void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    private ArrayList<Student> initialStudents() {
        students = new ArrayList<Student>(List.<Student>of
                (
                        new Student("Tomas", "A1", 2,
                                Map.ofEntries(
                                        Map.entry("Математика", 4.3),
                                        Map.entry("Физика", 4.9),
                                        Map.entry("Химия", 3.1)
                                )),
                        new Student("Alisa", "B3", 4,
                                Map.ofEntries(
                                        Map.entry("Математика", 2.4),
                                        Map.entry("Физика", 1.9),
                                        Map.entry("Химия", 3.1)
                                )),
                        new Student("Bob", "A1", 2,
                                Map.ofEntries(
                                        Map.entry("Математика", 2.0),
                                        Map.entry("Физика", 4.0),
                                        Map.entry("Химия", 3.0)
                                ))
                )
        );
        return students;
    }

    private double calculateAverage(Map<String, Double> grades) {
        return grades.values().stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
    public boolean removeStudentsByGPA(double gpa) {
        return students.removeIf(s -> calculateAverage(s.grades) < gpa
        );
    }

    public  int promoteStudentsByGPA(double gpa) {
        return (int)students.stream()
                .filter(s -> calculateAverage(s.grades) >=gpa)
                .peek( s -> s.courseNumber++)
                .count();
    }

    //для работы с действующим списком
    public void printStudents(int course) {
        students.stream()
                .filter(s -> s.courseNumber == course)
                .forEach(s -> System.out.println(s.name));
    }

    //для работы с внешним списком
    public void printStudents(Set<Student> students, int course){
        if (students == null || students.isEmpty()) {
            System.out.println("Список студентов пуст");
            return;
        }

        students.stream()
                .filter(s -> s.courseNumber == course)
                .forEach(s -> System.out.println(s.name));
    }
}
