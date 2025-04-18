package aprendizadodevdojo.devdojo.javacore.Vio.teste;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File ("C:\\Users\\Pichau\\IdeaProjects\\PrimeiraAula\\file.txt");
        try (FileReader fr = new FileReader(file)) {
//            char[] in = new char[30];
//            for (char c : in) {
//                System.out.print(c);
//            }
            int c;
            while ((c = fr.read()) != -1){
                System.out.print((char)c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
