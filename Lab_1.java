// 1.1) Program to remove all repeated elements from an array

/**
 * Lab_1
 */

import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter elements: ");
            for (int i = 0; i < size; i++) {
                int data = sc.nextInt();
                arr[i] = data;
            }

            int[] temp = new int[size];
            int index = 0;
            for (int i = 0; i < size; i++) {
                boolean isDublicate = false;
                for (int j = 0; j < index; j++) {
                    if (arr[i] == arr[j]) {
                        isDublicate = true;
                        break;
                    }
                }
                if(!isDublicate) {
                    temp[index++] = arr[i];
                }
            }

            // int[] isUnique = new int[index];
            // for (int i = 0; i < index; i++) {
            //     isUnique[i] = temp[i];
            // }

            System.out.println("After removing all repeated elements from an array : ");
            for (int i = 0; i < index; i++) {
                System.out.print(temp[i] + " ");
            }
        }
    }
}