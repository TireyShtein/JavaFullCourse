package OOP.Polymorphism;

public class Main {

    public static void main(String[] args) {

        // Polymorphism = (many shapes)
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass (parent/parents)

        Animal animal = new Animal();
        Human human = new Human();

        animal.live();
        human.live();

        Organism[] organisms = {animal, human}; // Strong two different variables but with the same superclass

        for (Organism organism : organisms)
            organism.live();

    }
}
