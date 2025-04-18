package aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.test;


import aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.domain.Estudante;
import aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "LUffy";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Gabriel";
        estudante02.idade = 18;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
