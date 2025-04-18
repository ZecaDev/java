package aprendizadodevdojo.devdojo.javacore.Gassociacao.test.test;

public class Aluno {
    private String nome;
    private int idade;
    private Seminarios seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
