package chapter4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaywangs on 2019/2/28
 */
public class T57_02_findContinuousSequence {
    public static ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
//        if (num < 3) return null;
//        int left = 1, right = 2;
//        List<List<Integer>> resList = new ArrayList<>();
//        while (left < (num + 1) / 2) {
//            int sum = 0, i = left;
//            while (i <= right){
//                sum += i;
//                i++;
//            }
//            if (sum < num)
//                right++;
//            else if (sum > num)
//                left++;
//            else {
//                List<Integer> list = new ArrayList<>();
//                for (int j = left; j <= right; ++j)
//                    list.add(j);
//                resList.add(list);
//                left++;
//            }
//        }
//        return resList;
        if (sum < 3) return null;
        int i = 1, j = 2;
        ArrayList<ArrayList<Integer> >  res = new ArrayList<>();
        while (i < j && i <= (sum >> 1)) {
            int curSum = ((i + j)* (j - i + 1) / 2);
            if (curSum < sum)
                j++;
            else if(curSum > sum)
                i++;
            else{
                ArrayList<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++)
                    list.add(k);
                res.add(list);
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findContinuousSequence(30));
    }
}
