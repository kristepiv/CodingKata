package StringManipulations;

//Determine if a string reads the same forwards and backwards
//Example: "racecar" → true, "hello" → false
public class Palindrome {

    public static Boolean isPalindrome(String s) {
        if (s == null || s.isBlank()) return false;
        if (s.length() == 1) return true;
        char[] chars = s.toLowerCase().toCharArray();
        boolean isPalindrome = false;
        for (int i = 0; i < chars.length / 2; i++) {
            if (!(chars[i] == chars[chars.length - 1 - i])) {
                return false;
            } else {
                isPalindrome = true;
            }
        }
        return isPalindrome;
    }
}
