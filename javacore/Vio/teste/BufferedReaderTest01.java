package aprendizadodevdojo.devdojo.javacore.Vio.teste;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Pichau\\IdeaProjects\\PrimeiraAula\\file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {

             String linha;
             while ((linha = br.readLine()) != null){
                 System.out.println(linha);
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
