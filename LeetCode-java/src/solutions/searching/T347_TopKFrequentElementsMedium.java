package solutions.searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jaywangs on 2019/4/2
 */
public class T347_TopKFrequentElementsMedium {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int key :map.keySet()) {
            int frequency = map.get(key);
            if (buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        List<Integer> topK = new ArrayList<>();
        for (int i = buckets.length - 1 ; i > 0 && topK.size() <= k; i--) {
            if (buckets[i] == null)
                continue;
            if (buckets[i].size() < k - topK.size()){
                topK.addAll(buckets[i]);
            }
            else{
                topK.addAll(buckets[i].subList(0, k - topK.size()));
            }
        }
        return topK;
    }
}
