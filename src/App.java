import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // gugu(2);
        // gugu2(8);
        iseven(2);
        int num1 = square(10);
        System.out.println(num1);
        int num2 = calc2(5);
        System.out.println(num2);
        int num3 = calc(12);
        System.out.println(num3);
    }

    // public static void gugu(int num) {
    // for (int i = 1; i < 10; i++) {
    // System.out.println(num + "*" + i + "=" + num * i);
    // }
    // System.out.println("=========");
    // };

    // public static void gugu2(int num) {
    // for (int i = 1; i <= num; i++) {
    // for (int j = 1; j < 10; j++) {
    // System.out.println(i + "*" + j + "=" + i * j);
    // }
    // System.out.println("======");
    // }
    // }
    public static boolean iseven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // public static void iseven(int num) {
    // if (num % 2 == 0) {
    // System.out.println("true");
    // } else {
    // System.out.println("false");
    // }
    // }

    public static int square(int num) {
        return num * num;
    }

    public static int calc2(int num) {
        int num_square = square(num);
        return num_square / 2;
    }

    public static int calc(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (iseven(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
