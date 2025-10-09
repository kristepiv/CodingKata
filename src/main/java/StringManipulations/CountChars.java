package StringManipulations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Count the number of vowels and consonants in a string
//Example: "hello" → vowels: 2, consonants: 3
public class CountChars {

    static final Set<Character> VOWEL_SET = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    static boolean isVowelUsingSet(char c) {
        return VOWEL_SET.contains(c);
    }

    static Map<String, Integer> countVowelsAndConsonants(String input) {
        if (input == null) return "";
        input = input.replace(" ", "");
        char[] chars = input.toCharArray();
        Map<String, Integer> map = new HashMap<>();
        map.put("Vowels", 0);
        map.put("Consonants", 0);
        for (char aChar : chars) {
            if (isVowelUsingSet(aChar)) {
                map.put("Vowels", map.get("Vowels") + 1);
            } else if (Character.isAlphabetic(aChar)) {
                map.put("Consonants", map.get("Consonants") + 1);
            }
        }
        return map;
    }
}
