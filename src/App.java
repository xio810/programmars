import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int result = 100;

        System.out.println(result += 5);
        System.out.println(result -= 5);
        System.out.println(result /= 5);
        System.out.println(result %= 5);
        System.out.println(result *= 2);

        System.out.println(result <<= 2);
        System.out.println(result |= 2);
        System.out.println(result &= 2);
        System.out.println(result >>>= 3);
        System.out.println(result >>= 2);

    }
}
