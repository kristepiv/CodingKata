package StringManipulations;
//Remove all whitespace characters from a string
//Example: "hello world" → "helloworld"
public class RemoveSpaces {

    public String removeSpace(String input) {
        if (input == null) {
            return "";
        }
        return input.replace(" ", "");
    }
}
