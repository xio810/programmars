public class VendingMachine {

    int inputedMoney = 0;

    String bev0 = "콜라";
    String bev1 = "사이다";
    String bev2 = "커피";

    int cost0 = 1000;
    int cost1 = 1200;
    int cost2 = 800;

    void setInputedMoney(int money) {
        inputedMoney = inputedMoney + money;
        System.out.println("현재 투입된 금액은 " + inputedMoney + "원입니다.");
    }

    void printAllBeverages() {
        System.out.println("0. " + bev0 + " : " + cost0);
        System.out.println("1. " + bev1 + " : " + cost1);
        System.out.println("2. " + bev2 + " : " + cost2);
    }

    String getBeverage(int num) {
        String target = null;
        int targetPrice = 0;

        if (num == 0) {
            target = bev0;
            targetPrice = cost0;
        } else if (num == 1) {
            target = bev1;
            targetPrice = cost1;
        } else {
            target = bev2;
            targetPrice = cost2;
        }

        if (inputedMoney >= targetPrice) {
            int balance = inputedMoney - targetPrice;
            System.out.println(target + "(을)를 뽑았습니다.");
            System.out.println("잔액은 " + balance + "원 입니다.");
            return target;
        } else {
            System.out.println("잔액부족");
            return null;
        }

    }
}
