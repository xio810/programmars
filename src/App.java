import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        class Solution {
            public int solution(int num) {
                long number = num;
                int answer;

                for (answer = 0; answer < 500; answer++) {
                    if (number == 1)
                        return answer;
                    else {
                        if (number % 2 == 0)
                            number /= 2;
                        else
                            number = number * 3 + 1;
                    }
                }
                return -1;
            }
        }

    }
}
