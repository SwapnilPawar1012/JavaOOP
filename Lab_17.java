/* 15. Write a Java Program to iterate ArrayList using for-loop, iterator, and advance for-loop. Insert 3 Array List.Input 20 30 40Output:
iterator Loop:
20
30
40
Advanced For Loop:
20
30
40
For Loop:
20
30
40
*/

package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab_17 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        // number.add(5);
        // number.add(23);
        // number.add(43);
        // number.add(2);
        // number.add(9);

        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();

        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            number.add(element);
        }

        System.out.println("Using for-loop: ");
        for (int i = 0; i < number.size(); i++) {
            int element = number.get(i);
            System.out.println(element);
        }

        System.out.println("Using Iterator: ");
        Iterator<Integer> iterator = number.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }

        System.out.println("Using advance for-loop: ");
        for (int element : number) {
            System.out.println(element);
        }

        sc.close();
    }
}
