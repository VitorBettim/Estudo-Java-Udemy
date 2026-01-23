import java.util.Scanner;
public class Ex1{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;
        System.out.println("Soma = " + soma);

        sc.close();
    }
}
