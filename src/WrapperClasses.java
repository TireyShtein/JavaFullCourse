public class WrapperClasses {

    public static void main(String[] args) {

        // Wrapper Classes = Allow primitive values (int, double, char, boolean)
        //                   to be used as an objects. "Wrap them in an object"
        //                   Don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and Static Utility Methods.


        // Autoboxing
        /* Deprecated usage
        Integer a = new Integer(11);
        Double b = new Double(5.77);
        Character c = new Character('%');
        Boolean d = new Boolean(true);
        */

        // Autoboxing
        Integer a = 11;
        Double b = 6.57;
        Character c = '*';
        Boolean d = true;


        // Unwrapping
        int aa = a;
        double bb = b;
        char cc = c;
        boolean dd = d;


        Integer num = 56;
        Double salary = 6799.99;
        Character dollar = '$';
        Boolean yes = true;


        // Utility Methods
        String numString = num.toString();
        String salaryString = salary.toString();
        String dollarString = dollar.toString();
        String yesString = yes.toString();

        System.out.println(numString + " " + salaryString + " " + dollarString + " " + yesString);

        numString = Integer.toString(58);
        salaryString = Double.toString(7899.99);
        dollarString = Character.toString('^');
        yesString = Boolean.toString(false);

        System.out.println(numString + " " + salaryString + " " + dollarString + " " + yesString);

        char v = 'v';
        System.out.println(Character.isLetter(v)); // true
        System.out.println(Character.isLetter('$')); // false

        // From String to primitive
        int num_ = Integer.parseInt("22");
        double salary_ = Double.parseDouble("46.780");
        char o = "Word".charAt(1);
        boolean yes_ = Boolean.parseBoolean("true");


    }
}
