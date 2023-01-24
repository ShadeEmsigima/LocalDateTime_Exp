import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Formatter;

import javax.swing.text.DateFormatter;

//"it never ends, it never ends!"
public class LDTExp{
    public static void main(String[] args) {
    {
        System.out.println("===============================\n");
    }

    // by default, the following 3 objects are made using the ISO_(LOCAL_)Date formatter
      LocalDate ld = LocalDate.of(2023,1,1);
      LocalTime lt = LocalTime.parse("12:00:05.123456"); //note how nanoseconds doesn't have to be 9 numbers, and uses '.' instead of ':'
      LocalDateTime ldt = lt.atDate(ld);
      Period p = Period.of(1,13,1);

      System.out.println("The date: " + ld);
      System.out.println("The time: " + lt);
      System.out.println("The date-time: " + ldt);
      System.out.println("The period: " + p);

    // to format the results in a more 'human' style we use formatters
    
    DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM); // note how all formatters, regardless whether it is meant for time or date, draw the same class of Date-and-TimeFormatter! Only difference being the form of the ofLocalizedX() version. 
    DateTimeFormatter tf = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
    DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    DateTimeFormatter mydft = DateTimeFormatter.ofPattern("'The year of 'yyyy',--or 'yy' for short-- in the 'MM'th month, 'mm'minute. It is the 'D'st day of the year, ' d'th day of the month, (which is on a ' EEEE', or' e'th day of the week for localized dates)'");
    DateTimeFormatter dutchy = DateTimeFormatter.ofPattern("hh:mm' o clock, ' E d'st of the 'M'st month' YYYY");

    {
        System.out.println();
    }

      System.out.println("Formatted date: " + ld.format(df)); // have obj format with formatter
      System.out.println("Formatted time: " + tf.format(lt)); // have formatter format obj
      System.out.println("Formatted date-time: " + ldt.format(dtf));
      System.out.println("First custom formatter: " + mydft.format(ldt));
      System.out.println("Second custom formatter: " + dutchy.format(ldt));
      
    {
        System.out.println("\n===============================");
    }
    }
}