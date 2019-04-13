package chapterAll;

/**
 * Created by jaywangs on 2019/2/23
 */
public class T39_MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null) return 0;
        int n = array.length;
        int start = 0, end = n - 1;
        int mid = n >> 1;
        int index = partition(array, start, n);
        while (index != mid) {
            if (index < mid) index = partition(array, index - 1, end);
            if (index > mid) index = partition(array, start, index + 1);
        }
        return array[index];
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && pivot <= arr[high]) --high;
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) ++low;
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }


    private void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public int MoreThanHalfNum_Solution2(int[] array) {
        int candidate = array[0];
        int times = 1;
        for (int i = 0; i < array.length; i++) {
            if (times == 0) {
                candidate = array[i];
                times++;
            } else if (array[i] == candidate) {
                times++;
            } else {
                times--;
            }
        }
        return candidate;
    }
}