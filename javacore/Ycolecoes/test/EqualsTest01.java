package aprendizadodevdojo.devdojo.javacore.Ycolecoes.test;

import aprendizadodevdojo.devdojo.javacore.Ycolecoes.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC3", "iPhone");
        Smartphone s2 = new Smartphone("1ABC3", "iPhone");
        System.out.println(s1.equals(s2));

    }
}
