package aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.test;

import aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioExercicio01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Gabriel");
        funcionario.setIdade(18);
        funcionario.setSalarios (new double[]{1200, 987.32, 2000});

        funcionario.imprimeDados();


    }
}
