public class WordOccurence {
    public static void main(String[] args) {
        //Occurnece of word in string
        String text = "the quick brown fox jumps over the lazy dog and the dog barked";
        String wordToFind = "the";

        // Convert both to lower case for case-insensitive match (optional)
        String[] words = text.toLowerCase().split(" ");
        String target = wordToFind.toLowerCase();

        int count = 0;
        for (String word : words) {
            if (word.equals(target)) {
                count++;
            }
        }

        System.out.println("The word \"" + wordToFind + "\" occurs " + count + " times.");
    }
}
