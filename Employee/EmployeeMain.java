package Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        // Create Employee object
        Employee emp1 = new Employee("Alice Johnson", "Software Engineer", 5000.0);
        Employee emp2 = new Employee("Bob Smith", "Project Manager", 7000.0);

        System.out.println("=== Original Employee Information ===");
        emp1.displayInfo();
        emp2.displayInfo();

        // Update salary
        emp1.updateSalary(5500.0);
        emp2.updateSalary(7500.0);

        System.out.println("=== Updated Employee Information ===");
        emp1.displayInfo();
        emp2.displayInfo();
    }
}

