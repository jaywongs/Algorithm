package chapterAll;

/**
 * Created by jaywangs on 2019/4/11
 */
public class T3_duplicatedInArr {
    /**
     * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重
     * 复几次。请找出数组中任意一个重复的数字。
     *
     * Input:
     * {2, 3, 1, 0, 2, 5}
     *
     * Output:
     * 2
     **/

    public static int duplicate(int[] nums) {
        if (nums == null || nums.length <= 0)
            return -1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[nums[i]] == nums[i])
                    return nums[i];
                else
                    swap(nums, nums[i], i);
            }
        }
        return -1;
    }

    private static void swap(int [] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(duplicate(new int[] {2,3,3,0,2,5}));
    }
}
