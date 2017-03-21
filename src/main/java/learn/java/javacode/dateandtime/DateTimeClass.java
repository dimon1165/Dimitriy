package learn.java.javacode.dateandtime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

/**
 * Created by dvorop on 21.03.2017.
 */
public class DateTimeClass {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        LocalDate localDate1 = LocalDate.of(1987, Month.JULY,10);
        System.out.println(localDate1);

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime1);

        localDate1 = localDate1.plusYears(30);
        System.out.println(localDate1);

        System.out.println(localTime.getMinute());
        int i = localTime.getNano();
        System.out.println(i);

        Period period = Period.ofMonths(1);
        System.out.println(localDate.plus(period));

    }
}
