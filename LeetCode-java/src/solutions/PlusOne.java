package solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 **/
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int res[] = new int[n + 1];
        int i = n - 1;
        while (i >= 0) {
            if (digits[i] != 9){
                digits[i] = digits[i] + 1;
                return digits;
            }else {
                digits[i] = 0;
                if (i == 0) {
                    for (int j = 1; j < n+1; j++){
                        res[j] = digits[j-1];
                    }
                    res[0] = 1;
                }
            }
            i--;
        }
        return res;
    }

    public static void main(String[] args) {
        int digits[] = {4,3,2,9};
        int res[] = plusOne(digits);
        for (int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
