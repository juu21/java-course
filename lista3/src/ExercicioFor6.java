import java.util.Scanner;

public class ExercicioFor6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i <= N; i++){
            if (N % i == 0) {
                System.out.println(i);
        }
    }
        sc.close();
    }
}