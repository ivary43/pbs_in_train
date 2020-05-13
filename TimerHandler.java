import java.util.*;

public class TimerHandler implements Runnable {
    Thread t;

    public void run() {
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        System.out.println("TIME LIMIT EXCEEDED!!");
        System.exit(0);
    }
}