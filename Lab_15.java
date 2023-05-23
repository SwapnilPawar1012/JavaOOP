// 13.1) Write Java Program to find the transpose of a given matrix. 

import java.util.Scanner;

public class Lab_15 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Give matrix: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transpose = new int[cols][rows];
        for(int i=0; i<cols; i++) {
            for(int j=0; j<rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println("The transpose of matrix: ");
        for(int i=0; i<cols; i++) {
            for(int j=0; j<rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
