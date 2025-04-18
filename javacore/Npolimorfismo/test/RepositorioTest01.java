package aprendizadodevdojo.devdojo.javacore.Npolimorfismo.test;

import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;
import aprendizadodevdojo.devdojo.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio respositorio = new RepositorioMemoria();
        respositorio.salvar();
        List <String> list= new ArrayList<>();
        list.add("Gabriel");
        list.add("Fernanda");
        list.add("Joao");
        list.add("Bernando");
        System.out.println(list);
    }
}
