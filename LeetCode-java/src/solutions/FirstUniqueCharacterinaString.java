package solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 **/
public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        Set set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (set.contains(c)) continue;
            for (int j = i+1; j < s.length(); j++) {
                if (c == s.charAt(j)){
                    set.add(c);
                    break;
                }
            }
            if (!set.contains(c)) return i;
        }
        return -1;
    }

    //better solutions
    public int firstUniqChar2(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
