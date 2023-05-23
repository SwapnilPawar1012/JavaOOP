// 7. You are required to compute the power of a number by implementing a calculator. Create a class My Calculator which consists of a single method long power (int, int). This method takes two integers n and p, as parameters and finds (n)p. If either or is negative, then the method must throw an exception which says " n or p should not be negative”. Also, if both and are zero, then the method must throw an exception which says "n or p should not be negative”.

package OOPs;

class Calculator {
    public long power(int s, int p) throws Exception {
        if (s < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else if (s < 0 && p < 0) {
            throw new Exception("n or p should not be zero");
        } else {
            return (long) Math.pow(s, p);
        }
    }
}

public class Lab_10 {
    public static void main(String[] arg) throws Exception {
        Calculator powerCalculate = new Calculator();
        System.out.println("Power: " + powerCalculate.power(5, 2));
    }
}
