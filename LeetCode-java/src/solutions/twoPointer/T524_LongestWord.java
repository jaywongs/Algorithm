package solutions.twoPointer;

import java.util.List;

/**
 * Created by jaywangs on 2019/4/2
 */
public class T524_LongestWord {
    public String findLongestWord(String s, List<String> d) {
        String LongestWord = "";
        for (String target : d) {
            if (LongestWord.length() > target.length() || (LongestWord.length() == target.length() && LongestWord.compareTo(target) < 0))
                continue;
            if (isInclude(s, target)){
                LongestWord = target;
            }
        }
        return LongestWord;
    }

    private boolean isInclude(String s1, String s2) {
        int i = 0, j = 0;
        while(i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)){
                j++;
            }
            i++;
        }
        return  j == s2.length();
    }
}
