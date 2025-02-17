package OOP.Interfaces;

public class Fish implements IPrey, IHunt{

    @Override
    public void hunt() {
        System.out.println("The Fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("The Fish is swimming away");
    }
}
