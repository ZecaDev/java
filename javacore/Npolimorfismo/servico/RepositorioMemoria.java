package aprendizadodevdojo.devdojo.javacore.Npolimorfismo.servico;

import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;

import javax.sound.midi.Soundbank;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando memoria...");
    }
}
