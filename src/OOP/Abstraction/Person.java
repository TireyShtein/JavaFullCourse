package OOP.Abstraction;

public abstract class Person {

    abstract void breath(); // ABSTRACT

    void walk(){ // CONCRETE
        System.out.println("The person is walking");
    }

}
