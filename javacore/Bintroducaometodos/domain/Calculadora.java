package aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.domain;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(22 - 2);
    }

    public void multiplicaDoisNumeros(int a, int b) {
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public void imprimeDivisaoDoisNumeros(double a, double b) {
        if (b > 0) {
            System.out.println(a / b);
        }
        System.out.println("Nao existe divisao por zero!");
    }

    public void alteraDoisNumeros(int n1, int n2){
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("N1 "+n1);
        System.out.println("N2 "+n2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int  num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int  num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}