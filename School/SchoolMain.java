package School;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();
        
        school.addStudent("Brix");
        school.addStudent("Qurill");
        school.addTeacher("Maam : Hannah");
        school.addTeacher("Sir : Ebs");
        
        school.createClass("Math 101");
        school.createClass("Programming 201");
        
        System.out.println("Students: " + school.getStudents());
        System.out.println("Teachers: " + school.getTeachers());
        System.out.println("Classes: " + school.getClasses());
        
        school.removeStudent("Alice");
        school.removeTeacher("Mr. Smith");
        
        System.out.println("After removal - Students: " + school.getStudents());
        System.out.println("After removal - Teachers: " + school.getTeachers());
    }
}

