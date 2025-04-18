package aprendizadodevdojo.devdojo.javacore.Gassociacao.test;

import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Jogador;
import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Time;

public class JogadorTes03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Maradona");
        Jogador jogador3 = new Jogador("Arrascaeta");
        Jogador jogador4 = new Jogador("Gabigol");

        Time time1 = new Time ("Vasco");
        Time time2 = new Time ("Flamengo");
        Jogador[] jogadores1 = {jogador1, jogador2};
        Jogador[] jogadores2 = {jogador3, jogador4};

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time2);
        jogador4.setTime(time2);

        time1.setJogadores(jogadores1);
        time2.setJogadores(jogadores2);

        System.out.println("--- jogador ---");

        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
        jogador4.imprime();

        System.out.println("--- time ---");

        time1.imprime();
        time2.imprime();
    }
}
