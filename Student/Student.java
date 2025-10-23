


package Student;
import java.util.ArrayList;

public class Student{
    private String name;
    private String grade;
    private ArrayList<String> courses;

    // Constructor
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " has been added to " + name + "'s courses.");
    }

    // Method to remove a course
    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(course + " has been removed from " + name + "'s courses.");
        } else {
            System.out.println(course + " is not found in " + name + "'s courses.");
        }
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses Enrolled: " + (courses.isEmpty() ? "None" : courses));
        System.out.println();
    }
}
    

