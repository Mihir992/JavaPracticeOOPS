package DataStructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class List {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }


    // A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
    //One object is used as a key (index) to another object (value).
    // It can store different types: String keys and Integer values, or the same type,
    //like: String keys and String values:

    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England","London");
    capitalCities.put("Germany","Berlin");
    capitalCities.put("Norway","Oslo");
    capitalCities.put("USA","Washington DC");
    System.out.println(capitalCities);

    /////////////////////////////////////////
    HashSet<String> cars1 = new HashSet<String>();
    cars1.add("Volvo");
    cars1.add("BMW");
    cars1.add("Ford");
    cars1.add("BMW");
    cars1.add("Mazda");
    System.out.println(cars1);
    }
}
