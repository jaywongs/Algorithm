package solutions.others;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by jaywangs on 2019/4/21
 */
public class T739_DailyTemperatures {
    /**
     * Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days
     * you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.
     *
     * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1,
     * 4, 2, 1, 1, 0, 0].
     *
     * Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the
     * range [30, 100].
     **/
    public static int[] dailyTemperatures(int[] T) {
        for(int i = 0 ; i < T.length; i++) {
            int cnt = 0;
            int j;
            for (j = i + 1; j < T.length; j++){
                if (j == T.length - 1 && T[i] >= T[j]){
                    T[i] = 0;
                    break;
                }
                cnt++;
                if (T[i] < T[j]){
                    T[i] = cnt;
                    break;
                }else {
                    continue;
                }
            }
            if (j != T.length - 1)
                T[i] = cnt;
        }
        return T;
    }

    /**
     * better solution with stack
     **/
    public static int[] dailyTemperatures2(int[] T) {
        int[] ans = new int[T.length];
        Stack<Integer> stack = new Stack();
        for (int i = T.length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) stack.pop();
            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
