package chapterAll;

/**
 * Created by jaywangs on 2019/2/27
 */
public class T53_02_MissingNumber {
    public static int getMissingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return binSearch(nums);
    }

    private static int binSearch(int[] nums){
        int l = 0, h = nums.length;
        while (l < h){
            int m = l + (h - l) / 2;
            if (nums[m] <= m) l = m + 1;
            else if (nums[m] > m) h = m;
        }
        return l;
    }

    public static void main(String[] args) {
        int [] nums = {0};
        System.out.println(getMissingNumber(nums));
    }
}
