package aprendizadodevdojo.devdojo.javacore.Npolimorfismo.test;

import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.domain.Computador;
import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.domain.Produto;
import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.domain.Tomate;
import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutosTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("nasa", 2000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setData("11/12/2026");

        CalculadoraImposto.relatorioProduto(produto);
        CalculadoraImposto.relatorioProduto(tomate);
    }
}
