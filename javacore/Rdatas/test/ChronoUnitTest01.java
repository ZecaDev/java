package aprendizadodevdojo.devdojo.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime niver = LocalDateTime.of(1988, Month.AUGUST, 6, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(niver, now));
        System.out.println(ChronoUnit.WEEKS.between(niver, now));
        System.out.println(ChronoUnit.YEARS.between(niver, now));
    }
}
