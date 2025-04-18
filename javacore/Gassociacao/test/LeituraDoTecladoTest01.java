package aprendizadodevdojo.devdojo.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("O grande sofware de previsao do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou nao");
        String pergunta = teclado.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NAO");
        }
    }
}
