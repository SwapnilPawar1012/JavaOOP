// 17. Write a program to read 1) string from the console and then print the sorted strings on the console (Use String Class). 2) combine two string   3) Reverse the first string and display it.

package String;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_19 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String inputString = sc.nextLine();

        String sortedString = sortString(inputString);
        System.out.println("Sorted String: " + sortedString);

        System.out.println("Enter second string: ");
        String secondString = sc.nextLine();
        String combineString = inputString + secondString;
        System.out.println("Combine string: " + combineString);

        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);

        sc.close();
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static String reverseString(String str) {
        StringBuffer reverse = new StringBuffer(str);
        return reverse.reverse().toString();
    }
}
