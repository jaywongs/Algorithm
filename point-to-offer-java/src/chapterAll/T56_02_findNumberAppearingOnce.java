package chapter4;

/**
 * Created by jaywangs on 2019/2/28
 */
public class T56_02_findNumberAppearingOnce {
    public int findNumberAppearingOnce(int[] nums) {
        int[] bits = new int[32];
        for (int num : nums) {
            for (int j = 0; j < 32; ++j) {
                bits[j] += (num & 1);
                num = num >> 1;
            }
        }
        int res = 0;
        for (int i = 0; i < 32; ++i) {
            if (bits[i] % 3 != 0)
                res += Math.pow(2, i);
        }
        return res;

    }

}
