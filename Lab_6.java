// 3.2) Write a Java program to check that String is palindrome or not.

package String;
import java.util.Scanner;

public class Lab_6 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = sc.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }

        sc.close();
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length()-1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
