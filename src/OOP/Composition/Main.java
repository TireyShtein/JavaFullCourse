package OOP.Composition;

public class Main {

    public static void main(String[] args) {

        // Composition = Represents a "part-of" relationship between objects
        //               Example: body parts of a Humans.
        //               Allows complex object to be constructed from smaller objects


        Human human1 = new Human("Jessica", 'f', "Potato-shaped");
        human1.printInfo();
        human1.breath();
    }
}
