package huawei;

import java.util.Scanner;

/**
 * Created by jaywangs on 2019/4/10
 */
public class cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int m = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(cowsproblems(m, k));
        }

    }

    private static int cowsproblems(int m, int k){
        if (k < 5)
            return m * (k + 1);
        int [] cow = new int[k + 1];
        cow[1] = m * 2;
        cow[2] = m * 3;
        cow[3] = m * 4;
        cow[4] = m * 5;
        for (int i = 5; i <= k; i++) {
            cow[i] = cow[i-1] + cow[i - 4];
        }
        return cow[k];
    }
}
