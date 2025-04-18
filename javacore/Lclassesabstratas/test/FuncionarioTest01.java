package aprendizadodevdojo.devdojo.javacore.Lclassesabstratas.test;

import aprendizadodevdojo.devdojo.javacore.Lclassesabstratas.domain.Desenvolvedor;
import aprendizadodevdojo.devdojo.javacore.Lclassesabstratas.domain.Funcionario;
import aprendizadodevdojo.devdojo.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Fernanda", 600000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Gabriel", 94929);
        System.out.println(desenvolvedor);
    }
}
