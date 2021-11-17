public class VendingMachine {

    int totalMoney = 0;
    Beverage[] beverages = new Beverage[3];

    // 생성자 - 자판기를 만들때 필요한 것들을 세팅(음료수)
    VendingMachine() {
        beverages[0] = new Beverage(1000, "콜라");
        beverages[1] = new Beverage(1200, "사이다");
        beverages[2] = new Beverage(800, "커피");
    }

    // 자판기 기능1 - 음료수 목록 제공
    void printAllBeverages() {

        for (int i = 0; i < beverages.length; i++) {
            System.out.println(i + "." + beverages[i].name + " : " + beverages[i].price);
        }
        // 출력 : 0.콜라 : 1000
        // 출력 : 1.사이다 : 1200
        // 출력 : 2.커피 : 800
    }

    // 자판기 기능2 - 금액 투입
    void setInputedMoney(int money) {
        totalMoney = totalMoney + money;
        System.out.println("현재 투입된 금액은 " + totalMoney + "원입니다.");
    }

    // 자판기 기능3 - 음료 제공
    String getBeverage(int no) {

        Beverage target = beverages[no];
        String beverageName = "";
        int remainderMoney = 0;

        // 잔액이 부족한 경우
        if (totalMoney < target.price) {
            System.out.println("잔액이 부족합니다.");
        } else {
            // 출력 : 사이다를 뽑으셨습니다.
            System.out.println(target.name + "를 뽑으셨습니다.");
            remainderMoney = totalMoney - target.price;
            totalMoney = remainderMoney;

            // 출력 : 잔액은 800원입니다.
            System.out.println("잔액은 " + remainderMoney + "원입니다.");

        }

        return target.name;
    }
}
