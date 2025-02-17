import java.util.Scanner;

public class NestedLoopsClass {

    public static void main(String[] args) {

        int rows, columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.println("We are building a Matrix by using your symbol!");

        System.out.print("Enter a symbol: ");
        symbol = scanner.next().charAt(0);

        System.out.print("Enter amount of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter amount of columns: ");
        columns = scanner.nextInt();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++)
                System.out.print(symbol + " ");
            System.out.println();
        }



        scanner.close();
    }
}
