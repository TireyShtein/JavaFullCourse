public class VarArgsClass {

    public static void main(String[] args) {

        // varargs = allow a method to accept varying # of arguments (parameters)
        //           makes method more flexible, no need for overloaded methods
        //           Java will pack the arguments into an array
        //           ...  (ellipsis)



        int result = add(1, 2, 3);

        System.out.println("Result of adding: " + result);
    }


    // Example
//  [public] [static] [type] [name]([type]... [name of array])

    public static int add(int... numbers){

        int res = 0;

        for (int number : numbers) res += number;

        return res;
    }
}
