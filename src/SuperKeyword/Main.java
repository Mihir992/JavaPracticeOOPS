package SuperKeyword;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Bulldog", "British");  // Create a Dog object
        dog.sound();  // Calls the sound method (overridden in Dog class)
        dog.display();  // Calls the display method in Dog class
    }
}
