package Students;

import java.util.Map;

public class Student {
    protected  String name;
    protected String groupName;
    protected int courseNumber;
    protected Map<String,Double> grades;

    public String  getName() {
        return name;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public Student(String name, String groupName, int courseNumber, Map<String,Double> grades) {
        this.name = name;
        this.groupName = groupName;
        this.courseNumber = courseNumber;
        this.grades = grades;
    }
}
