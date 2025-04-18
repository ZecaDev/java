package aprendizadodevdojo.devdojo.javacore.Alunocresceu.teste;

import aprendizadodevdojo.devdojo.javacore.Alunocresceu.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "LUffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.idade);
    }
}
