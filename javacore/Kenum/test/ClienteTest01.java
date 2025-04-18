package aprendizadodevdojo.devdojo.javacore.Kenum.test;

import aprendizadodevdojo.devdojo.javacore.Kenum.dominio.Cliente;
import aprendizadodevdojo.devdojo.javacore.Kenum.dominio.TipoCliente;
import aprendizadodevdojo.devdojo.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("gabriel", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Fernanda", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calculoDesconto(100.0));
        System.out.println(TipoPagamento.CREDITO.calculoDesconto(100.0));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);

        TipoCliente tipoCliente1 = TipoCliente.buscaPorRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente1);

    }
}
