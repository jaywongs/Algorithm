package chapter3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jaywangs on 2019/3/14
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                if (k - 1 < 2){
                    cnt++;
                    continue;
                }
                for (int j = 2; j <= k - 1; j ++) {
                    if (i % j != 0){
                        cnt ++;
                    }

                }
            }
        }
        System.out.println(cnt);

    }
}
