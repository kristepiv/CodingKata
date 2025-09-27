package StringManipulations;
//Write a method to reverse a string without using built-in reverse methods
// Example: "hello" → "olleh"

public class ReverseString {

    public static String reverseString(String s) {
        if (s == null) return null;
        if (s.isEmpty()) return s;

        char [] chars = s.toCharArray();
        char [] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[chars.length - 1- i ] = chars[i];
        }

        return new String(reversed);
    }
}
