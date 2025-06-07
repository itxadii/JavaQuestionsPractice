package Day14;

public class Recursion {
    public static void main(String[] args) {
        // int n = 5; 
        // System.out.println("Factorial of " + n + " is: " + factorial(n));
        System.out.println("Fibonacci of 5 is: " + fibonacci(5));
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
}
