package aprendizadodevdojo.devdojo.javacore.Eblocosinicializacao.teste;

import aprendizadodevdojo.devdojo.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
