import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        class Solution {
            public boolean solution(String s) {
                if (s.length() == 4 || s.length() == 6) {
                    for (int i = 0; i < s.length(); i++) {
                        char ch = s.charAt(i);
                        if (ch < '0' || ch > '9')
                            return false;
                    }
                    return true;
                } else
                    return false;
            }
        }

    }
}
