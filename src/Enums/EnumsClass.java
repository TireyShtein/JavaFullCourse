package Enums;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class EnumsClass {
    public static void main(String[] args) {

        // Enums = (Enumerations) A special kind of class
        //         that represents a fixed set of constants;
        //         They improve coded readability and are easy to maintain
        //         More efficient with switches when comparing String,
        //         rather than comparing Strings

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter day of the week: ");
            String response = scanner.nextLine().toUpperCase();


            EDays day = EDays.valueOf(response);

            switch (day) {
                case MONDAY -> System.out.println("It's monday");
                case TUESDAY -> System.out.println("It's tuesday");
                case WEDNESDAY -> System.out.println("It's wednesday");
                case THURSDAY -> System.out.println("It's thursday");
                case FRIDAY -> System.out.println("It's friday");
                case SATURDAY -> System.out.println("It's saturday");
                case SUNDAY -> System.out.println("It's sunday");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Incorrect day");
        }

        scanner.close();
    }

}
