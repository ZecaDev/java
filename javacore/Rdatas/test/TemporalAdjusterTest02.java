package aprendizadodevdojo.devdojo.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class   ObterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek diaSemana = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDay;
        switch (diaSemana){
            case FRIDAY:
                addDay = 3;
                break;
            case SATURDAY:
                addDay = 2;
                break;
            default:
                addDay = 1;
        }
        return temporal.plus(addDay, ChronoUnit.DAYS);
    }
}



public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.withDayOfMonth(10);
        now = now.with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
