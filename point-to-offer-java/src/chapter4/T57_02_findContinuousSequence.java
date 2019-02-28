package chapter4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaywangs on 2019/2/28
 */
public class T57_02_findContinuousSequence {
    public static List<List<Integer>> findContinuousSequence(int num) {
        if (num < 3) return null;
        int left = 1, right = 2;
        List<List<Integer>> resList = new ArrayList<>();
        while (left < (num + 1) / 2) {
            int sum = 0, i = left;
            while (i <= right){
                sum += i;
                i++;
            }
            if (sum < num)
                right++;
            else if (sum > num)
                left++;
            else {
                List<Integer> list = new ArrayList<>();
                for (int j = left; j <= right; ++j)
                    list.add(j);
                resList.add(list);
                left++;
            }
        }
        return resList;
    }

    public static void main(String[] args) {
        System.out.println(findContinuousSequence(1000));
    }
}
