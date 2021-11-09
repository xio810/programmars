import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // charAt() => string타입으로 받은 문자열을 char타입으로 한 글자만 받는 함수
        String str = "Hello World";
        System.out.println(str.charAt(0)); // H
        System.out.println(str.charAt(1)); // e

        String a = "0";
        int b = a.charAt(0); // 48
        b = a.charAt(0) - 48; // 0
        System.out.println(b);

        String len = "hello world";
        System.out.println(len.length());
    }
}
