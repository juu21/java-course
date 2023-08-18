import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//instanciando scanner

        System.out.println("Digite o primeiro numero: ");//escrevendo no terminal
        int num1 = scanner.nextInt();//utilizando scanner para leitura

        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        int resultado = num1 + num2;

        System.out.printf("Resultado: %d ", resultado);


    }
}


