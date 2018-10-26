
package dates_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Periods {

    public static void main(String[] args) throws DateTimeParseException {
        
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = ld.plusDays(56);
        Period per = Period.between(ld, ld1); // P1M25D
        Period p1 = Period.ofDays(56);
        ld = ld.plus(p1);                   // 2018-12-04
        DateTimeFormatter dtf = 
            DateTimeFormatter.ofPattern("MMMM dd, yyyy"); // December 04, 2018
        System.out.println(per);
        System.out.println(ld);
        System.out.println(ld.format(dtf));
        System.out.println(ld.withYear(1964));
        System.out.println();
        
        LocalDateTime ldt = LocalDateTime.now();
        ldt = ldt.plus(p1);              // 2018-12-04T17:04:50.720
        System.out.println(ldt.withYear(2019));
        System.out.println();
        
        LocalDateTime ldt2 = LocalDateTime.now();
	ldt2 = ldt2.plusYears(1).plusMonths(12).plusWeeks(52).plusDays(365)
			.plusHours(8765).plusMinutes(525949).plusSeconds(0).plusNanos(0);
        System.out.println(ldt2);  // adds 6 yrs
        System.out.println();
        
        String strDate = "2015-08-04";
        LocalDate aLD = LocalDate.parse(strDate);
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd MMM uuuu");
        System.out.println(aLD + " formats as " + dTF.format(aLD));
        System.out.println();

        String str = "1986-04-08 12:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        System.out.println(dateTime);

        
        DateTimeFormatter format = 
            DateTimeFormatter.ofPattern("MMMM dd, yyyy"); 
        String text2 = "1964-09-30";
        LocalDate parsedDate = LocalDate.parse(text2);
        System.out.println(parsedDate.format(format));
        System.out.println();
        
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1964, Month.SEPTEMBER, 30);
        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                           " months, and " + p.getDays() +
                           " days old. (" + p2 + " days total)");        

    }
    
}
