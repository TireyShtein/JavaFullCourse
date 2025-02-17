package OOP;

public class OOPCatClass {

    public String name = "Mok";
    public String nickname = "Fluff";
    public int age = 7;



    // static = Makes a variable or method belong to the class
    //          rather than to any specific object.
    //          Commonly used for utility methods or shared resources

    static boolean isCat = true;



    // Constructor
    OOPCatClass(String name, String nickname, int age){
        this.name = name;
        this.nickname = nickname;
        this.age = age;
    }



    // Overloaded Constructor
    OOPCatClass(){
        this.name = "Cat";
        this.nickname = "C";
        this.age = 1;
    }

    OOPCatClass(String name){
        this.name = name;
        this.nickname = Character.toString(name.charAt(0));
        this.age = 1;
    }

    // End of Overloaded Constructors

    public void isEating(){
        System.out.printf("The cat %s is eating\n", this.name);
    }
}
