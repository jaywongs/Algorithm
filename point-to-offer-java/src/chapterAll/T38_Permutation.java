package chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jaywangs on 2019/2/23
 */
public class T38_Permutation {
    public ArrayList<String> permutation(String str) {

        ArrayList<String> resList = new ArrayList<>();
        if (str == null || str.length() == 0)
            return resList;

        char [] chars = str.toCharArray();

        //  递归输出字符串排列
        permutationHelper(chars, 0, resList);
        Collections.sort(resList);
        return resList;
    }

    public void permutationHelper(char[] chars, int index, ArrayList<String> list){

        if (index == chars.length - 1) {
            list.add(new String(chars));
            return;
        }

        Set<Character> set = new HashSet<>();
        for (int i = index; i < chars.length; i++){
            if (!set.contains(chars[i])){
                set.add(chars[i]);
                swap(chars, i, index);
                permutationHelper(chars, index + 1, list);
                swap(chars, index, i);
            }
        }
    }

    private void swap(char[] chars, int x, int y) {

        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }
}
