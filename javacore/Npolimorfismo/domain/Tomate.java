package aprendizadodevdojo.devdojo.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO= 0.06;
    private String data;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto(){
        System.out.println("Calculando imposto do tomate...");
        return this.valor * IMPOSTO;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
