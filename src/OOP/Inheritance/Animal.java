package OOP.Inheritance;

public class Animal {

    boolean isAlive;
    String voice;

    Animal(){
        this.isAlive = true;
    }

    void sleep(){
        System.out.println("The animal is sleeping");
    }

    void jump(){
        System.out.println("The animal is jumping");
    }
}
