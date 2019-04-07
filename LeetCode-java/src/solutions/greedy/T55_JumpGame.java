package solutions.greedyAlgorithm;

/**
 * Created by jaywangs on 2019/4/7
 */
public class T55_JumpGame {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos){
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}
