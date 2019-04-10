package tencent;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by jaywangs on 2019/4/5
 */
public class Main1 {

    /**
     * 第一题，你有n种不同面值的硬币，每种硬币有无数个，现在你有可能找零1-m的任意数值，
     * 问你最少带着多少枚的硬币能够应对所有找零的情况。如果无解输出-1
     **/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();
        int n = in.nextInt();

        int []coins = new int[n+1];

        for(int i=1; i<=n; i++){
            coins[i] = in.nextInt();
        }
        Arrays.sort(coins);
        if(coins[1] != 1)
            System.out.println(-1);

        int sum=0,ans=0;
        while(true){
            if(sum>=amount){
                System.out.println(ans);
                return;
            }
            for(int i=n;i>=1;i--)   //从大到小
                if(coins[i] <= sum+1){
                    sum+=coins[i];
                    ans++;
                    break;
                }
        }
    }
}