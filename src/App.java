import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        int[] arr = { 1, 2, 3, 4, };
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "/");
            sum += arr[i];
        }
        avg = sum / arr.length;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);

        /*
         * class Solution { public double solution(int[] arr) { double answer = 0;
         * double sum = 0;
         * 
         * for (int i = 0; i < arr.length; i++) { sum += arr[i]; } answer = sum /
         * arr.length; return answer; } }
         */

    }
}
