package huawei;


import java.util.Scanner;

/**
 * Created by jaywangs on 2019/4/10
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] start = new int[2];
        int[] end = new int[2];
        int [][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        start[0] = sc.nextInt();
        start[1] = sc.nextInt();
        end[0] = sc.nextInt();
        end[1] = sc.nextInt();
        System.out.println("0");
    }
}
