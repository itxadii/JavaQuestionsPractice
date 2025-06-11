package Day14;

public class Recursion {
    public static void main(String[] args) {
        // int n = 5; 
        // System.out.println("Factorial of " + n + " is: " + factorial(n));
        // System.out.println("Fibonacci of 5 is: " + fibonacci(5));
        System.out.println("2^10 is: " + optimizedpower(2, 10));
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
    public static int optimizedpower(int a, int b) {
        if (b == 0) {
            return 1; // Base case
        }
        if (b % 2 == 0) {
            int halfPower = optimizedpower(a, b / 2);
            return halfPower * halfPower; // Even exponent
        } else {
            return a * optimizedpower(a, b - 1); // Odd exponent
        }
    }
    
}
