package aprendizadodevdojo.devdojo.javacore.Qstring.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms");
    }
    public static void concatString (int tamanhho){
        String texto = "";
        for (int i = 0; i < tamanhho; i++){
            texto += i;
        }

    }public static void concatStringBuffer (int tamanhho){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanhho; i++){
            sb.append(i);
        }

    }
}
