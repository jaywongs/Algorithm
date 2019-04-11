package chapter4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaywangs on 2019/2/26
 */
public class T50_01_FirstNotRepeatingChar {
    public static Character FirstNotRepeatingChar(String s) {
        if (s == null || s.length() == 0) return null;

        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            if (hashMap.containsKey(s.charAt(i)))
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            else
                hashMap.put(s.charAt(i), 1);
        }

        for (int i = 0; i < s.length(); ++i){
            if (hashMap.get(s.charAt(i)) == 1)
                return s.charAt(i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("abaccdeff"));
    }
}
