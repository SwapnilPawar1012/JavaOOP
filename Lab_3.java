package String;

// 2. 1) Java Program to Count Number of Duplicate Words in String

import java.util.Scanner;

public class Lab_3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String inputString = sc.nextLine();
        String[] words = inputString.split("\\s+");

        int size = words.length;
        int count = 0;
        String[] duplicateWords = new String[size];
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (words[i].equals(words[j])) {
                    // count++;
                    duplicateWords[count++] = words[i];
                    break;
                }
            }
        }

        System.out.println("Count number of Duplicate words in String are: " + count);

        sc.close();
    }
}