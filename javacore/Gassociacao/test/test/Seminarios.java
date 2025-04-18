package aprendizadodevdojo.devdojo.javacore.Gassociacao.test.test;

public class Seminarios {
    private String titulo;
    private Aluno[] alunos;

    public Aluno[] getAlunos() {
        return alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    private Local local;

    public Seminarios(String titulo, Local local, Aluno[] alunos) {
        this.local = local;
        this.alunos = alunos;
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
