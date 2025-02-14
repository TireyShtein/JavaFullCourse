import java.util.Scanner;


public class IfClass {

    public static void main(String[] args) {

        boolean isFemale, isWorking;
        double respect = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a woman?: ");
        isFemale = scanner.nextBoolean();

        System.out.print("Are you working?: ");
        isWorking = scanner.nextBoolean();


        if (isFemale && !isWorking){
            System.out.println("Get BACK in the KITCHEN!");
            respect *= 0.667;
        }
        else {
            if (isWorking){
                System.out.println("Okay, man, you are good");
                respect += 10;
            }
            else {
                System.out.println("Get a job, idiot!");
                respect *= 0.87;
            }
        }

        System.out.printf("Your respect is %.2f", respect);

        scanner.close();
    }
}
