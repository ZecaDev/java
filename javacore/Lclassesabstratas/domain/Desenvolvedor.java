package aprendizadodevdojo.devdojo.javacore.Lclassesabstratas.domain;

public class Desenvolvedor extends Funcionario {
    private double salario;

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void bonusSalario() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
