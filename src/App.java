import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        무기 a무기 = new 칼();
        a무기.공격();
        무기 b무기 = new 활();
        b무기.공격();
    }
}

class 무기 {
    void 공격() {

    }
}

class 칼 extends 무기 {
    void 공격() {
        System.out.println("칼로 공격합니다.");
    }

}

class 활 extends 무기 {
    void 공격() {
        System.out.println("활로 공격합니다.");
    }
}