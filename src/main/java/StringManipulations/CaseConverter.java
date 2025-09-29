package StringManipulations;
//Convert string to uppercase/lowercase without built-in methods
//Toggle case of each character
//In ASCII, uppercase letters (A-Z) are 65-90
//     * and lowercase letters (a-z) are 97-122.
//     * The difference is always 32.
public class CaseConverter {

    public String toUpperCase(String s) {
        if (s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[i] >= 'a' && chars[i] <= 'z'){
                chars[i] = (char)(chars[i] - 32);
            }
        }

        return new String(chars);
    }

    public String toLowerCase(String s) {
        if (s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        for( int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars [i] + 32);
            }
        }
        return new String(chars);
    }

    public String toggleCase(String s) {
        if (s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
        if (chars[i] >= 'a' && chars[i] <= 'z') {
            chars[i] = (char) (chars[i] - 32);
        } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
            chars[i] = (char) (chars[i] + 32);
        }

        }
        return new String(chars);

        }


}
