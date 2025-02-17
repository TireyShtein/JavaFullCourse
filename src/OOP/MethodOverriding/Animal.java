package OOP.MethodOverriding;

public class Animal {

    String name;
    boolean isAlive;

    Animal(String name){
        this.name = name;
    }

    Animal(){

    }

    void move(){
        System.out.println("This animal is running");
    }
}
