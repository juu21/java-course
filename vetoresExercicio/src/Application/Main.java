package Application;

import Entities.Aluguel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluguel[] vetor = new Aluguel[10];

        System.out.print("Quantos quartos vão ser alugados? ");
        int n  = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("RENT #" + i + ": ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            Aluguel aluguel = new Aluguel(nome, email);

            vetor[numeroQuarto] = aluguel;
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i=0; i<10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }

    }
}