package comPack.assingPack;
// Employee Base class
class Employee {
    long employeeId,employeePhone;
    String employeeName,employeeAddress;
    double basicSalary,specialAllowance = 250.80,hra = 1000.50;

    public Employee(long id, String name, String address, Long phone) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
    }
    // Method to calculate salary
    public void calculateSalary() {
        double salary = this.basicSalary + (this.basicSalary * this.specialAllowance / 100) + (this.basicSalary * this.hra / 100);
        System.out.println("Salary: " + salary);
    }
}

// Manager Sub class
class Manager extends Employee {
    public Manager(long id, String name, String address, Long phone, double salary) {
        super(id, name, address, phone);
        this.basicSalary = salary;
    }
}

// Manager Sub class
class Trainee extends Employee {
    public Trainee(long id, String name, String address, Long phone, double salary) {
        super(id, name, address, phone);
        this.basicSalary = salary;
    }
}

// Main class
public class InheritanceActivity {
    public static void main(String[] args) {
        // Test case #1
        Manager ManagerObj = new Manager(126534, "Alpha", "Solapur India", 237844L, 75000);
        ManagerObj.calculateSalary();

        // Test case #2
        Trainee TraineeObj = new Trainee(29846, "Jack", "Mumbai India", 442085L, 45000);
        TraineeObj.calculateSalary();
    }
}