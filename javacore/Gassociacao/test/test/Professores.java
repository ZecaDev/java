package aprendizadodevdojo.devdojo.javacore.Gassociacao.test.test;

import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Seminario;

public class Professores {
    private String nome;
    private String especialista;
    private Seminarios[] seminariosDoProfessor;

    public Professores(String nome, String especialista) {
        this.nome = nome;
        this.especialista = especialista;
    }

    public void imprime(){
        System.out.println("--------");
        System.out.println("Professor "+ this.nome);
        System.out.println("Sua especialidade é "+ this.especialista);
        if (seminariosDoProfessor == null) return;
        System.out.println("## Seminários cadastrados ##");
        for (Seminarios seminario: this.seminariosDoProfessor){
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno: seminario.getAlunos()){
                System.out.println("---------");
                System.out.println(aluno.getNome());
                System.out.println(aluno.getIdade());
            }
        }
    }

    public Seminarios[] getSeminariosDoProfessor() {
        return seminariosDoProfessor;
    }

    public void setSeminariosDoProfessor(Seminarios[] seminariosDoProfessor) {
        this.seminariosDoProfessor = seminariosDoProfessor;
    }
}
