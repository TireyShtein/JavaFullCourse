package OOP.Abstraction;

public class Main {

    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (must be implemented)
        //            Can contain 'concrete' methods (inherited methods)

        Student student = new Student();
        Seller seller = new Seller();

        System.out.println("The ABSTRACT method:");
        student.breath();
        seller.breath();

        System.out.println("The CONCRETE method:");
        student.walk();
        seller.walk();


    }
}
