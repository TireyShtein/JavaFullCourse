package OOP.ToString;

public class Person {

    String name, surname;
    int age;

    Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name + " " + this.surname + " " + this.age;
    }
}
