package chapterAll;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by jaywangs on 2019/3/1
 */
public class T59_MaxInWindows {
    public static ArrayList<Integer> maxInWindows(int [] nums, int size) {
        ArrayList<Integer> resList = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2)->(o2 - o1));
        for (int i = 0; i < size; i ++)
            heap.add(nums[i]);
        for (int i = 0, j = i + size; j < nums.length; i++,j++){
            resList.add(heap.peek());
            heap.remove(nums[i]);
            heap.add(nums[j]);
        }
        return resList;
    }
}
