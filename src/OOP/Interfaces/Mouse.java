package OOP.Interfaces;

public class Mouse implements IPrey{

    @Override
    public void flee(){
        System.out.println("The mouse has successfully escaped");
    }
}
