// 3.1)Java Program to Reverse a String. 

package String;

import java.util.Scanner;

public class Lab_5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = sc.nextLine();

        // String reversedStr = reversedString(inputString);
        // System.out.println(reversedStr);

        for (int i = inputString.length() - 1; i >= 0; i--) {
            System.out.print(inputString.charAt(i));
        }

        sc.close();
    }

    // public static String reversedString(String str) {
    // StringBuilder reversed = new StringBuilder();
    // for (int i = str.length() - 1; i >= 0; i--) {
    // reversed.append(str.charAt(i));
    // }
    // return reversed.toString();
    // }
}