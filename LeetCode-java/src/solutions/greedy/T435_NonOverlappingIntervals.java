package solutions.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by jaywangs on 2019/4/2
 */



public class T435_NonOverlappingIntervals {

    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals.length == 0) return 0;
        int cnt = 1;
//        Arrays.sort(intervals, Comparator.comparingInt(o -> o.end));
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.end - o2.end;
            }
        });

        int end = intervals[0].end;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < end){
                continue;
            }
            cnt++;
            end = intervals[i].end;
        }
        return intervals.length - cnt;
    }
}
