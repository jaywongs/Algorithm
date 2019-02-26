package chapter4;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by jaywangs on 2019/2/24
 */
public class T41_MedianOfStream {
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

    /**
     * 插入一个数
     *
     * @param num 数
     */
    public void Insert(Integer num) {
        if (maxHeap.isEmpty() || maxHeap.peek() > num){
            maxHeap.offer(num);
            if (maxHeap.size() - minHeap.size() > 1)
                minHeap.offer(maxHeap.poll());
        }else {
            minHeap.offer(num);
            if (minHeap.size() - maxHeap.size() > 1)
                maxHeap.offer(minHeap.poll());
        }
    }

    /**
     * 获取中位数
     *
     * @return 中位数
     */
    public Double Getmedian(){
        int size1 = maxHeap.size();
        int size2 = minHeap.size();
        if (size1 > size2) {
            return (double) maxHeap.peek();
        }
        if (size1 < size2) {
            return (double) minHeap.peek();
        }

        return (maxHeap.peek() + minHeap.peek()) / 2.0;

    }

}