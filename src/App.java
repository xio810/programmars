import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        ar.add(300);

        System.out.println(ar.get(0));
        System.out.println(ar.size());
        System.out.println(ar.get(1));

        ar.remove(2);
        System.out.println(ar.size());
    }
}

// class ArrayList {
// void add(int data) {
// }
// }