import java.util.Scanner;

public class ExercicioFor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Digite os numeros: ");
            double media1 = sc.nextDouble();

            double media2 = sc.nextDouble();

            double media3 = sc.nextDouble();

            media1 = media1 * 2;
            media2 = media2 * 3;
            media3 = media3 * 5;

            double media = (media1 + media2 + media3) / 10;

            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}
