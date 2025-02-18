package OOP.Aggregation;

public class Main {
    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects
        //               One object contains another object as a part of its structure
        //               but the contained object/s can coexist independently

        Bird bird1 = new Bird("Selene", "Swallow", "Medium");
        Bird bird2 = new Bird("Jonas", "Crow", "Medium");
        Bird bird3 = new Bird("Poyn", "Seagull", "Small");

        Airspace air = new Airspace(4390, new Bird[] {bird1, bird2, bird3});

        air.printBirds();

    }
}
