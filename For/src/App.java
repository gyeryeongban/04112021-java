import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 구구단
        int N = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }

        // A+B - 3
        int A = sc.nextInt(), B = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(A + B);
        }
    }
}
