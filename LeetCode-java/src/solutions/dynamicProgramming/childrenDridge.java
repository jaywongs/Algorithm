package solutions.dynamicProgramming;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/4/5
 */

/**
 * 在一个夜黑风高的晚上，有n（n <= 50）个小朋友在桥的这边，现在他们需要过桥，但是由于桥很窄，
 * 每次只允许不大于两人通过，他们只有一个手电筒，所以每次过桥的两个人需要把手电筒带回来，i号
 * 小朋友过桥的时间为T[i]，两个人过桥的总时间为二者中时间长者。问所有小朋友过桥的总时间最短是多少。
 *
 **/
public class childrenDridge {

    public static int childrenDridge(int [] T){
        int []dp = new int[T.length];
        Arrays.sort(T);
        dp[0] = T[0];
        dp[1] = T[1];
        for (int i = 2; i < T.length; i++) {
            dp[i] = Math.min(dp[i - 1] + T[0] + T[i], dp[i - 2] + T[0] + T[1] * 2 + T[i]);
        }
        return dp[T.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(childrenDridge(new int[]{1,2,5,10}));
    }
}
