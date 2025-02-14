import java.util.Random;

public class RandomExampleClass {

    public static void main(String[] args){

        Random random = new Random();

        int num1, num2, num3;

        // random.nextInt() -- random integer
        // random.nextDouble() -- random double
        // random.Boolean() -- true or false

        num1 = random.nextInt();
        num2 = random.nextInt();
        num3 = random.nextInt();

        if (random.nextBoolean()){
            System.out.println("True");
        } else System.out.println("False");

    }
}
