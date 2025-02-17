package OOP.Interfaces;

public class Main {

    public static void main(String[] args) {

        // Interface = blueprint for a class that specifies a set of abstract methods
        //             that implementing classes MUST define.
        //             Support multiple inheritance-like behaviour. (More than 1 parent)

        Mouse mouse = new Mouse();
        mouse.flee();

        Fox fox = new Fox();
        fox.hunt();
    }
}
