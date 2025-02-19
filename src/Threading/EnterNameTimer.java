package Threading;

import java.sql.PseudoColumnUsage;

public class EnterNameTimer implements Runnable{

    int seconds;

    @Override
    public void run() {

        for (int i = 0; i <= seconds; i++){

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if (i == seconds){
                System.out.println("Time is up!");
                System.exit(0); // Finish the program
            }
        }
    }

    EnterNameTimer(int seconds){
        this.seconds = seconds;
    }
}
