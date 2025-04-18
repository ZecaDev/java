package aprendizadodevdojo.devdojo.javacore.Jmodificadorfinal.test;

import aprendizadodevdojo.devdojo.javacore.Jmodificadorfinal.dominio.Carro;
import aprendizadodevdojo.devdojo.javacore.Jmodificadorfinal.dominio.Comprador;
import aprendizadodevdojo.devdojo.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        carro.COMPRADOR.setNome("Gabriel");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("F40");
        ferrari.imprime();

    }

}
