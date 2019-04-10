package solutions;

/**
 * Created by jaywangs on 2019/4/8
 */

import java.util.Arrays;

/**
 * 给定一个无序的整数数组，找到最长的连续递增序列的开始下标和结束下标。
 * // 示例1: // 输入: [1,2,3,5,4] // 输出: 0,3
 * // 示例2: // 输入: [3,3,3,3,3] // 输出: 0,0
 **/
public class T670_findLengthOfLCIS {
    public static int[] longestContinueIncreasingSubSequence(int[] nums) {
        int [] res = new int[2];
        int start = 0, max = 0;
        int curMax = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]){
                curMax ++;
                if (curMax > max) {
                    max = curMax;
                    start = i - max;
                }
            }else {
                curMax = 1;
            }
        }
        res[0] = start;
        res[1] = start + max;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(longestContinueIncreasingSubSequence(new int[]{3,3,3,3})));
    }
}
