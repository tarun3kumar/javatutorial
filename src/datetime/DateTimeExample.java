package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author  tbhadauria <tarun.kumar.bhadauria@zalando.de>
 */
public class DateTimeExample {

    public static void main(final String[] args) throws InterruptedException {

        System.out.println("############################");
        System.out.println("############################");
        System.out.println("Current time in ms: " + System.currentTimeMillis()); // time since January 1st 1970 in
                                                                                 // milliseconds

        // calculate time between two operation
        long startTime = System.currentTimeMillis();
        Thread.sleep(5000);

        // some operations go here
        // some more operations go here
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime));

        // create Date instance using java.util.Date
        Date date = new Date();
        System.out.println("############################");
        System.out.println("############################");
        System.out.println("Access date and time from java.util.Date");
        System.out.println("Current Date Time is: " + date.getTime()); // Returns the number of milliseconds since
                                                                       // January 1, 1970, 00:00:00 GMT

        // date comparison
        Date date1 = new Date();
        Thread.sleep(1000);

        Date date2 = new Date();
        System.out.println("Compare date2 with date1: " + date2.compareTo(date1)); // returns 1 since date 2 is ahead

        // of date1

        // operations on java.util.Calendar and GregorianCalendar
        System.out.println("######################################");
        System.out.println("######################################");

        Calendar calendar = new GregorianCalendar();
        System.out.println("Current calendar time is: " + calendar.getTime());

    }

}
