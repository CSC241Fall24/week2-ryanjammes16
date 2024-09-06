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
        
       int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        f[2] =2;

        for (int i = 3; I <=n; i++){
            f[i] = f[i-1] + 2* f[i-2] + 3 * f[i-3];
        }
        return f[n];
    }
}
