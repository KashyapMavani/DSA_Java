public class StringReplacement {
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        String searchString = "world";
        String replacementString = "Java";

        String replacedString = replaceSubstring(originalString, searchString, replacementString);
        
        System.out.println("Original string: " + originalString);
        System.out.println("Replaced string: " + replacedString);
    }

    public static String replaceSubstring(String original, String search, String replacement) {
        StringBuilder result = new StringBuilder();
        int startIndex = 0;
        int endIndex;

        while ((endIndex = original.indexOf(search, startIndex)) != -1) {
            result.append(original, startIndex, endIndex); // Append part before the substring
            result.append(replacement); // Append the replacement string
            startIndex = endIndex + search.length(); // Move startIndex to the end of the replaced substring
        }

        result.append(original.substring(startIndex)); // Append the remaining part of the original string

        return result.toString();
    }
}
