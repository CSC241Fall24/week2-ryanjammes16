public class Q2PrintArray {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length); // Start with the length of the array
    }

    private static void printRecursion(int i) {
        // Base case: if i is 0, stop the recursion
        if (i <= 0) {
            return;
        }

        // Recursive case: print the element at index (array.length - i)
        System.out.println(array[array.length - i]);

        // Recursively call the function with i - 1
        printRecursion(i - 1);
    }
}
