import java.util.HashSet;
import java.util.Set;

public class DuplicateValueArray {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 2, 3, 5, 2, 6, 7, 8, 3};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                duplicates.add(number);
            }
        }
        System.out.println("Duplicate values: " + duplicates);
    }
}
