package Employees;

public class EmployeesMain {
    public static void main(String[] args) {
        // Create Employee objects with name, salary, and hire date
         Employee emp1 = new Employee("Alice Johnson", 50000, LocalDate.of(2015, 3, 12));
        Employee emp2 = new Employee("Bob Smith", 65000, LocalDate.of(2020, 8, 25));

        System.out.println("=== Employee Information ===");
        emp1.displayInfo();
        emp2.displayInfo();
    }
}
