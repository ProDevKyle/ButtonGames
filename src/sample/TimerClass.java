package sample;

import java.util.Timer;
import java.util.TimerTask;

public class TimerClass
{
    Timer time;

    public TimerClass(int num)
    {
        time = new Timer();
        time.schedule(new RemindTask(), num*1000);
    }

    class RemindTask extends TimerTask
    {
        public void run()
        {
            System.out.println("Time is up!");
            time.cancel();
        }
    }
}
