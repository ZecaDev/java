package aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.test;

import aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTes03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        System.out.println("------------");
        calculadora.imprimeDivisaoDoisNumeros(20, 0);
    }
}
