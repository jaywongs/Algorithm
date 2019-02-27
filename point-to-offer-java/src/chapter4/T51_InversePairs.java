package chapter4;

/**
 * Created by jaywangs on 2019/2/27
 */
public class T51_InversePairs {
    private long cnt = 0;
    private int[] tmp;

    public int InversePairs(int [] nums) {
        tmp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1);
        return (int)(cnt%1000000007);
    }

    private void mergeSort(int [] nums, int l, int h) {
        if (h - l < 1) return;
        int m = l + (h - l ) / 2;
        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, h);
        merge(nums, l, m, h);
    }

    private void merge(int[] nums, int l, int m, int h){
        //todo
    }
}
