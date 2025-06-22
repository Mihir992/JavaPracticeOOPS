import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurence {
    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Print the entire map
        System.out.println(countMap);

        /// ///////////////////////////////////////////////////
        //Count occcurence of word
        String text = "hello world hello java world java hello";

        // Split the text into words
        // Result of split: ["hello", "world", "hello", "java", "world", "java", "hello"]
        String[] words = text.split(" ");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count occurrences using a for loop
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the full map
        System.out.println(wordCount);
    }
}
