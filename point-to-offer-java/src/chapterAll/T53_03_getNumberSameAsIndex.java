package chapterAll;

/**
 * Created by jaywangs on 2019/2/27
 */
public class T53_03_getNumberSameAsIndex {

    public int getNumberSameAsIndex(int [] nums){
        if (nums == null || nums.length == 0) return -1;
        return binSearch(nums);
    }

    private int binSearch(int[] nums){
        int l = 0, h = nums.length;
        while (l < h){
            int m = l + (h - l) / 2;
            if (nums[m] == m) return m;
            else if (nums[m] > m) h = m;
            else l = m + 1;
        }
        return -1;
    }
}
