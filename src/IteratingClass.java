public class IteratingClass {

    public static void main(String[] args) {

        // break = break out of the loop (BREAK)
        // continue = skip current iteration of loop (SKIP)


        int size = 10;

        for (int i = 0; i <= size; i++){
            if (i == 3)
                continue;

            if (i == 7)
                break;
        }

    }
}
