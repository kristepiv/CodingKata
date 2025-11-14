package StringManipulations;

import java.util.*;
import java.util.stream.Collectors;

public class StringCompressor {
    //Compress a string** (e.g., "aaabb" → "a3b2")

    public static String stringCompressor(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        char currentChar = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = chars[i];
                count = 1;
            }
        }
        return sb.append(currentChar).append(count).toString();
    }
}
