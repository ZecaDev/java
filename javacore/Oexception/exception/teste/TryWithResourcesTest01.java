package aprendizadodevdojo.devdojo.javacore.Oexception.exception.teste;

import aprendizadodevdojo.devdojo.javacore.Oexception.exception.dominio.Leitor1;
import aprendizadodevdojo.devdojo.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo() {
        try(Leitor1 l1 = new Leitor1();
            Leitor2 l2 = new Leitor2()) {

        }catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

