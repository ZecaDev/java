package aprendizadodevdojo.devdojo.javacore.Qstring.test;

import java.sql.SQLOutput;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Gabriel";
        String nome2 = "Gabriel";
        nome = nome.concat(" Santos");
        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Gabriel");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

        String nome4 = new String ("Gabriel");
        System.out.println(nome3 == nome4);
    }
}
