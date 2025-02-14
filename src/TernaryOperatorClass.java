public class TernaryOperatorClass {

    public static void main(String[] args) {


        // ternary operator ? = Return 1 or 2 values of condition
        // variable = (condition) ? 1 ifTrue : 2 ifFalse;


        String gender = "female";

        String res = (gender.equals("male")) ? "Male" : "Female";

        int hours = 15;
        String timeOfDay = (hours > 12) ? (hours - 12) + " P.M." : hours + " A.M.";

        System.out.println(res);

        System.out.println("\nHours: " + hours);
        System.out.println(timeOfDay);
    }
}
