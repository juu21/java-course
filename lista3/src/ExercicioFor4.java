import java.util.Scanner;

public class ExercicioFor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println("Digite os numeros: ");
        for (int i = 0; i < N; i++) {

            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            double divisao = num1 / num2;

            if (num1 < 0) {
                System.out.println("Divisao impossivel");
            }
            else {
                System.out.printf("%.1f\n", divisao);
            }
        }

        sc.close();

    }
}
