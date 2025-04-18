package aprendizadodevdojo.devdojo.aluno;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        byte dia = 10;
        switch (dia) {
            default:
                System.out.println("Opcao inválida");
                break;
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
        }
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
        }
//        int semana = 1;
//        switch (semana){
//            case 1, 7 {
//                System.out.println("final de semana!");
//                break;
//            } case 2, 3, 4 ,5 ,6 {
//                System.out.println("Dia útil");
//                break;
//            }
//        }
    }
}
