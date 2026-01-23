import java.util.Scanner;
import java.util.Locale;
public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble(); 
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) /  2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.println("TRIANGULO: %.3f%n" + triangulo);
        System.out.println("CIRCULO: %.3f%n" + circulo);
        System.out.println("TRAPEZIO: %.3f%n" + trapezio);
        System.out.println("QUADRADO: %.3f%n" + quadrado);
        System.out.println("RETANGULO: %.3f%n" + retangulo);

        sc.close();
    }
}
