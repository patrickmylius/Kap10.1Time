/************************************************
 *                      Time                     *
 *-----------------------------------------------*
 * -hour: long                                   *
 * -minute: long                                 *
 * -second: long                                 *
 * Time()                                        *
 * Time(elapseTime: long)                        *
 * Time(hour: long, minute: long, second: long)  *
 * getHour(): long                               *
 * getMinute(): long                             *
 * getSecond(): long                             *
 * setTime(elapseTime: long)                     *
 ************************************************/

public class Time {

    // data fiels below

    long second;
    long hour;
    long minute;
    long fuckingDays;
    long year;

    // Creates a time object for the current time
    public Time() {
        this(0);
    }

    // constructs a time object with a specified elapsed time
    // since midnight, January 1, 1970 in ms.
        public Time(long elapseTime) {
            setTime(elapseTime);

        }
        // Constructs a Time object with the specified years, days, hour, minute, seconds.
        public Time(long hour, long minute, long second, long fuckingDays, long year ) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            this.fuckingDays = fuckingDays;
            this.year = year;

    }
    // Getters, returns hour, minute and second, days, years.
    long getHour() { return hour; }
    long getMinute() { return minute; }
    long getSecond() { return second; }
    long getFuckingDays() { return fuckingDays; }
    long getYear() { return year; }

    // Sets a new time for the object, by using the elapsed time.
    private void setTime(long elapseTime) {

        long now = System.currentTimeMillis();


        long totalSeconds = now / 1000;
        second = totalSeconds % 60;


        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;


        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;


        long totalFuckingDays = totalHours / 24;
        fuckingDays = totalFuckingDays % 365;


        long totalYears = totalFuckingDays / 365;
        year = totalYears % 365;


        if (elapseTime > 0) {
            totalSeconds = elapseTime / 1000;
            second = totalSeconds % 60;

            totalMinutes = totalSeconds / 60;
            minute = totalMinutes % 60;

            totalHours = totalMinutes / 60;
            hour = totalHours % 24;

            totalFuckingDays = totalHours / 24;
            fuckingDays = totalFuckingDays % 24;

            totalYears = totalFuckingDays / 365;
            year = totalYears % 365;


        }

    }
}
