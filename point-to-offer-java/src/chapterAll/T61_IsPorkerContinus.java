package chapter4;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/3/1
 */
public class T61_IsPorkerContinus {
    public boolean isContinuous(int[] nums) {
        if (nums == null || nums.length < 5)
            return false;
        int n = nums.length;
        Arrays.sort(nums);
        int kings = 0;
        for (int num : nums){
            if (num == 0)
                kings ++;
        }
        for (int i = kings; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] == 0)
                return false;
            kings -= nums[i+1] - nums[i] - 1;
        }
        return kings >= 0;
    }
}
