import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;
        double y;

        System.out.println("Digite o primeiro numero: ");
        x = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        sc.close();
    }
}
