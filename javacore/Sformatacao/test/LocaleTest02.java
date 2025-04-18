package aprendizadodevdojo.devdojo.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLinguages = Locale.getISOLanguages();

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }

        System.out.println();

        for (String isoLinguage : isoLinguages) {
            System.out.print(isoLinguage + " ");
        }


    }
}
