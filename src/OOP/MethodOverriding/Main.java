package OOP.MethodOverriding;

public class Main {

    public static void main(String[] args) {

        // Method overriding = When a subclass provides its own
        //                        implementation of a method that is already defined
        //                     Allows for code reusability and specific implementations

        Cat cat = new Cat();
        Parrot parrot = new Parrot();

        cat.move();
        parrot.move();

    }
}
