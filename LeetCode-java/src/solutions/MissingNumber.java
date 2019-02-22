package solutions;

import java.util.Arrays;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 **/
public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != n) break;
            n++;
        }
        return n;
    }

    //better solution
    public int missingNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i ++) {
            result += i;
            result -= nums[i];
        }
        result += nums.length;
        return result;
    }
}

