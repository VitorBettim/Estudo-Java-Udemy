import java.util.Scanner;
import java.util.Locale;
public class Ex2 {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A, pi = 3.14159;

        R = sc.nextDouble();
        A = pi * R * R;

        System.out.println("A = %.4f%n" + A);

        sc.close();
  }
}
