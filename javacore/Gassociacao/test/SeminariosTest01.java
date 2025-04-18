package aprendizadodevdojo.devdojo.javacore.Gassociacao.test;

import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Aluno;
import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Local;
import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Professor01;
import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Seminario;

import java.util.concurrent.Semaphore;

public class SeminariosTest01 {
    public static void main(String[] args) {
        Professor01 professor = new Professor01("Carlos", "Psicologia");
        Local localidade = new Local ("Sala1");
        Aluno aluno1 = new Aluno("Joao", 15);
        Aluno aluno2 = new Aluno("Ana", 16);
        Aluno aluno3 = new Aluno("Felipe", 17);
        Aluno[] alunos = {aluno1, aluno2, aluno3};
        Seminario seminario = new Seminario("analise comportamental",professor, localidade, alunos);



        seminario.imprime();


    }
}
