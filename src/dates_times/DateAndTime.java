
package dates_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class DateAndTime {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        // add 2 weeks and 3 hours to date/time now
        ldt = ldt.plusWeeks(2)
                .plusHours(3);
        System.out.println(ldt);     // 2018-10-23T18:55:30.935
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss", Locale.CANADA);
        System.out.println(ldt.format(formatter));
        String s = ldt.format(formatter).toString();  // October 23, 2018 06:55:30
        System.out.println(ldt);
        System.out.println(s);
        System.out.println( );
        // Timer extends Object
        // 4 types of schedule methods, this one uses:
        //      schedule(TimerTask task, long delay, long period)
        //          Schedules the specified task for repeated fixed-delay 
        //          execution, beginning after the specified delay.
        Timer t = new Timer();
        TimerTask tt = new Helper();
        t.schedule(tt, 200, 1000);
        System.out.println("Timer: " + t);
        System.out.println();        

                
//        YearMonth ym1 = YearMonth.now();
        YearMonth ym1 = YearMonth.of(2015, Month.SEPTEMBER);
        YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY);

        System.out.println(ym1.until(ym2, ChronoUnit.MONTHS)); // 5        
        System.out.println(ym2.compareTo(ym1));                 // 1
        System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue());  // 5        
//        System.out.println(ym1.until(ym2));        // compile error
        System.out.println(ym2.until(ym1, ChronoUnit.MONTHS));       // -5 
        System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));       // 5 
        
        
    }// end of main()

} // end of Class

// TimerTask is abstract class that implements Runnable
class Helper extends TimerTask {
        public static int i = 0;
        @Override
        public void run()     {
            System.out.println("Timer ran " + ++i);
        }
}