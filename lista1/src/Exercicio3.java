import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = scanner.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int c = scanner.nextInt();

        System.out.println("Digite o quarto numero: ");
        int d = scanner.nextInt();

        int diferencaProduto = (a * b - c * d);

        System.out.printf("Diferença: %d", diferencaProduto);
    }
}
