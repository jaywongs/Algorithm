package solutions.twoPointer;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by jaywangs on 2019/4/2
 */
public class T345_reverseVowels {
    private final static HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public String reverseVowels(String s) {
        char [] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j){
            if (set.contains(chars[i]) && set.contains(chars[j])) {
                swap(chars, i, j);
                i++;
                j--;
            }else if(!set.contains(chars[i])) i++;
            else if(!set.contains(chars[j])) j--;
        }
        return new String(chars);
    }

    private void swap(char [] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}
