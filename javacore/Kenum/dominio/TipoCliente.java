package aprendizadodevdojo.devdojo.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA (1, "Pessoa Fisica"),
    PESSOA_JURIDICA (2, "Pessoa Juridica");


    public static TipoCliente buscaPorRelatorio(String RELATORIO){
        for (TipoCliente tipoCliente : values()){
            if(tipoCliente.RELATORIO.equals(RELATORIO)){
                return tipoCliente;
            }
        }
        return null;
    }

    public final int VALOR;
    public final String RELATORIO;

    TipoCliente(int VALOR, String RELATORIO) {
        this.VALOR = VALOR;
        this.RELATORIO = RELATORIO;
    }
}
