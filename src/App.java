import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        사람[] 사람들 = new 사람[3];

        사람들[0] = new 사람();
        사람들[1] = new 사람();
        사람들[2] = new 사람();

        for (int i = 0; i < 사람들.length; i++) {
            사람들[i].Introduce();
        }
    }

}

class 사람 {
    void Introduce() {
        System.out.println("안녕하세요.");
    }
}
