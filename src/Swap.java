public class Swap {
    public static void main(String[] args) {
        int x=5,y=7,z;
        // Swap logic using z as temporary variable
        z = x;  // Store x's value in z
        x = y;  // Assign y's value to x
        y = z;  // Assign stored value of x (from z) to y

        System.out.println("x: " + x);  // Output the new value of x
        System.out.println("y: " + y);  // Output the new value of y
    }
}
