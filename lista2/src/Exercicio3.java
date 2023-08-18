import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite o primeiro numero: ");
        a = sc.nextInt();

        System.out.println("\nDigite o segundo numero: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0 ){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

    }
}
