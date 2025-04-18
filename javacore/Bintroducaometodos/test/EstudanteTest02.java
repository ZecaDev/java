package aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.test;

import aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "LUffy";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Gabriel";
        estudante02.idade = 18;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
