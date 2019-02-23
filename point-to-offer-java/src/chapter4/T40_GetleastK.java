package chapter4;

/**
 * Created by jaywangs on 2019/2/23
 */
public class T40_GetleastK {
    private int partition(int[] arr, int low, int high) {
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

    public int[] GetLeastK(int[] arr, int K){
        int start = 0;
        int end = arr.length - 1;
        int [] res = new int[K];
        int index = partition(arr, start, end);
        while (index != K){
            if (index > K) {
                index = partition(arr, start, index - 1);
            }else {
                index = partition(arr, index + 1, end);
            }
        }
        for (int i = 0; i < K; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
