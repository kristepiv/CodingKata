package StringManipulations;

public class DigitsInString {

    public static boolean isStringOnlyFromDigits(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            if (!Character.isDigit(aChar)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasDigits(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        return input.chars().allMatch(Character::isDigit);
    }
}
