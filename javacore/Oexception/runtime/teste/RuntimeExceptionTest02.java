package aprendizadodevdojo.devdojo.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }
    private  static int divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Argumento ilegal, nao pode ser igual a 0");
        }
        return a/b;
//        try {
//            return a/b;
//        }catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//        return 0;
    }
}
