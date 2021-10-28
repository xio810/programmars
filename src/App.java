import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = { 2, 4, 5, 6, 2, 33 };

        System.out.println("'======'");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] = x * (i + 1));
            // arr[0] = 4 * (0 + 1) => 4
            // arr[1] = 4 * (1 + 1) => 8
            // arr[2] = 4 * (2 + 1) => 12
        }

    }
}
