/*12. Write a Java program to display the pattern like a diamond.
Input number of rows (half of the diamond) :7 Expected Output :
* 
*** 
***** 
******* 
********* 
*********** 
************* 
*********** 
********* 
******* 
***** 
*** 
*
----
*/

import java.util.Scanner;

public class Lab_14 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();

        // Upper Half
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
        }

        System.out.println();
        // Lower Half
        for (int i = row - 1; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
