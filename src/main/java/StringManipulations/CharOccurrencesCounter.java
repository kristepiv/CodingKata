package StringManipulations;

import java.util.HashMap;
import java.util.Map;

public class CharOccurrencesCounter {

    public static Map<Character, Integer> charOccurrencesCounter(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        Map<Character, Integer> result = new HashMap<>();
        if (input.length() == 1) {
            result.put(input.charAt(0), 1);
            return result;
        }
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.put(aChar, result.getOrDefault(aChar,0)+1);

        }
        return result;
    }
}
