package chapter4;

/**
 * Created by jaywangs on 2019/2/26
 */
public class T48_longestSubstringWithoutDuplication {
    public int GetLongestSubstringWithoutDuplication(String s){
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int n = chars.length;
        int [] res = new int[n];
        int [] t = new int[26];
        for (int i = 0; i < 26; i ++){
            t[i] = -1;
        }
        t[chars[0] - 'a'] = 0;
        res[0] = 1;
        int max = res[0];
        for (int i = 1; i < n; i++) {
            int index = t[chars[i] - 'a'];
            int d = i - index;
            if (d <= res[i - 1]) res[i] = d;
            else if (d > res[i - 1]) res[i] = res[i-1] + 1;
            t[chars[i] - 'a'] = i;
            max = Math.max(max, res[i]);
        }
        return max;
    }
}
