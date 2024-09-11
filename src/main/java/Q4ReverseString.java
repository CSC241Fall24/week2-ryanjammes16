// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static void main(String[] args) {
        String str = "Test String";
        String reversedStr = reverse(str);
        System.out.println(reversedStr);
    }

    // Recursive method to reverse the string
    public static String reverse(String s) {
        // Base case: if the string has length 1 or is empty, return it
        if (s.length() <= 1) {
            return s;
        }
        // Recursive case: reverse the rest of the string and append the first character
        else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
}
