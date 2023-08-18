import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor;

        System.out.println("Digite o valor: ");
        valor = sc.nextDouble();

        if (valor > 0 && valor < 25){
            System.out.println("[0,25]");
        }
        else if (valor > 25 && valor < 50){
            System.out.println("[25,50]");
        }
        else if (valor > 50 && valor < 75){
            System.out.println("[50,75]");
        }
        else if (valor > 75 && valor < 100){
            System.out.println("[75,100]");
        }
        sc.close();
    }
}
