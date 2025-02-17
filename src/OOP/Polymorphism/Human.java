package OOP.Polymorphism;

public class Human extends Organism{

    @Override
    void live() {
        System.out.println("The human is living");
    }
}


// Typically the same but with the interface

//public class Human implements IOrganism{
//
//    @Override
//    void live() {
//        System.out.println("The human is living");
//    }
//}
