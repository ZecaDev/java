package aprendizadodevdojo.devdojo.javacore.Npolimorfismo.servico;

import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando arquivo...");
    }
}
