package solutions.dynamicProgramming;

/**
 * Created by jaywangs on 2019/4/9
 */
public class T152_MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for (int i = 1; i < n; i++) {
            int tmp = max;
            max = Math.max(max * nums[i], Math.max(min * nums[i], nums[i]));
            min = Math.min(tmp * nums[i], Math.min(min * nums[i], nums[i]));
            res = Math.max(max, res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-4,-3,-2,-1}));
    }
}
