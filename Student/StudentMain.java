package Student;

public class StudentMain {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Alice Johnson", "Grade 10");

        // Display initial info
        System.out.println("=== Initial Student Info ===");
        student1.displayInfo();

        // Add courses
        student1.addCourse("Mathematics");
        student1.addCourse("Science");
        student1.addCourse("English");

        // Display updated info
        System.out.println("\n=== Updated Student Info ===");
        student1.displayInfo();

        // Remove a course
        student1.removeCourse("Science");

        // Display final info
        System.out.println("\n=== Final Student Info ===");
        student1.displayInfo();
    }
}

