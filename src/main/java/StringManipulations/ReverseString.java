package StringManipulations;
//Write a method to reverse a string without using built-in reverse methods
// Example: "hello" → "olleh"

public class ReverseString {

    public static String reverseString(String s) {
        if (s == null) return null;
        if (s.isEmpty()) return s;

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
