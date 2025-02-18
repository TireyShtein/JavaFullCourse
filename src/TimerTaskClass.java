import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskClass {

    public static void main(String[] args) {
        // Timer = Class that schedules tasks at specific time or periodically
        //         Useful for: sending notifications, scheduled updates, repetitive tasks

        // TaskTimer = Represents a task that will be executed by Timer
        //             Extend TimerTask class to define task
        //             Create a subclass of TimerTask and @Override run()

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;

            @Override
            public void run() {
                System.out.println("Printing text");
                count--;

                if (count <= 0){
                    System.out.println("Finished Task");
                    timer.cancel();
                }
            }
        };

    //  timer.schedule(TimerTask, delay, period)
    //  TimerTask - task, delay (ms), period (ms)
        timer.schedule(task, 1000, 3000); // Print text after 1 sec every 3 seconds
    }




}
