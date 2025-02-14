public class PrintfClass {

    public static void main(String[] args) {

        // printf() -- method that formats output

        // %[flags][width][.precision][specifier-character]

        // flags --

        // width
        // 0 - zero padding
        // number = right padding
        // negative number = left padding

        // .precision -- limit the amount of output characters
        // usually for float, double
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive


        // specifier-character:
        // %s -- String
        // %c -- char
        // %d -- integer
        // %f -- double/float
        // %b -- boolean

        String name = "Vivy";
        char signature = 'V';
        int height = 181;
        double weight = 54.9;
        boolean isFemale = true;


        // [width]
        int p1 = 2, p2 = 45, p3 = 678;

        System.out.printf("%03d\n", p1);        // 002
        System.out.printf("%03d\n", p2);        // 045
        System.out.printf("%03d\n\n", p3);      // 678

        System.out.printf("%3d\n", p1);              //   2
        System.out.printf("%3d\n", p2);              //  45
        System.out.printf("%3d\n\n", p3);            // 678

        System.out.printf("%-3d\n", p1);              // 2
        System.out.printf("%-3d\n", p2);              // 45
        System.out.printf("%-3d\n\n", p3);            // 678

        // [.precision]
        double num1 = 14.77, num2 = 111129.567, num3 = -7.91;

        System.out.printf("%+.3f\n", num1); // +14.770
        System.out.printf("%,.3f\n", num2); // 111,129.567
        System.out.printf("%.3f\n\n", num3); // -7.910

        // [specifier-character]
        System.out.printf("The name is %s\nMy Signature is %c", name, signature);
        System.out.printf("My height is %d\n", height);
        System.out.printf("My weight is %f\n", weight);
        System.out.printf("I am a female: %b\n\n", isFemale);
    }
}
