package aprendizadodevdojo.devdojo.javacore.Npolimorfismo.test;

import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.domain.Computador;
import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.domain.Televisao;
import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.domain.Tomate;
import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutosTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nasa", 10000);
        Tomate tomate = new Tomate ("Vermelho", 10);
        Televisao tv = new Televisao("Positivo 10\" ", 500);

        CalculadoraImposto.relatorioProduto(computador);
        CalculadoraImposto.relatorioProduto(tomate);
        CalculadoraImposto.relatorioProduto(tv);

    }
}
