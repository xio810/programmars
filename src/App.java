import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = 0;

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        System.out.println(answer);
    }
}
