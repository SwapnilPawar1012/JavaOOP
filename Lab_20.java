/* 18. Write a program to implement the following inheritance. Accept data for 5 persons and display the name of an employee having a salary greater than 5000.

Class Name: Person
Member variables:
Name, age

Class Name: Employee
Member variables:
Designation, Salary
*/

package OOPs;

import java.util.Scanner;

class Person {
    String name;
    int age;
}

class Employee extends Person {
    String designation;
    double salary;
}

public class Lab_20 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Employee[] employees = new Employee[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter details of person " + (i + 1) + ": ");
            Employee employee = new Employee();

            System.out.println("Enter name: ");
            employee.name = sc.nextLine();

            System.out.println("Enter age: ");
            employee.age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter designation: ");
            employee.designation = sc.nextLine();

            System.out.println("Enter salary: ");
            employee.salary = sc.nextDouble();
            sc.nextLine();

            employees[i] = employee;
        }

        boolean found = false;
        for (Employee employee : employees) {
            if (employee.salary > 5000) {
                System.out.println("Employee with salary greater than 5000: " + employee.name);
                found = true;
                // break;
            }
        }

        if (!found) {
            System.out.println("No employee with salary greater than 5000 found.");
        }

        sc.close();
    }
}
