package chapter4;

/**
 * Created by jaywangs on 2019/2/24
 */
public class T42_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int [] arr) {
        int n = arr.length;
        int max = 0;
        int[] res = new int[n];
        res[0] = arr[9];
        for (int i = 0; i < n; i++) {
            res[i] = res[i - 1] > 0 ? res[i - 1] + arr[i] : arr[i];
            max = Math.max(res[i], max);
        }
        return max;
    }
}
