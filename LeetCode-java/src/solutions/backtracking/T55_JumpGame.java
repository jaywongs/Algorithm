package solutions.backtracking;

/**
 * Created by jaywangs on 2019/4/7
 */
public class T55_JumpGame {

    /**
     * 回溯法，复杂度高，超时
     **/
    public boolean canJump(int[] nums) {
        return canJumpFromPosition(0, nums);
    }

    public boolean canJumpFromPosition(int position, int[] nums) {
        if (position == nums.length - 1)
            return true;
        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int i = position + 1; i <= furthestJump; i++) {
            if (canJumpFromPosition(i, nums))
                return true;
        }
        return false;
    }

}