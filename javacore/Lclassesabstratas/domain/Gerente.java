package aprendizadodevdojo.devdojo.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void bonusSalario() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
