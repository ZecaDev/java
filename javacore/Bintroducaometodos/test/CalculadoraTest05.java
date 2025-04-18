package aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.test;

import aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] num = {1, 2 ,3, 4, 5};

        calculadora.somaArray(num);

        calculadora.somaVarArgs(1, 2, 3 ,4 ,5);
    }

}
