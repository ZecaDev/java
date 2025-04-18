package aprendizadodevdojo.devdojo.javacore.Csobrecargametodos.teste;

import aprendizadodevdojo.devdojo.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 12, "Açao");

        anime.imprime();
    }
}
