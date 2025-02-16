import java.util.Scanner;


public class Arrays2Class {

    public static void main(String[] args) {

        String[] cities = {"NYC", "Moscow", "Rio-De-Janeiro", "Houston", "Dallas"};
        String[] cities2 = new String[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cities2.length; i++) {
            cities2[i] = scanner.nextLine();
        }

        System.out.print("Entered cities: ");
        for (String city : cities2) System.out.print(city + " ");


        System.out.println("\n--------------------------------");

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] food = new String[size];

        for (int i = 0; i < food.length; i++){
            System.out.print("Enter food: ");
            food[i] = scanner.nextLine();
        }

        System.out.println("Entered food: ");
        for (String food_ : food) System.out.print(food_ + " ");

        scanner.close();
    }
}
