package chapter4;

/**
 * Created by jaywangs on 2019/3/8
 */
public class T11_minNumberInRotateArray {

    public int minNumberInRotateArray(int [] array) {
        if (array == null || array.length == 0)
            return 0;
        return BinarySearch(array, 0, array.length - 1);
    }

    private int BinarySearch(int [] arr, int l, int h) {
        while (l < h) {
            int m = l + (h - l) / 2;
            if (arr[l] == arr[m] && arr[m] == arr[h]){
                for(int i = l; i < h; i++){
                    if (arr[i] > arr[i+1])
                        return arr[i+1];
                }
                return arr[l];
            }
            else if (arr[m] < arr[h])
                h = m;
            else
                l = m + 1;
        }
        return arr[l];
    }
}
