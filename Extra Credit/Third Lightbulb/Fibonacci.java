/**
 * Christopher Oh
 * SJSU CS 146
 * Bonus Questions: "Third lightbulb's the charm"
 */

public class Fibonacci {
    /**
     * Computes the nth number in the Fibonacci Sequence
     * Note: Counting starts at index 0
     * @param n
     * @return nth number of Fibonacci Sequence
     */
    public static int nthFibonacci (int n) {
        if (n < 0) {
            System.out.println("Error, n must be a non-negative integer");
            return -1;
        }

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }
    
    public static void main(String[] args) {
        System.out.println(nthFibonacci(17));
    }
}
