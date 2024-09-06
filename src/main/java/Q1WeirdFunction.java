// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    // Recursive method
    public static int fRecursive(int n) {
        // Base cases
        if (n < 3) {
            return n;
        }
        // Recursive case
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    // Iterative method
    public static int fIterative(int n) {
        // Handle base cases
        if (n < 3) {
            return n;
        }
        
        // Initialize base values for f(0), f(1), and f(2)
        int f0 = 0;
        int f1 = 1;
        int f2 = 2;
        int fn = 0;
        
        // Iteratively compute f(n)
        for (int i = 3; i <= n; i++) {
            fn = f2 + 2 * f1 + 3 * f0;  // f(n) = f(n-1) + 2*f(n-2) + 3*f(n-3)
            f0 = f1;  // Move f(n-3) to f(n-2)
            f1 = f2;  // Move f(n-2) to f(n-1)
            f2 = fn;  // Update f(n-1) to the current value
        }
        
        return fn;
    }

    public static void main(String[] args) {
        // Test the functions
        int n = 5;  // Example input
        
        System.out.println("Recursive result: " + fRecursive(n));
        System.out.println("Iterative result: " + fIterative(n));
    }
}
