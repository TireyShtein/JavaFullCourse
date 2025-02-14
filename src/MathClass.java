import java.util.Scanner;

public class MathClass {
    public static void main(String[] args){

        // Math class is always available

        /*
        double res;

        System.out.println(Math.PI);

        res = Math.pow(2, 3); // 8
        res = Math.abs(-5); // 5
        res = Math.sqrt(4); // 2
        res = Math.round(3.14); // 3
        res = Math.ceil(3.14); // 4
        res = Math.floor(3.78); // 3
        res = Math.max(21, 11); // 21
        res = Math.min(21, 11); // 11


        System.out.println(res);

        */

        // ----------------------------------------------------

        // Solving math examples

        // 1. HYPOTENUSE = Sqrt(a²+b²)
        /*
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter side a: ");
        a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse is: " + Math.round(c));
        */
        // --------------------------------------------------------


        // 2. Volume

        // circumference = 2 * PI * Radius
        // area = PI * Radius²
        // volume = 4/3 * PI * Radius³

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double circumference, area, volume;

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Circumference: " + circumference + "\nArea: " + area + "\nVolume: " + volume);



    }
}
