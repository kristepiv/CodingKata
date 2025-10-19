package StringManipulations;

import java.util.*;

public class NonRepeatingChar {

    public static Character findFirstNonRepeatingCharacter(String input) {
        if (input == null || input.isBlank()) {
            return null;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }
        for (char aChar : chars) {
            if (map.get(aChar) == 1) {
                return aChar;
            }
        }
        return null;
    }
}
