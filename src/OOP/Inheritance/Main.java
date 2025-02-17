package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //               from another class
        //               Child <-- Parent <-- Grandparent


        Animal goose = new Animal();
        Goose goose1 = new Goose();

        Animal raccoon = new Animal();
        Raccoon raccoon1 = new Raccoon();

        System.out.println(goose.isAlive);
        System.out.println(goose1.isAlive);
        goose.jump(); // Animal doesn't have method fly from Goose class
        goose1.fly();


        System.out.println(raccoon.isAlive);
        System.out.println(raccoon1.isAlive);
        raccoon.sleep();
        raccoon1.climb();

    }
}
