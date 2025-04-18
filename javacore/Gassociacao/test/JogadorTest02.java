package aprendizadodevdojo.devdojo.javacore.Gassociacao.test;

import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Jogador;
import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Flamengo");

        jogador1.setTime(time);

        jogador1.imprime();


    }
}
