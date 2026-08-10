// Interface
interface Printable {
    void printDetails();
}

// Student class
class Student implements Printable {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

// Employee class
class Employee implements Printable {
    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

// Main class
public class PrintableDemo {
    public static void main(String[] args) {

        Student student = new Student("Anusha", 279);
        Employee employee = new Employee("Twinkle", 205 );

        student.printDetails();

        System.out.println();

        employee.printDetails();
    }
}