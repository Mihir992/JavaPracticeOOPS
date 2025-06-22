package Constructor;

public class ConstructorOverloading {
    String model;
    int year;

    public ConstructorOverloading(){
        model = "Unknown";
        year = 0;
    }

    public ConstructorOverloading(String model){
        this.model = model;
        year = 2020;  // Default year
    }

    // Constructor 3: Two parameters
    public ConstructorOverloading(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorOverloading c1 = new ConstructorOverloading();  // Calls the constructor with no parameters
        ConstructorOverloading c2 = new ConstructorOverloading("Tesla");  // Calls the constructor with one parameter
        ConstructorOverloading c3 = new ConstructorOverloading("Ford", 2022);  // Calls the constructor with two parameters

        // Display details of each car
        c1.displayDetails();  // Output: Model: Unknown, Year: 0
        c2.displayDetails();  // Output: Model: Tesla, Year: 2020
        c3.displayDetails();  // Output: Model: Ford, Year: 2022
    }
}
