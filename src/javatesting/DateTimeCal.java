package javatesting;

import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class DateTimeCal {

    public static void main(String[] args) {
        YearMonth ym = YearMonth.now();
        YearMonth ym1 = YearMonth.of(2015, Month.SEPTEMBER);
        YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY);
        System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));  // returns 5
        System.out.println(ym2.compareTo(ym1));                 // returns 1 (negInt, 0, or posInt)
        System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue()); // returns 5
//        System.out.print(ym1.until(ym2));                     // must have 2nd argument/param
        System.out.println(ym2.until(ym1, ChronoUnit.MONTHS));  // returns -5
    }
    
}
