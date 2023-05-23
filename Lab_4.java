// 2.2) How to Check if the String Contains 'e' in umbrella

package String;
import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = sc.nextLine();
        
        if(inputString.contains("e")) {
            System.out.println("The string contains 'e'.");
        } else {
            System.out.println("The string does not contains 'e'.");
        }

        sc.close();
    }
}
