// 4. A Company manufactures Vehicles, which could be a Helicopter, a Car, or a Train depending on the customer’s demand. Each Vehicle instance has a method called move, which prints on the console the nature of movement of the vehicle. For example, the Helicopter Flies in Air, the Car Drives on Road and the Train Runs on Track. Write a program that accepts input from the user on the kind of vehicle the user wants to order, and the system should print out nature of movement. Implement all Java coding best practices to implement this program.

package OOPs;

import java.util.Scanner;

abstract class Vehicle {
    abstract void move();
}

class Helicopter extends Vehicle {
    void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car extends Vehicle {
    void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train extends Vehicle {
    void move() {
        System.out.println("The Train runs on the track.");
    }
}

public class Lab_7 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Helicopter \n2.Car \n3.Train");
        System.out.println("Choose the type of Vehicle: ");
        int choose = sc.nextInt();

        Vehicle vehicle=null;

        switch (choose) {
            case 1:
                vehicle = new Helicopter();
                break;

            case 2:
                vehicle = new Car();
                break;

            case 3:
                vehicle = new Train();
                break;

            case 0:
                break;

            default:
                System.out.println("Invalid choise!");
                sc.close();
                break;
        }

        vehicle.move();
        sc.close();
    }
}
