package solutions.array;

import java.util.Arrays;

/**
 * created by jaywang on 2019/4/28.
 */
public class T31_NextPermutation {
    /**
     * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
     *
     * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
     *
     * 必须原地修改，只允许使用额外常数空间。
     *
     * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
     * 1,2,3 → 1,3,2
     * 3,2,1 → 1,2,3
     * 1,1,5 → 1,5,1
     */

    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int i = nums.length - 1;
        while (i > 0 && nums[i] <= nums[i - 1])
            i--;
        if (i == 0){
            reverse(nums, 0, nums.length - 1);
            System.out.println(Arrays.toString(nums));
            return;
        }
        int j = i;
        while (j < nums.length){
            if (nums[i - 1] >= nums[j])
                break;
            else
                j++;
        }
        swap(nums, i - 1, j - 1);
        reverse(nums, i, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int [] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private static void reverse(int [] nums, int i, int j){
        while (i < j)
            swap(nums, i++, j--);
    }

    public static void main(String[] args) {
        nextPermutation(new int[]{1,2,3});
    }
}
