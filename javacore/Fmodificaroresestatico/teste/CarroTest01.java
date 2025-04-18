package aprendizadodevdojo.devdojo.javacore.Fmodificaroresestatico.teste;

import aprendizadodevdojo.devdojo.javacore.Fmodificaroresestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        System.out.println(Carro.getVelocidaLimite());

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidaLimite(180);
        System.out.println(Carro.getVelocidaLimite());

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
