public class Q3PrintArrayBackwards {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length); // Start with the length of the array
    }

    private static void printRecursion(int i) {
        // Base case: if i is 0, stop the recursion
        if (i <= 0) {
            return;
        }

        // Recursive call: first go deeper into the recursion
        printRecursion(i - 1);

        // Print the current element after the recursive call
        System.out.println(array[i - 1]);
    }
}
