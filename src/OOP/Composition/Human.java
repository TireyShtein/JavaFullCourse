package OOP.Composition;

public class Human {

    String name;
    char sex;
    Nose nose;

    Human(String name, char sex, String noseType){
        this.name = name;
        this.sex = sex;
        this.nose = new Nose(noseType);
    }

    void printInfo(){
        System.out.println(this.name + " " + this.sex + " " + this.nose.type);
    }

    void breath(){
        this.nose.breath();
        System.out.println(this.name + " is breathing");
    }


}
