package Constructor;

public class Rectangle {
    int width, height;

        // Constructor with parameters to initialize width and height
        public Rectangle(int w, int h) {
            width = w;
            height = h;
            System.out.println("Parameterized constructor: Rectangle created with width = " + width + " and height = " + height);
        }

        // Method to display area of the rectangle
        public void displayArea() {
            System.out.println("Area of rectangle: " + (width * height));
        }

    public static void main(String[] args) {
        // Using parameterized constructor
        Rectangle r1 = new Rectangle(10, 20);
        // Display areas of all rectangles
        r1.displayArea();
    }
}
