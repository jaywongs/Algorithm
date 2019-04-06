/**
 * Created by jaywangs on 2019/3/28
 */
public class MergeSort {
    static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
        if (start >= end) return;
        int len = end - start, mid = start + (len >> 1);
        int start1 = start, end1 = mid, start2 = mid + 1, end2 = end;
        merge_sort_recursive(arr, result, start1, end1);
        merge_sort_recursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }

    public static void merge_sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        merge_sort_recursive(arr, result, 0, len - 1);
    }

    private static int [] arr = {1,4,3,5,4,2,78,9};
    public static void main(String[] args) {
        merge_sort(arr);
        for (int i = 0; i < arr.length; i ++)
            System.out.print(arr[i] + " ");

    }
}