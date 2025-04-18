package aprendizadodevdojo.devdojo.aluno;

public class ExercicioProposto08 {
    public static void main(String[] args) {
        int[] diaMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] meses = {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int c = 0; c < meses.length; c++){
            System.out.println("No mes "+meses[c]+" Tem um total de "+diaMes[c]+" dias no mes");
        }
    }
}
