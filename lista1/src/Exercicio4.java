import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu numero: ");
        int numero = scanner.nextInt();

        System.out.println("Digite sua carga horaria de trabalho: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite quanto recebe por hora: ");
        double valorPorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("Salario= %.2f", salario);

        System.out.printf("\nNumero= %d", numero);
    }
}
