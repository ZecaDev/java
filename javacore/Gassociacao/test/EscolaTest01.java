package aprendizadodevdojo.devdojo.javacore.Gassociacao.test;

import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Escola;
import aprendizadodevdojo.devdojo.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Fernanda");
        Professor professor2 = new Professor("Gabriel");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Federal", professores);

        escola.imprime();
    }
}
