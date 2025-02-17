package OOP.ToString;

public class Main {

    public static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               Can be overridden to provide meaningful details.s


        Person person = new Person("Harry", "Lewis", 21);


        System.out.println(person); // W/o overriding method it would give a Hash Code of an object
        System.out.println(person); // Overridden Method toString()
    }
}
