package aprendizadodevdojo.devdojo.aluno;

public class ExercicioProposto10 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[1];
        arrayInt[1] = new int[2];
        arrayInt[2] = new int[3];


        int[][] arrayInt2 = {{1, 2 , 3}, {2 ,3 ,4, 5}, {3, 4 ,5, 6, 7}};


        for (int[] arrayBase : arrayInt2){
            System.out.println("\n---------");
            for (int num: arrayBase){
                System.out.print(num);
            }

        }

    }
}
