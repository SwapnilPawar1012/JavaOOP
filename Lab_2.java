// 1.2) Write a Java program to find the common elements between two arrays of integers.

import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array-1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size of the array-2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] temp = new int[Math.min(size1, size2)];
        int index = 0;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    temp[index++] = arr1[i];
                }
            }
        }

        System.out.println("Common elements in array: ");
        for (int i = 0; i < index; i++) {
            System.out.println(temp[i] + " ");
        }

        int[] isUnique = new int[index];
        int index1 = 0;
        for (int i = 0; i < index; i++) {
            boolean isDublicate = false;
            for (int j = 0; j < index1; j++) {
                if (temp[i] == temp[j]) {
                    isDublicate = true;
                    break;
                }
            }
            if (!isDublicate) {
                isUnique[index1++] = temp[i];
            }
        }

        System.out.println("Common unique elements in array: ");
        for (int i = 0; i < index; i++) {
            System.out.println(isUnique[i] + " ");
        }

        sc.close();
    }
}
