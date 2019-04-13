package others;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/4/12
 */
public class bubbleSort {

    public static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        while (n-- > 0) {
            for (int i = 0; i <= n - 1; i++) {
                if (nums[i] > nums[i + 1])
                    swap(nums, i, i + 1);
            }
        }
        return nums;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int [] {3,1,1,3,5,9,7})));
    }

}
