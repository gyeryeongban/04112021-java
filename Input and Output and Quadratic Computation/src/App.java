import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Hello World
        System.out.println("Hello World!");

        // We love kriii
        System.out.println("강한친구 대한육군\n강한친구 대한육군");

        // 고양이
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");

        // 개
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("(0)\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");

        // A+B
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt();
        System.out.println(A + B);

        // A-B
        System.out.println(A - B);

        // A×B
        System.out.println(A * B);

        // A/B
        double a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a / b);

        // 사칙연산
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        // 나머지
        int a1 = sc.nextInt(), b1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.println((a1 + b1) % c1);
        System.out.println(((a1 % c1) + (b1 % c1)) % c1);
        System.out.println((a1 * b1) % c1);
        System.out.println(((a1 % c1) * (b1 % c1)) % c1);

        // 곱셈
        int x = sc.nextInt(), y = sc.nextInt();

        System.out.println(x * (y % 10)); // x * (y 일의 자리)
        System.out.println(x * (y % 100 / 10)); // x * (y 십의 자리)
        System.out.println(x * (y / 100)); // x * (y 백의 자리)
        System.out.println(x * y);
    }
}
