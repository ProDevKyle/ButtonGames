package sample;

import java.util.Timer;
import java.util.TimerTask;

public class BackEnd
{
    Timer time;

    public BackEnd(int num)
    {
        time = new Timer();
        time.schedule(new RemindTask(), num*1000);
        System.out.println("Time is " + time);
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