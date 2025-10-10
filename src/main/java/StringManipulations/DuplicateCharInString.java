package StringManipulations;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {

    public static boolean isDuplicateCharInString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input must not be empty");
        }
        if (input.isBlank()) {
            throw new IllegalArgumentException("Input must not be blank");
        }
        Set<Character> aSet = new HashSet<>();
        boolean isDuplicate = false;
        for (char aChar : input.toCharArray()) {
            if (!aSet.add(aChar)) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }
}