import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Q10818. 최소, 최대
        Scanner sc = new Scanner(System.in);

        // 정수의 개수 선언
        int number = sc.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        // 배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드
        Arrays.sort(array);

        // 최솟값과 최댓값 출력
        System.out.println(array[0] + " " + array[number - 1]);

        // Q2562. 최댓값
        int num = sc.nextInt();
        int[] arr = new int[9];
        
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[]);
    }
}
