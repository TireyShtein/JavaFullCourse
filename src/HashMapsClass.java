import java.util.HashMap;

public class HashMapsClass {

    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicates
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> products = new HashMap<>();

        products.put("Apple", 1.99);
        products.put("Banana", 2.00);
        products.put("Melon", 2.99);

        products.put("Banana", 4.99); // Overwriting value from existing key-value pair

        products.remove("Melon"); // Delete from HashMap

        System.out.println(products);
        System.out.println(products.get("Banana")); // get value by key

        System.out.println(products.containsKey("Apple")); // check if there is a key
        System.out.println(products.containsValue(4.99)); // check if there is a value

        System.out.println(products.size()); // Get size of HashMap

        for (String key : products.keySet())
            System.out.println(key + " : " + products.get(key));

    }
}
