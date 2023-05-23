/* 8. You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person. Use HashMap to implement it.The first line will have an integer denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros.For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. */

package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab_11 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Rahul", "1234567890");
        phoneBook.put("Swapnil", "8308289810");
        phoneBook.put("Ruhi", "9874563210");

        // System.out.println("Enter number of entries: ");
        // int entries = sc.nextInt();
        // sc.nextLine();

        // for (int i = 0; i < entries; i++) {
        // System.out.println("Enter name(key): ");
        // String name = sc.nextLine();
        // System.out.println("Enter phone number: ");
        // String phoneNumber = sc.nextLine();
        // phoneBook.put(name, phoneNumber);
        // }

        System.out.println("\nEnter query(key): ");
        while (sc.hasNextLine()) {
            String query = sc.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + " = " + phoneBook.get(query));
            } else {
                System.out.println("Not Found!");
            }
            System.out.println("\nEnter query(key): ");
        }

        sc.close();
    }
}
