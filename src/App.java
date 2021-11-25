import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        Map<String, Integer> ages2 = new LinkedHashMap<>();
        ages2.put("철수", 22);
        ages2.put("유리", 23);
        ages2.put("맹구", 24);

        for (String 이름 : ages2.keySet()) {
            System.out.println(이름 + " : " + ages2.get(이름));

        }
    }
}
