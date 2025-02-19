package Threading;

public class MultithreadMain {

    public static void main(String[] args) {

        // Multithreading = Enables a program to run multiple threads concurrently
        //                  (Thread = A set of instructions that run independently)
        //                  Useful for background tasks or time-consuming operations

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(new MyRunnable());

        System.out.println("Threads started");

        thread1.start();
        thread2.start();

        // Main thread waits for background threats to finish
        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main Thread was interrupted");
        }

        System.out.println("Threads ended");

    }
}
