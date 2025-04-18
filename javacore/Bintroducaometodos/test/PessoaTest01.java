package aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.test;

import aprendizadodevdojo.devdojo.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("GabrielAmaFernanda");
        pessoa.setIdade(10);

        // pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
