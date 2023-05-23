// 11.2) Write a Java program to check whether a given number is prime or not.

import java.util.Scanner;

public class Lab_13 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        boolean isPrime = isPrime(num);

        if(isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                return false;
            }
        }

        return true;
    }
}
