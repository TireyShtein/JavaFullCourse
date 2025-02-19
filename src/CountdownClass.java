import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownClass {

    public static void main(String[] args) {

        // COUNTDOWN TIMER

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter # to count from: ");
        int response = scanner.nextInt();

        System.out.println("Counting down: ");

        Timer timer = new Timer();
        TimerTask countdown = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;

                if (count < 0){
                    System.out.println("FINISHED!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(countdown, 0, 1000);

    }
}
