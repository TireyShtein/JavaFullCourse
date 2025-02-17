package OOP.Super;

public class Main {

    public static void main(String[] args) {

        //super = Refers to the parent class (subclass <- superclass)
        //        Used in constructors and method overriding
        //        Calls the parent constructor to initialize attributes

        Person person = new Person("Rick", "Howardson");
        Student student = new Student("Antonio", "Sanchez", 3.4);
        Employee employee = new Employee("Jarvis", "Junior", 34000);

        person.printName();
        student.showFullInfo();
        employee.showSalary();


    }
}
