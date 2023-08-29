package Application;
import Entities.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Digite o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do titular: ");
        String titular = sc.nextLine();
        System.out.println("Tem deposito inicial? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 'y') {
            System.out.println("Digite o deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }
        else {
            conta = new Conta(numero, titular);
        }

        System.out.println();
        System.out.print("Dados da conta: ");
        System.out.print(conta);

        System.out.println();
        System.out.print("Digite um valor para deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

    }
}