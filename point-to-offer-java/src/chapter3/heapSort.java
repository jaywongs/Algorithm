package chapter3;

/**
 * Created by jaywangs on 2019/3/24
 */
public class heapSort {
    public static void Sort(int [] arr){
        //1.构建大顶堆
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapAdjust(arr, i, arr.length);
        }

        //2.调整堆结构+交换堆顶元素与末尾元素
        for (int j = arr.length - 1; j > 0; j --){
            swap(arr, 0, j);
            heapAdjust(arr, 0, j);
        }

    }

    public static void heapAdjust(int [] arr, int i, int length) {
        int temp = arr[i];
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && arr[k] > arr[k + 1]) {
                k++;
            }
            if (arr[k] > arr[i]) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }

    public static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
