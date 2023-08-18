import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a;
        float b;
        float c;
        double pi = 3.14159;

        System.out.println("Digite os tres valor: ");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        float triangulo = (a * c) / 2;
        System.out.printf("Area do triangulo = %.3f", triangulo);

        double areaCirculo = (c * c * pi);
        System.out.printf("\nArea do circulo = %.3f", areaCirculo);

        double areaTrapezio = ( (a + b) * c) / 2;
        System.out.printf("\nArea do trapezio = %.3f", areaTrapezio);

        double areaQuadrado = (b * b);
        System.out.printf("\nArea quadrado = %.3f", areaQuadrado);

        double areaRetangulo = (a * b);
        System.out.printf("\nArea do retangulo = %.3f", areaRetangulo);

    }
}
