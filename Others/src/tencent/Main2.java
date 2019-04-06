package tencent;

import java.util.Scanner;

/**
 * Created by jaywangs on 2019/4/5
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char [] chars = str.toCharArray();
        int sum0 = 0, sum1 = 0;
        for (int i = 0; i < n; i++){
            if (chars[i] == '0')
                sum0 ++;
            else
                sum1 ++;
        }
        System.out.println(Math.abs(sum0 - sum1));
    }
}
