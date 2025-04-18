package aprendizadodevdojo.devdojo.javacore.Gassociacao.test.test;



public class TesteSeminario {
    public static void main(String[] args) {
        Local local = new Local("Rua thudusbango thudusbago");
        Aluno aluno1 = new Aluno("Gabriel", 18);
        Aluno aluno2 = new Aluno("Fernanda", 19);
        Professores professor = new Professores("Barba branca", "Pirata");

        Aluno[] alunos = {aluno1, aluno2};

        Seminarios seminario = new Seminarios("A procura do one piece", local, alunos);
        Seminarios[] seminariosDoProfessor = {seminario};
        professor.setSeminariosDoProfessor(seminariosDoProfessor);

        professor.imprime();
    }
}
