package tencent;

import java.util.Scanner;

/**
 * Created by jaywangs on 2019/4/4
 */
public class greedyChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double k = m / (Math.pow(2, n) - 1);
        int res = 0;
        if (k > (int) k) {
             res = (int)k + 1;
        }else {
            res = (int)k;
        }
        System.out.println((int)Math.pow(2, n-1) * res);
    }
}
