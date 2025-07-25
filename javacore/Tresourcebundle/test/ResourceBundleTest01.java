package aprendizadodevdojo.devdojo.javacore.Tresourcebundle.test;

import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("mensagem", new Locale("pt", "BR"));
        System.out.println(bundle.getString("bom.dia"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("oi"));
        bundle = ResourceBundle.getBundle("mensagem", new Locale("en", "US"));
        System.out.println(bundle.getString("bom.dia"));
        System.out.println(bundle.getString("ola"));

        System.out.println(bundle.getString("oi"));
    }
}
