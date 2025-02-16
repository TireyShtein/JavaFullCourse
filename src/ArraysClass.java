import java.util.Arrays;

public class ArraysClass {

    public static void main(String[] args) {

        // Array = a collection of values of the same type
        // Array = pointer to a set of collection of values of the same type
        // * variable that stores more than 1 value *

        String[] names = {"Steve", "John", "Margaret"};

        System.out.println(names[0] + "\n");

        // Basic for loop
        System.out.println("Basic for loop: ");
        for (int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");

        System.out.println("\n");

        // Enhanced for loop
        System.out.println("Enhanced for loop: ");
        for (String name : names) System.out.print(name + " ");

        Arrays.sort(names);

        System.out.print("\nSorted array: ");
        for (String name : names) System.out.print(name + " ");
    }
}
