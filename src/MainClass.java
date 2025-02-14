import java.util.Scanner; // package for user output

public class MainClass {

    public static void main(String[] args){
//        System.out.print("Yes");
//
//        System.out.println("The Power of 'sout'");

        int age = 21;
        String name = "Tirey";

        System.out.println(name + " " +  age);

        Scanner scanner = new Scanner(System.in); // Receives user input

        System.out.print("Enter name: ");
        String name_ = scanner.nextLine(); // To get string value

        System.out.print("Enter age: ");
        int age_ = scanner.nextInt(); // To get integer value

        //scanner.nextDouble() -- double
        //scanner.nextBoolean() -- boolean
        System.out.println("You entered: " + name_);


        // There is a problem with receiving a string after integer / double value from input

        System.out.print("Enter number: "); // 25\n -- result
        int num = scanner.nextInt();
        scanner.nextLine(); // We are removing '\n' symbol after receiving a number

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.print("You entered " + num + " number & " + word + " word");

        scanner.close();


    }
}
