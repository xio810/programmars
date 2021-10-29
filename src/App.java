import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n == (i * i)) {
                System.out.println("양의정수 제곱");
                System.out.println("원 제곱된 숫자" + i);
                System.out.println("+1 제곱된 숫자 리턴" + (i + 1) * (i + 1));
                break;
            } else
                System.out.println(-1);

        }

    }
}
