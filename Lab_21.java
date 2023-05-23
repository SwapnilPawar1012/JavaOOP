// 19. Implementing “Multiple Inheritance”. Create two interfaces Account containing methods set() and display() And interface Person containing methods store() and disp(). Derive a class Customer from Person and Account. Accept the name, account number, and bandlance and display all the information related to the account along with the interest. 

interface Account {
    void set(String name, int accountNumber, double balance);

    void display();
}

interface Person {
    void store(String name);

    void disp();
}

class Customer implements Account, Person {
    private String name;
    private int accountNumber;
    private double balance;

    public void set(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account details: ");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void store(String name) {
        this.name = name;
    }

    public void disp() {
        System.out.println("Customer details: ");
        System.out.println("Name: " + name);
    }

    public void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Interest: " + interest);
        System.out.println("Updated balance: " + balance);
    }

}

public class Lab_21 {
    public static void main(String[] arg) {
        Customer customer = new Customer();
        customer.store("Swapnil");
        customer.set("Swapnil", 123456789, 5000.0);
        customer.display();
        customer.disp();
        customer.calculateInterest(5.5);
    }
}