import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double raio;
        double area;
        double pi = 3.14159;

        System.out.println("Digite o valor do raio");
        raio = scanner.nextDouble();

        area = raio * raio * pi;

        System.out.printf("Raio: %.4f", area);

    }
}
