package chapterAll;

/**
 * Created by jaywangs on 2019/2/28
 */
public class T56_01_findNumsAppearOnce {

    public  int[] findNumsAppearOnce (int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int[] res = new int[2];
        int xorRes = 0;
        for (int num : nums) {
            xorRes ^= num;
        }
        int index = indexOf1(xorRes);
        int res1 = 0, res2 = 0;
        for (int num :  nums){
            if (isBit1(num, index))
                res1 ^= num;
            else
                res2 ^= num;
        }
        res[0] = res1;
        res[1] = res2;
        return res;

    }

    private int indexOf1(int val) {
        int index = 0;
        while ((val & 1) == 0){
            val = val >> 1;
            ++index;
        }
        return index;
    }

    private boolean isBit1(int val, int index) {
        val = val >> index;
        return (val & 1) == 1;
    }

}
