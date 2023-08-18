import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracaoJogo;

        System.out.println("Digite a hora inicial: ");
        horaInicial = sc.nextInt();

        System.out.println("Digite a hora final: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracaoJogo = horaFinal - horaInicial;
       } else {
            duracaoJogo = 24 - horaInicial + horaFinal;
        }
        System.out.printf("O JOGO DUROU %d HORAS", duracaoJogo);
    }
}
