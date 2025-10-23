
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
package Employees;

private String name;
private double salary;
private LocalDate hireDate;

    // Constructor
    public Employees(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Method to calculate years of service
    public int getYearsOfService() {
        LocalDate today = LocalDate.now();
        Period period = Period.between(hireDate, today);
        return period.getYears();
    }

    // Display method
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: ₱" + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService() + " years");
        System.out.println();
    }

    

