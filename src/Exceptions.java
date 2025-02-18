import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        // Exception = An event that interrupts the normal flow of a program
        //             (Division by zero, null exception, index out of range .etc)
        //             Surround dangerous code with try{} block
        //             try{} catch{} finally{}

        try{
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            scanner.close();
        }
        // Catches input errors
        catch (InputMismatchException e){
            System.out.println("This is not a number");
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
        }
        catch (Exception e){
            // Basically any possible error
            // Should be used at the end
            System.out.println("Something is wrong");
        }

        // Executes always
        finally {
            System.out.println("Executes always");
        }
    }
}
