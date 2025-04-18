package aprendizadodevdojo.devdojo.javacore.Npolimorfismo.servico;

import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.domain.Produto;
import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void relatorioProduto (Produto produto){
        System.out.println("-----------------------");
        System.out.println("Relatório do Produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Valor: "+ produto.getValor());
        System.out.println("Imposto: "+ imposto);
        if (produto instanceof Tomate){
            System.out.println("Data de validade: "+((Tomate) produto).getData());
        }
    }
}

