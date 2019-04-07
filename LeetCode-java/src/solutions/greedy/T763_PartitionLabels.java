package solutions.greedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaywangs on 2019/4/6
 */
public class T763_PartitionLabels {
    public static List<Integer> partitionLabels(String s) {
        if (s == null || s.length() == 0)
            return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int start = 0, end = fartest(s, 0);
        while (end < s.length()) {
            int i = start;
            while (++i < end) {
                int newEnd = fartest(s, i);
                if (newEnd > end)
                    end = newEnd;
            }
            res.add(end - start + 1);
            start = end + 1;
            end = fartest(s, start);
        }
        return res;
    }

    private static int fartest(String s, int index){
        if (index > s.length())
            return s.length() - 1;
        int end = index;
        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(index))
                end = i;
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
}
