package aprendizadodevdojo.devdojo.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localdatetime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(localdatetime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt = time.atDate(date);
        System.out.println(ldt);
    }
}
