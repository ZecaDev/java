package aprendizadodevdojo.devdojo.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localItaly = new Locale("it", "IT");
        Locale localCH = new Locale("it", "CH");
        Calendar c = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localCH);
        System.out.println("Italia " + df1.format(c.getTime()));
        System.out.println("Suiça " + df2.format(c.getTime()));


    }
}
