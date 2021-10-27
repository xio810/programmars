import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // v1
        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        // v2
        if (num % 2 == 1) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }

        // v3 (프로그래머스 return때)
        // num % 2 == 0 ? "Even" : "Odd";
    }
}
