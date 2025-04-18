package aprendizadodevdojo.devdojo.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("carregando dados dos arquivos...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados da pasta...");
    }
}
