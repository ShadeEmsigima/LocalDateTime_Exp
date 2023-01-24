import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

//"it never ends, it never ends!"
public class LDTExp{
    public static void main(String[] args) {
    {
        System.out.println("===============================\n");
    }

      LocalDate ld = LocalDate.of(2023,1,1);
      LocalTime lt = LocalTime.parse("12:00:05.123456");
      LocalDateTime ldt = lt.atDate(ld);
      Period p = Period.of(1,13,1);

      System.out.println("The date: " + ld);
      System.out.println("The time: " + lt);
      System.out.println("The date AND time: " + ldt);
      System.out.println("The period: " + p);

      
    {
        System.out.println("\n===============================");
    }
    }
}