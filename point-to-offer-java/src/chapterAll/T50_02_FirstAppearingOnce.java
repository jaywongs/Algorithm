package chapter4;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaywangs on 2019/2/27
 */

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。如果当前字符流没有存在出现一次的字符，返回#字符。
 **/
public class T50_02_FirstAppearingOnce {

    private Map<Character, Integer> map = new HashMap<>();
    private StringBuilder sb = new StringBuilder();

    public void insert(char ch) {
        sb.append(ch);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    public Character FirstAppearingOnce(String s) {

        for (int i = 0; i < s.length(); ++i) {
            if (map.get(s.charAt(i)) == 1)
                return s.charAt(i);
        }
        return '#';
    }
}
