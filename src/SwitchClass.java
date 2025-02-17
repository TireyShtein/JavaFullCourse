import java.util.Locale;
import java.util.Scanner;

public class SwitchClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = "Monday", day2;

        System.out.print("Enter day of the week: ");
        day2 = scanner.nextLine().toLowerCase();


        switch (day){
            case "Monday" -> System.out.printf("It's a %s! 😒\n", day);
            case "Tuesday" -> System.out.printf("It's a %s! 😒\n", day);
            case "Wednesday" -> System.out.printf("It's a %s! 😒\n", day);
            case "Thursday" -> System.out.printf("It's a %s! 😒\n", day);
            case "Friday" -> System.out.printf("It's a %s! 😒\n", day);
            case "Saturday" -> System.out.printf("It's a %s! 😊\n", day);
            case "Sunday" -> System.out.printf("It's a %s! 😊\n", day);
            default -> {
                System.out.println("This day doesn't exist!");
            }
        }

        switch (day2){
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println("It is a weekday 😒");
            case "saturday", "sunday" ->
                    System.out.println("It is a weekend 😊");
            default -> System.out.println("This day doesn't exist!");
        }


        scanner.close();
    }
}
