package aprendizadodevdojo.devdojo.aluno;

import java.util.Scanner;

public class ExercioFernanda {
    public static void main(String[] args) {
        int[] array = new int[4];
        int help = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ":" + array[i]);
        }
        System.out.println("");
        System.out.println("Escolha 4 numeros entre 0 e 3 e o programa vai colocar em ordem");
        System.out.println("OBS NAO repita o numero escolhido anteriormente!!");
        System.out.println("");

        /*Duas estruturas de repeticao uma para ler os números digitados e a outra para
        fazer a verifiçao se o número é igual o array */

        for (int i = 0; i < array.length; i++){
            System.out.print("Digite um número entre 0 e 3: ");
            int n = teclado.nextInt();
            if (n > 3 || (help == 1 && n == array[n])) {
                System.out.println("ESCREVA APENAS NÚMEROS ENTRE 0 E 3! E NAO ESCREVA NUMERO REPETIDO!");
                i--;
                continue;
            }
            if (n == 0){
                help = 1;
            }
            for (int j = 0; j < array.length; j++) {
                if (n == j) {
                    array[j] = n;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ":" + array[i]);
        }
    }
}
