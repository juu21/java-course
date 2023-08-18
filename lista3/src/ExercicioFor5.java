import java.util.Scanner;

public class ExercicioFor5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int fatorial = 1;

        for (int i = 2; i <= N; i++) {

            fatorial *= i;
        }

        System.out.printf("%d\n", fatorial);

        sc.close();
    }
}


// 4!=4*3*2*1 = 24
// 4!=4*(4-1)*(4-2)*(4-3)
// N!=N*(N-I)*(N-I)*(N-I)
