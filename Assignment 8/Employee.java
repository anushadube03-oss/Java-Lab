class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int salary, String department) {
        super(name, salary); // Calls Employee constructor
        this.department = department;
    }

    void displayManagerDetails() {
        super.displayEmployeeDetails(); // Access Employee method
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Anusha", 50000, "IT");

        manager.displayManagerDetails();
    }
}
