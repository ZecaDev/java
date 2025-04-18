package aprendizadodevdojo.devdojo.javacore.Fmodificaroresestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidaLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime (){
        System.out.println("------------");
        System.out.println("Nome "+ this.nome);
        System.out.println("Velocidade maxima "+ this.velocidadeMaxima);
        System.out.println("Velocidade limite "+ Carro.velocidaLimite);
    }

    public static void setVelocidaLimite(double velocidaLimite){
        Carro.velocidaLimite = velocidaLimite;
    }

    public static double getVelocidaLimite(){
        return Carro.velocidaLimite;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
