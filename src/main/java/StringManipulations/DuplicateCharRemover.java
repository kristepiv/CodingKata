package StringManipulations;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharRemover {

    public static String removeDuplicateChar(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        if (input.length() == 1) {
            return input;
        }

        char[] chars = input.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (characterSet.add(aChar)) {
                sb.append(aChar);
            }
        }
        return sb.toString();
    }
}
