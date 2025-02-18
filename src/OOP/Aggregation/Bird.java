package OOP.Aggregation;

public class Bird {

    String name, breed, size;

    Bird(String name, String breed, String size){
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    @Override
    public String toString(){
        return this.name + " " + this.breed + " " + this.size;
    }

}
