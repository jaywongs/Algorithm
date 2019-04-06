package others;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/4/1
 */

// 问题2：
// 给定一个无序的整数数组，找到最长的连续递增序列的开始下标和结束下标。
// 示例1:  输入: [1,2,3,5,4] // 输出: 0,3
// 示例2:  输入: [3,3,3,3,3] // 输出: 0,0
public class LengthOfLIS {
    public static int [] lengthOfLIS(int [] arr) {
        if (arr.length == 0)
            return new int [] {0,0};
        int start = 0;
        int curLen = 1;
        int maxLen = 1;
        int i = 0;
        for (; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                curLen++;
            }else {
                if (curLen > maxLen){
                    maxLen = curLen;
                    start = i - maxLen  + 1;
                }
                curLen = 1;
            }
        }
        if (curLen > maxLen){
            maxLen = curLen;
            start = i - maxLen + 1;
        }
        int [] res = new int [2];
        res[0] = start;
        res[1] = start + maxLen - 1;
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 5, 4, 3, 4, 5, 6, 7, 2, 9};
        System.out.println(Arrays.toString(lengthOfLIS(arr)));
    }
}
