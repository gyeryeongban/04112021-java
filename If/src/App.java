import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 두 수 비교하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");
        }

        // 시험 성적
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 윤년
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        // 사분면 고르기
        int x = sc.nextInt(), y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }

        // 알람 시계
        int H = sc.nextInt(), M = sc.nextInt();

        if (H >= 0 && H <= 23 && M >= 0 && M <= 59) {
            if (M - 45 < 0) {
                System.out.print((H - 1) + " " + (M - 45 + 60));
            } else if (M - 45 > 0) {
                System.out.println(H + " " + (M - 45));
            }
        }
        sc.close();
    }
}
