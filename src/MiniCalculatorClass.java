import java.util.Scanner;

public class MiniCalculatorClass {

    public static void main(String[] args) {

        double num1, num2, result = 0;
        char operator;
        boolean validOperation = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0); // first element of entered sentence

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0){
                    System.out.println("You can't divide by zero!");
                    validOperation = false;
                }
                else
                    result = num1 / num2;
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation = false;
            }
        }


        if (validOperation)
            System.out.printf("The result of calculation is: %.2f", result);


        scanner.close();
    }
}
