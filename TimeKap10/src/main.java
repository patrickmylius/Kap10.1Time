import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class main {

    public static void main(String[] args) {

        // Create two Time objects
        Time time1 = new Time();

        Time time2 = new Time(555550000);



        // Display Time objects year, days, hour, minute, and
        // second in the format hour:minute:second day:, Year:



        Timer timer = new Timer();

            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    int a = 100;
                    int b = 1;

                    if (a >= b)
                        b++;

                        System.out.println("Clock " + (time1.getHour() + 1) + ":" + time1.getMinute() +
                                ":" + time1.getSecond());

                }
            }, 0, 1000);



            System.out.println("Clock " + (time1.getHour() + 1) + ":" + time1.getMinute() +
                    ":" + time1.getSecond() + "   Day: " + time1.getFuckingDays() + "  Year: " + (time1.getYear() + 1970));

            System.out.println("Clock " + (time2.getHour() + 1) + ":" + time2.getMinute() +
                    ":" + time2.getSecond() + "   Day: " + time2.getFuckingDays() + "  Year: " + time2.getYear());



    }
}

