package chapter4;

import java.util.ArrayList;

/**
 * Created by jaywangs on 2019/2/28
 */
public class T57_01_FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum){
        int start = 0, end =  array.length- 1;
        ArrayList<Integer> resList = new ArrayList<>();
        while (start < end){
            if (array[start] + array[end] == sum){
                resList.add(array[start]);
                resList.add(array[end]);
            }
            else if (array[start] + array[end] > sum)
                end --;
            else
                end ++;
        }

        return resList;
    }
}
