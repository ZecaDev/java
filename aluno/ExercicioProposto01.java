package aprendizadodevdojo.devdojo.aluno;

import java.util.Scanner;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        double resultado;
        float taxa;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Qual o valor do seu salário? ");
        double sal = teclado.nextDouble();
        if (sal <= 34712) {
           resultado = (sal * 9.70) / 100;
           taxa = 9.70F;
        } else if (sal >= 34713 && sal <= 68507) {
            resultado = sal * 37.35 / 100;
            taxa = 37.35F;
        }else {
            resultado = sal * 49.50 / 100;
            taxa = 49.50F;
        }
        System.out.println("Voce tera que pagar um valor de R$"+resultado+" na taxa de "+taxa+"%");


    }
}
