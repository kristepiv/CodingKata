package StringManipulations;

import java.util.Arrays;

public class AreStringsAnagrams {

    public static boolean isAnagram(String input1, String input2) {
        if (input1 == null || input2 == null) {
            throw new IllegalArgumentException("Input must not be null");
        }
        if (input1.length() != input2.length()) {
            return false;
        }
        char[] chars1 = input1.toLowerCase().toCharArray();
        char[] chars2 = input2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < input1.length(); i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}
