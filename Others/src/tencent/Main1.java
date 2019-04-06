package tencent;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by jaywangs on 2019/4/5
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int []arr = new int[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        if(arr[1] != 1) System.out.println(-1);

        int sum=0,ans=0;
        while(true){
            if(sum>=m){
                System.out.println(ans);
                return;
            }
            for(int i=n;i>=1;i--)   //从大到小
                if(arr[i] <= sum+1){
                    sum+=arr[i];
                    ans++;
                    break;
                }
        }
    }
}