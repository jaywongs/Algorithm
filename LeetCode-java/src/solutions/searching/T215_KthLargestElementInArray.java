package solutions.searching;

import java.util.PriorityQueue;

/**
 * Created by jaywangs on 2019/4/2
 */
public class T215_KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 小顶堆
        for (int num: nums) {
            pq.add(num);
            if (pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
}
