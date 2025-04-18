package aprendizadodevdojo.devdojo.javacore.Fmodificaroresestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        episodios = new int[30];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios){
            System.out.print(episodio+ " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
