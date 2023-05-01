import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite o numero: ");
        numero = sc.nextInt ();

        if (numero > 0){
            System.out.println("Positivo");
        }
        else if (numero < 0){
            System.out.println("Negativo");
        }
        sc.close();
    }
}