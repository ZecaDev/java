package aprendizadodevdojo.devdojo.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPamento) {
        this.tipoCliente = tipoCliente;
        this.tipoPamento = tipoPamento;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagamento=" + tipoPamento +
                ", tipoClienteint=" + tipoCliente.VALOR +
                ", tipoRelatorio=" + tipoCliente.RELATORIO +
                '}';
    }
}
