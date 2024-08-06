import java.util.Scanner;

// Abstract class Employee
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getEmployeeDetails() {
        return "ID: " + id + ", Name: " + name;
    }

    // Abstract method to calculate pay
    public abstract double calculatePay();
}

// Subclass for hourly employees
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}

// Subclass for salaried employees
class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12; // Monthly salary
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Annual Salary: " + annualSalary;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee type (hourly/salaried): ");
        String type = scanner.nextLine();

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter ID: ");
        int id = scanner.nextInt();

        Employee employee = null;

        if (type.equalsIgnoreCase("hourly")) {
            System.out.println("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            System.out.println("Enter hours worked: ");
            int hoursWorked = scanner.nextInt();

            employee = new HourlyEmployee(name, id, hourlyRate, hoursWorked);
        } else if (type.equalsIgnoreCase("salaried")) {
            System.out.println("Enter annual salary: ");
            double annualSalary = scanner.nextDouble();

            employee = new SalariedEmployee(name, id, annualSalary);
        }

        if (employee != null) {
            System.out.println("Employee Details: " + employee.getEmployeeDetails());
            System.out.println("Calculated Pay: " + employee.calculatePay());
        } else {
            System.out.println("Invalid employee type.");
        }

        scanner.close();
    }
}

