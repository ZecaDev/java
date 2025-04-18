package aprendizadodevdojo.devdojo.javacore.Lclassesabstratas.domain;

public abstract class  Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        bonusSalario();
    }

    public abstract void bonusSalario();

    @Override
    public void imprime() {
        System.out.println("imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
