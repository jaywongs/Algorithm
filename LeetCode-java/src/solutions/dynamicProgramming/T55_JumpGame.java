package solutions.dynamicProgramming;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/4/7
 */

enum Index {
    GOOD, BAD, UNKNOWN
}
public class T55_JumpGame {

    public boolean canJump(int[] nums) {
        Index [] memo = new Index[nums.length];
        Arrays.fill(memo, Index.UNKNOWN);
        memo[nums.length - 1] = Index.GOOD;

        for (int i = memo.length - 2; i > 0; i--) {
            int furthest = Math.min(i + nums[i], memo.length - 1);
            for (int j = i + 1; j <= furthest; j++) {
                if (memo[j] == Index.GOOD){
                    memo[i] = Index.GOOD;
                    break;
                }
            }
        }
        return memo[0] == Index.GOOD;
    }
}
