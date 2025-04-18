package aprendizadodevdojo.devdojo.javacore.Vio.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    // File
    // FileWriter
    // FileReader
    // BufferedWriter
    // BufferedReader
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)){
            fw.write("A Fernanda é linda, e a melhor do mundo");
            fw.flush();
        }catch (IOException ex){
                ex.printStackTrace();
        }
    }
}
