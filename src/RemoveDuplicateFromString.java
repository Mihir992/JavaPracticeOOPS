import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String str = "I am am mihir";
        // Split the text into words
        String[] words = str.split(" ");
        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        // Join the words back into a string
        String result = String.join(" ", uniqueWords);

        // Print the result
        System.out.println("Original: " + str);
        System.out.println("Without duplicates: " + result);
    }
}
