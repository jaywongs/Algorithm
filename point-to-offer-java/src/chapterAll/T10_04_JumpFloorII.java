package chapterAll;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/3/8
 */
public class T10_04_JumpFloorII {
    public int JumpFloorII(int target) {
        int [] dp = new int[target];
        Arrays.fill(dp, 1);
        for(int i = 1; i < target; i++) {
            for (int j = 0 ; j < i; j ++ ) {
                dp[i] += dp[j];
            }
        }
        return dp[target - 1];
    }
}
