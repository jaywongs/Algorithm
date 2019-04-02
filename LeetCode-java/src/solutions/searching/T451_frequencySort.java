package solutions.searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jaywangs on 2019/4/2
 */
public class T451_frequencySort {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char ch : chars){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Character>[] buckets = new ArrayList[chars.length + 1];
        for (Character ch : map.keySet()){
            int frequency = map.get(ch);
            if (buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = buckets.length - 1; i >= 0; i--){
            if (buckets[i] == null) {continue;}
            for (char c : buckets[i]){
                for (int j = 0; j < i; j++){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
