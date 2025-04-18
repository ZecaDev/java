package aprendizadodevdojo.devdojo.javacore.Hheranca.teste;

import aprendizadodevdojo.devdojo.javacore.Hheranca.domain.Endereco;
import aprendizadodevdojo.devdojo.javacore.Hheranca.domain.Funcionario;
import aprendizadodevdojo.devdojo.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("thudusbango thudusbago");
        endereco.setCep("23230-423");
        Pessoa pessoa = new Pessoa("fabio");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("joao");

        funcionario.setSalario(3000);

        pessoa.imprime();

        System.out.println("------------");

        funcionario.setCpf("2232321");
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
