

class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    int employeeID;
    String jobTitle;

    public Employee(String firstName, String lastName, int employeeID, String jobTitle) {
        super(firstName, lastName);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getLastName() {
        return super.getLastName() + "(" + jobTitle + ")";
    }
}

public class Lab_24 {
    public static void main(String[] arg) {
        Employee employee = new Employee("Jayu", "Bagul", 1, "Doctor");
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeID());
    }
}