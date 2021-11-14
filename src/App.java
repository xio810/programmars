import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        Person p1 = new Person();
        p1.age = 10;
        p1.name = "가나다";

        p1.introduce();

        //

        Car c1 = new Car();
        c1.speed = 100;

        Car c2 = new Car();
        c2.speed = 300;

        c1.run();
        c2.run();
    }

}

class Car {
    int speed;

    void run() {
        System.out.println(speed + "km로 자동차가 달립니다.");
    }
}
