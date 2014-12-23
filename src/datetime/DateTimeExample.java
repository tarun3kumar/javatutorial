package datetime;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

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

        // accessing year, month day etc
        System.out.println("#######################################");
        System.out.println("#######################################");
        System.out.println("accessing year, month etc....");
        System.out.println("Time zone is: " + calendar.getTimeZone());
        System.out.println("Calendar year is: " + calendar.get(Calendar.YEAR));
        System.out.println("Calendar month is: " + calendar.get(Calendar.MONTH));
        System.out.println("Day of month is: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of week is: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Week of year is: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of month is: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Hour of day is: " + calendar.get(Calendar.HOUR_OF_DAY));

        // generating future / past date
        System.out.println("###########################################");
        System.out.println("###########################################");
        System.out.println("generate one month future date");

        calendar.add(Calendar.MONTH, 1);
        System.out.println("one month future date: " + calendar.getTime());

        System.out.println("###########################################");
        System.out.println("###########################################");
        System.out.println("generate one month past date");

        Calendar calendar2 = new GregorianCalendar();
        calendar2.add(Calendar.MONTH, -1);
        System.out.println("one month past date: " + calendar2.getTime());

        // formatting dates
        System.out.println("#############################################");
        System.out.println("#############################################");
        System.out.println("generate date in 'yyyy-MM-dd' format");

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat1.format(date);
        System.out.println("formatted date is " + formattedDate);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy-HH:mm");
        String newFormattedDate = simpleDateFormat2.format(date);
        System.out.println("new formatted date is " + newFormattedDate);

        // a complex example - generate future date for USA time zone
        // advance calendar date by a month
        Calendar calendar1 = new GregorianCalendar();
        calendar1.add(Calendar.MONTH, 1);

        // date pattern
        String pattern = "dd/MM/yyyy-HH:mm";
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern, Locale.US);

        // get date instance from calendar and format it
        Date date3 = calendar1.getTime();
        String formattedDateForUSA = simpleDateFormat3.format(date3);
        System.out.println("formatted date for USA which is advanced by 1 month is: " + formattedDateForUSA);

    }

}
