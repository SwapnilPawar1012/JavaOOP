/* 23. Write a Java program to find the longest consecutive elements sequence length from an unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.
*/

import java.util.HashSet;
import java.util.Scanner;

public class Lab_25 {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int longestStreek = 0;

        // Iterate over each element in the array
        for (int num : nums) {
            // Check if the current element is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreek = 1;

                // Find the length of the consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreek++;
                }

                longestStreek = Math.max(longestStreek, currentStreek);
            }
        }
        return longestStreek;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int longestSequenceLength = longestConsecutive(array);

        System.out.println("Longest streek is: " + longestSequenceLength);

        sc.close();
    }
}
