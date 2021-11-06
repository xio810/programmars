import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // 이차원배열 값넣기
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                System.out.print(arr[i][j] + "/");
            }
        }
        System.err.println("");
        System.out.println("arr : " + arr[1][2]);
        System.out.println("arr.length : " + arr.length);

        // 선언
        int[][] arr2 = new int[5][5];

        arr2[0][1] = 3;
        System.out.println(arr2[0][1]);
    }
}
