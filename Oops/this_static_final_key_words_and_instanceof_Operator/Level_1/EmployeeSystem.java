class Employee {

    static String companyName = "TechSoft Solutions";
    static int totalEmployees = 0;

    private final int id;

    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;      
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {  
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("-------------------------");
        } else {
            System.out.println("Not a valid Employee object!");
        }
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Sachin Saini", "Software Engineer");
        Employee emp2 = new Employee(102, "Rahul Verma", "HR Manager");

        emp1.displayDetails();
        emp2.displayDetails();

        Employee.displayTotalEmployees();
    }
}
