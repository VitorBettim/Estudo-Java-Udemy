import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N;
        N = sc.nextInt();
        if (N < 0) {
            System.out.println("NEGATIVO");
        }
        else{
            System.out.println("POSITIVO");
        }
        
        sc.close();
    }
}
