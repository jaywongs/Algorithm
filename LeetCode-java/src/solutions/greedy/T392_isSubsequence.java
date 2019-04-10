package solutions.greedy;

/**
 * Created by jaywangs on 2019/4/2
 */
public class T392_isSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int i = 0, j = 0;
        while (j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
                if (i == s.length())
                    return true;
            }
            j++;
        }
        return i == s.length();
    }
}
