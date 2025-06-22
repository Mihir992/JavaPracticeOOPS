package DataStructure;
import java.util.*;

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
        // To add items to a HashMap, use the put() method:
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        /////////////////////////////////////////
        //It gives you unique value
        //To add elements to a HashSet, use the add() method:
        HashSet<String> cars1 = new HashSet<String>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("BMW");
        cars1.add("Mazda");
        System.out.println(cars1);


    //Example of lInkedHashSet
    LinkedHashSet<String> cars2 = new LinkedHashSet<>();
    cars2.add("Volvo");
    cars2.add("BMW");
    cars2.add("Ford");
    cars2.add("BMW");  // Duplicate
    System.out.println(cars);
    }
}
