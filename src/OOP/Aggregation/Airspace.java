package OOP.Aggregation;

public class Airspace {

    int height;
    Bird[] birds;

    Airspace(int height, Bird[] birds){
        this.height = height;
        this.birds = birds;
    }

    void printBirds(){
        for (Bird bird : this.birds)
            System.out.println(bird);
    }
}
