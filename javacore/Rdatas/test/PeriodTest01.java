package aprendizadodevdojo.devdojo.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfter = LocalDate.now().plusYears(2).plusDays(7);

        Period p1 = Period.between(now, nowAfter);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
