import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        class Solution {
            boolean solution(String s) {
                boolean answer = true;
                int cnt = 0;
                char ch = ' ';

                for (int i = 0; i < s.length(); i++) {
                    ch = s.charAt(i);
                    if (ch == 'p' || ch == 'P')
                        cnt++;
                    else if (ch == 'y' || ch == 'Y')
                        cnt--;
                }
                if (cnt != 0)
                    return false;
                return true;
            }
        }
    }
}
