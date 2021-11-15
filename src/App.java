import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 27;

        Person p2 = new Person();
        p2.name = "홍길순";
        p2.age = 25;

        p1.introduce(); // 안녕하세요 27살 홍길동입니다.
        p2.introduce(); // 안녕하세요 25살 홍길순입니다.

        Student s1 = new Student();
        s1.name = "이순신";
        s1.math = 90;
        s1.korean = 87;
        s1.english = 77;

        s1.sum(); // 이순신의 총점은 254
        s1.avg(); // 이순신의 평균은 84.6

        Student s2 = new Student();
        s2.name = "임꺽정";
        s2.math = 70;
        s2.korean = 97;
        s2.english = 75;

        s2.sum(); // 임꺽정의 총점은 242
        s2.avg();
    }

}
