// 6. Write the following code in your editor below:
// A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
// A class named Adder inherits from a superclass named Arithmetic. The main method in the Tester class should print the following: SAMPLE O/P:My superclass is: Arithmetic
// 42 13 20

package OOPs;

class Arithmetic {
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

class Adder extends Arithmetic {
    public int add(int a, int b, int c) {
        int sum = super.add(a, b);
        return sum + c;
    }
}

public class Lab_9 {
    public static void main(String arg[]) {
        Adder add = new Adder();
        System.out.println("My superclass is: Arithmetic");
        System.out.println(add.add(10, 15, 5));
    }
}
