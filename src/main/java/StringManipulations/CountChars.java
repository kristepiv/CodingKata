package StringManipulations;

import java.util.Objects;
import java.util.Set;

//Count the number of vowels and consonants in a string
//Example: "hello" → vowels: 2, consonants: 3
public class CountChars {

    static final Set<Character> VOWEL_SET = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    static boolean isVowelUsingSet(char c) {
        return VOWEL_SET.contains(c);
    }

    static Result countVowelsAndConsonants(String input) {
        if (input == null) {
            return Result.of(0, 0);
        }
        int vowels = 0;
        int consonants = 0;
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            if (Character.isAlphabetic(aChar)) {
                if (isVowelUsingSet(aChar)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return Result.of(vowels, consonants);
    }

    public static class Result {
        int vowels;
        int consonants;

        private Result(){}
        public static Result of(int vowels, int consonants){
            Result result = new Result();
            result.setVowels(vowels);
            result.setConsonants(consonants);
            return result;
        }

        private void setVowels(int vowels) {
            this.vowels = vowels;
        }

        private void setConsonants(int consonants) {
            this.consonants = consonants;
        }

        public int getVowels() {
            return vowels;
        }

        public int getConsonants() {
            return consonants;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Result result = (Result) o;
            return vowels == result.vowels && consonants == result.consonants;
        }

        @Override
        public int hashCode() {
            return Objects.hash(vowels, consonants);
        }
    }
}
