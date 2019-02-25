package chapter4;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/2/25
 */
public class T45_printMinNumber {
    private String printMinNumber(int [] nums){
        if (nums.length == 0 ||nums == null)
            return "";

        int n = nums.length;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = nums[i] + "";
        Arrays.sort(arr, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        String res = "";
        for (String str : arr)
            res += str;
        return res;
    }
}
