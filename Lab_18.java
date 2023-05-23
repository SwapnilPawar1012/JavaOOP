/* 16. Write a Java Program to count the number of words in a string using HashMap.Output:
Input :Enter String: "This this is is done by Saket Saket";
{Saket=2, by=1, this=1, This=1, is=2, done=1} */

package String;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Lab_18 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> wordCounts = new HashMap<>();

        System.out.println("Enter String: ");
        String inputString = sc.nextLine();

        String[] words = inputString.split(" ");

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCounts);

        sc.close();
    }
}
