package Generics;

public class GenericsClass {

    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, method
        //            that is compatible with different data types
        //            <T> type parameter (placeholder that gets replaced with a real type
        //            <String> type argument (specifies the type)

        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        box1.setItem("Maracas");
        System.out.println(box1.getItem());

        box2.setItem(123);
        System.out.println(box2.getItem());


        Product<String, Double> product1 = new Product<>("V-Bucks", 14.99);
        Product<String, Double> product2 = new Product<>("Thermometer", 8.0);

        System.out.println(product1.getItem() + " " + product1.getPrice());
        System.out.println(product2.getItem() + " " + product2.getPrice());
    }
}
