package others;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by jaywangs on 2019/3/14
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        int i = 0;
        for (;i < s.length(); i++){
            if (s.charAt(i) != '0')
                break;
        }
        int n = s.length();
        s = s.substring(i, n);
        PriorityQueue<BigInteger> maxHeap = new PriorityQueue<>((o1, o2)->(o2.compareTo(o1)));
        for (i = 0; i < s.length(); i ++) {
            for (int j = i + 1; j < s.length() + 1; j ++) {
                BigInteger num = new BigInteger(s.substring(i, j));
                maxHeap.offer(num);
                if (maxHeap.size() > k)
                    maxHeap.poll();
            }
        }

        System.out.println(maxHeap.peek());

    }

}
