import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        /* 수정가능지역 시작 */ /* 수정가능지역 끝 */
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // (/* 수정가능지역 시작 */ /* 수정가능지역 끝 */);
        // // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // (/* 수정가능지역 시작 */ /* 수정가능지역 끝 */);
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사 {
    void 공격(String name, String weapon) {
        System.out.println(name + "이(가) " + weapon + "(으)로 공격합니다.");
    }
}
