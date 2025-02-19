package Threading;

import java.util.Scanner;

public class ThreadMain {

    public static void main(String[] args) {

        // Threading = Allows a program to run multiple tasks simultaneously
        //             Helps improve performance with time-consuming operations
        //             (File i/o, networking, background tasks)

        // How to create a Thread
        // Option 1. Extend Thread class (simpler) (limited by one inheritance)
        // Option 2. Implement Runnable interface (better)


        // Program ends when all threads are done
        // Daemon Thread ends when main thread ends

        Scanner scanner = new Scanner(System.in);

        // Additional Thread
        EnterNameTimer enterNameTimer = new EnterNameTimer(7);
        Thread thread = new Thread(enterNameTimer);

        thread.setDaemon(true); // Thread ends when Main Thread is done
        thread.start();


        // Main Thread
        System.out.println("You have 7 seconds to enter any word");
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println(word);
        // End of Main Thread

        scanner.close();
    }
}
