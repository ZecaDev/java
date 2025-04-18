package aprendizadodevdojo.devdojo.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calculoDesconto(Double valor) {
            return 0.1 * valor;
        }
    },CREDITO{
        @Override
        public double calculoDesconto(Double valor) {
            return 0.05 * valor;
        }
    };

    public abstract double calculoDesconto(Double valor);
}
