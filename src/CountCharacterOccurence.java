import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurence {
    public static void main(String[] args) {
        String input = "hello world";
        int[] count = new int[256];  // ASCII size array to store character counts

        // Iterate over the string and count the occurrences of each character
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }

        // Print the occurrences of each character
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
        /// ///////////////////////////////////////////////////
        //Count occcurence of word
        String text = "hello world hello java world java hello";

        // Split the text into words
        String[] words = text.split(" ");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count occurrences using a for loop
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // If the word is already in the map, increment its count
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Otherwise, add the word with count 1
                wordCount.put(word, 1);
            }
        }

        // Print the result
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
