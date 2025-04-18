package aprendizadodevdojo.devdojo.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FilteTest01 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorio = fileDiretorio.mkdir();
        System.out.println(isDiretorio);
        File fileArquivo = new File(fileDiretorio, "exemplo.txt");
        boolean isFilecreated = fileArquivo.createNewFile();


        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRemaned = fileArquivo.renameTo(fileRenamed);
        System.out.println(isRemaned);

        File diretorioRenamed = new File ("pasta2");
        boolean isDitorioRenomed = fileDiretorio.renameTo(diretorioRenamed);
    }
}
