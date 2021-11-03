import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        String str = sc.nextLine();

        Integer answer = Integer.parseInt(str);

        System.out.println(answer);
        System.out.println("answer type : " + answer.getClass().getName());
    }
}
