package aprendizadodevdojo.devdojo.javacore.Gassociacao.domain;

public class Seminario {
    private String titulo;
    private Professor01 professor;
    private Aluno[] aluno;
    private Local local;

    public Seminario(String titulo, Aluno[] alunos) {
        this.titulo = titulo;
        this.aluno = alunos;
    }

    public Seminario(String titulo, Professor01 professor, Local local, Aluno[] aluno) {
        this.titulo = titulo;
        this.professor = professor;
        this.aluno = aluno;
        this.local = local;
    }

    public void imprime(){
        System.out.println("O nome do seminário é "+ this.titulo);

        System.out.println("Na turma "+ local.getEndereco());
        System.out.println("-----------------");
        if (this.professor != null) {
            System.out.println("Professor: " + this.professor.getNome());
            System.out.println("O professor é especialiazado em "+ professor.getEspecialidade());
        }
        if (aluno != null) {
            for (Aluno alunos : aluno) {
                System.out.println("-----------------");
                System.out.println("Nome: " + alunos.getNome());
                System.out.println("Idade: " + alunos.getIdade());
            }
        }


    }

    public Professor01 getProfesor() {
        return professor;
    }

    public void setProfesor(Professor01 profesor) {
        this.professor = profesor;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
