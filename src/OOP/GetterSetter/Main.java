package OOP.GetterSetter;

public class Main {

    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying
        // GETTERS = Methods that make a field READABLE
        // SETTERS = Methods that make a field WRITEABLE

        Student student = new Student("Kile", "Wowsky", 4.9);

        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getGPA());


        student.setGPA(3.45);

        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getGPA());
    }
}
