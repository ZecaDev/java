package aprendizadodevdojo.devdojo.javacore.Alunocresceu.teste;

import aprendizadodevdojo.devdojo.javacore.Alunocresceu.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome: "+ professor.nome +" Idade: "+ professor.idade +" Sexo: "+ professor.sexo);

    }
}
