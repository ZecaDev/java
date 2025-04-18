package aprendizadodevdojo.devdojo.javacore.Alunocresceu.teste;

import aprendizadodevdojo.devdojo.javacore.Alunocresceu.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Uno";
        carro1.modelo = "Com escada";
        carro1.ano = 2010;

        carro2.nome = "Corola";
        carro2.modelo = "V SPEC BITURBO ASPIRADO";
        carro2.ano = 2020;

        carro1 = carro2;

        System.out.println("Nome do carro1: "+ carro1.nome +", Modelo: "+ carro1.modelo +", Ano: "+ carro1.ano);
        System.out.println("-------------------------------------------");
        System.out.println("Nome do carro2: "+ carro2.nome +", Modelo: "+ carro2.modelo +", Ano: "+ carro2.ano);


    }
}
