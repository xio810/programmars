import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        오리 a오리 = new 오리();
        a오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

    }

}

class 오리 {
    public void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 청둥오리 extends 오리 {

}

class 흰오리 extends 오리 {

}