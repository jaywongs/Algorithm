package chapter4;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jaywangs on 2019/3/6
 */
public class T41_02_firstAppearingOnce {
    private int[] cnts = new int[256];
    private Queue<Character> queue = new LinkedList();

    public void insert(char ch) {
        cnts[ch] ++;
        queue.add(ch);
        while (!queue.isEmpty() && cnts[queue.peek()] > 1) {
            queue.poll();
        }
    }

    public char FirstAppearingOnce() {
        return queue.isEmpty() ? '#' : queue.peek();
    }
}
