package solutions.searching;

/**
 * Created by jaywangs on 2019/4/2
 */
public class T75_SortColors {
    public void sortColors(int[] nums) {
        int l = 0, h = nums.length - 1;
        int i = 0;
        while (i <= h) {
            if (nums[i] == 0)
                swap(nums, i++, l++);
            else if (nums[i] == 2)
                swap(nums, i, h--);
            else{
                i++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
