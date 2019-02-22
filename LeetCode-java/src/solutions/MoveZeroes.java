package solutions;
/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 **/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        //往前有几个0就往前移动几位
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                n++;
            }else {
                if (n > 0){
                    nums[i-n] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}
