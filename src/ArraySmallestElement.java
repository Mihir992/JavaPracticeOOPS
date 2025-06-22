public class ArraySmallestElement {
    public static void main(String[] args) {
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // Create a 'lowest age' variable and assign the first array element of ages to it
        int lowestAge = ages[0];

        // Loop through the elements of the ages array to find the lowest age
        for (int age : ages) {
            // Check if the current age is smaller than the current 'lowest age'
            if (lowestAge > age) {
                // If the smaller age is found, update 'lowest age' with that element
                lowestAge = age;
            }
        }

        // Output the value of the lowest age
        System.out.println("The lowest age in the array is: " + lowestAge);

        /// ///////////////////////////////////////////////////
        //Find the minimum and maximum value from array
        int[] arr = {3, 7, 2, 9, 4};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
