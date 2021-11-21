import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.재공격();
        // // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // // 마크(가) 지팡이(으)로 공격합니다.
    }
}

class 전사 {
    String name;
    String weapon;

    void 공격(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;

        재공격();
    }

    void 재공격() {
        System.out.printf("%s(이)가 %s(으)로 공격합니다!\n", name, weapon);
    }
}
